<%-- 
    Document   : lab4
    Created on : 20 мая 2021 г., 17:03:13
    Author     : Ваня
--%>

<%@page import="lab4.TextProcessor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laboratorna 4</title>
    </head>
    <body>
       
         <%! TextProcessor textProcessor = new TextProcessor("The World Health Organization"
                 + " has estimated that as of 2016, there were 380 million people with alcoholism"
                 + " worldwide (5.1% of the population over 15 years of age)."
                 + " As of 2015 in the United States, about 17 million (7%) of adults and 0.7 million"
                 + " (2.8%) of those age 12 to 17 years of age are affected] Alcoholism is most"
                 + " common among males and young adults. Geographically, is is least common in "
                 + "Africa (1.1% of the population) and has the highest rates in Eastern Europe (11%)"
                 + ". Alcoholism directly resulted in 139,000 deaths in 2013, up from 112,000 deaths "
                 + "in 1990. A total of 3.3 million deaths (5.9% of all deaths) are believed to be "
                 + "due to alcohol. Alcoholism reduces a person's life expectancy by approximately"
                 + " ten years. Many terms, some insulting and others informal, have been used to "
                 + "refer to people affected by alcoholism; the expressions include tippler, drunkard,"
                 + " dipsomaniac and souse. In 1979, the World Health Organization discouraged the"
                 + " use of alcoholism due to its inexact meaning, preferring alcohol dependence syndrome,Warning signs"
                 + "Warning signs of alcoholism include the consumption of increasing amounts of alcohol and frequent"
                 + "intoxication, preoccupation with drinking to the exclusion of other activities, promises to quit drinking"
                 + " and failure toaddaw keep those promises, the inability to remember what was said or done while drinking"
                 + " (colloquially known as blackouts), personality changes associated with drinking, denial or the making "
                 + "of excuses for drinking, the refusal to admit excessive drinking, dysfunction or other problems at work"
                 + " or school, the loss of interest in personal appearance or hygiene, marital and economic problems, and "
                 + " the complaint of poor health, with loss of appetite, respiratory infections, or increased anxiety ");%>

                <p><b>Text:</b> <%= textProcessor.GetText()%></p>
                <p><b>Text:</b> <%= textProcessor.GetClearedText()%></p>
                <p><b>Number of words:</b> <%= textProcessor.GetWordsNumber()%></p>
                <p><b>Number of unique words:</b> <%= textProcessor.GetUniqueWordsNumber()%></p>
                <p><b>Most popular words(7):</b> <%= textProcessor.GetFirstNMostPopularWords(7)%></p>
                <p><b>Number of words that do not contain letter (r):</b>
                    <%= textProcessor.GetNumberOfWordsThatNotContain('r')%></p>
                <p><b>Number of words that contain 4 similar letters (4):</b>
                    <%= textProcessor.GetNumberOfWordsThatContainSimilarLetters(4)%></p>
                <p><b>Most popular sequences (4):</b>
                    <%= textProcessor.MostPopularSequences(4, 3)%></p>
    </body>
</html>
