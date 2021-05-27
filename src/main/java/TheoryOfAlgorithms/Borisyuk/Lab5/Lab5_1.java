/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Borisyuk.Lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Lab5_1 {
    public static String text;
    private static String[] words;
    
    public Lab5_1(String text)
    {
        this.text = text;
        String textWithoutPunctuation = text;
        textWithoutPunctuation = textWithoutPunctuation.replace("!", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("?", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("\"", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(",", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(":", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("(", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(")", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("\"", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(".", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("'", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(";", "");
        textWithoutPunctuation = textWithoutPunctuation.toLowerCase();
        words = textWithoutPunctuation.split("\\s+");
    }
    
    public String GetText()
    {
        return text;
    }
    
    public static String FindWord(String word)
    {
        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        for (int i = 0; i < words.length; i++)
            dictionary.put(i, words[i]);
        List<Map.Entry<Integer, String>> list = new ArrayList<>(dictionary.entrySet());
        int listLength = list.size();
        Map.Entry<Integer, String> key;
        int j;
        for (int i = 1; i < listLength; i++) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0) {
                if (key.getValue().compareTo(list.get(j).getValue()) > 0) {
                  break;
                }
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }

        return Integer.toString(jumpSearch(list, word) + 1);
    }
    
     public static int jumpSearch(List<Map.Entry<Integer, String>> list, String x)
    {
        int n = list.size();
 
        int step = (int)Math.floor(Math.sqrt(n));
 
        int prev = 0;
        while (list.get(Math.min(step, n)-1).getValue().compareTo(x) < 0)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        
        while (list.get(prev).getValue().compareTo(x) < 0)
        {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }

        if (list.get(prev).getValue().equals(x))
            return list.get(prev).getKey();
 
        return -1;
    }
    
    public String GetMostPopularWords()
    {
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
           if(dictionary.containsKey(words[i]))
               dictionary.put(words[i], dictionary.get(words[i]) + 1);
           else
               dictionary.put(words[i], 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        Sort(list);
        Collections.reverse(list);
        return Arrays.toString(list.toArray());
    }
    
    public String MostPopularSequences(int length)
    {
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        int currentWordLength;
        String sequence;
        for (int i = 0; i < words.length; i++) {
            currentWordLength = words[i].length();
            for (int j = 0; j < currentWordLength - length; j++) {
                sequence = words[i].substring(j, j + length);
                if(dictionary.containsKey(sequence))
                    dictionary.put(sequence, dictionary.get(sequence) + 1);
                else
                   dictionary.put(sequence, 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        Sort(list);
        Collections.reverse(list);
        return Arrays.toString(list.toArray());
    }
    
    public void Sort( List<Entry<String, Integer>> list)
    {
        int listLength = list.size();
        sort(list, 0, listLength - 1);
    }
    void merge(List<Entry<String, Integer>> list, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 

        List<Entry<String, Integer>> L = new ArrayList<>();
        List<Entry<String, Integer>> R = new ArrayList<>();

        for (int i = 0; i < n1; ++i)
           L.add( list.get(l + i));
        for (int j = 0; j < n2; ++j)
             R.add( list.get(m + 1 + j));
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i).getValue() <= R.get(j).getValue()) {
                list.set(k, L.get(i));
                i++;
            }
            else {
                list.set(k, R.get(j));
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            list.set(k, L.get(i));
            i++;
            k++;
        }
 
        while (j < n2) {
            list.set(k, R.get(j));
            j++;
            k++;
        }
    }
    void sort(List<Entry<String, Integer>> list, int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
 
            sort(list, l, m);
            sort(list, m + 1, r);
 
            merge(list, l, m, r);
        }
    }
}
