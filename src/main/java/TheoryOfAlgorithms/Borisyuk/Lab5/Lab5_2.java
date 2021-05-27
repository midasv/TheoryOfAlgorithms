/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Borisyuk.Lab5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Lab5_2 {
    private int modelsNumber;
    public LinkedList<Model> list;
    
    public Lab5_2(int modelsNumber)
    {
        this.modelsNumber = modelsNumber;
        list = new LinkedList<Model>();
    }
    
    public void InitList()
    {
        Random rd = new Random();
        list.clear();
        byte[] arr = new byte[modelsNumber];
        rd.nextBytes(arr);
        for (int i = 0; i < modelsNumber; i++)
            list.add(new Model("model #" + i, arr[i]));
    }
    
    public String DisplayList()
    {
        String s = "";
        Iterator<Model> itr = list.iterator();
        for (int i = 0; itr.hasNext(); i++) {
            s += i + ". " + itr.next() + "<br/>";
        }
        return s;
    }
    
    public int jumpSearch(String x)
    {
        int n = list.size();
 
        int step = (int)Math.floor(Math.sqrt(n));
 
        int prev = 0;
        while (list.get(Math.min(step, n)-1).getStringField().compareTo(x) < 0)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        
        while (list.get(prev).getStringField().compareTo(x) < 0)
        {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }

        if (list.get(prev).getStringField().equals(x))
            return prev;
 
        return -1;
    }
    
    public void Sort( Comparator<Model> comparator)
    {
        int listLength = list.size();
        sort(comparator, 0, listLength - 1);
    }
    void merge(Comparator<Model> comparator, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 

        List<Model> L = new ArrayList<>();
        List<Model> R = new ArrayList<>();

        for (int i = 0; i < n1; ++i)
           L.add( list.get(l + i));
        for (int j = 0; j < n2; ++j)
             R.add( list.get(m + 1 + j));
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (comparator.compare(L.get(i), R.get(j)) <= 0) {
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
    void sort(Comparator<Model> comparator, int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
 
            sort(comparator, l, m);
            sort(comparator, m + 1, r);
 
            merge(comparator, l, m, r);
        }
    }
    
    public void SortByStringField()
    {
        ByStringComparer comparator = new ByStringComparer();
        Sort(comparator);
    }
    
    public void SortByByteField()
    {
        ByByteComparer comparator = new ByByteComparer();
        Sort(comparator);
    }
}
