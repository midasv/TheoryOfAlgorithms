
<%@page import="TheoryOfAlgorithms.Borisyuk.Lab5.Lab5_2"%>
<%@page import="TheoryOfAlgorithms.Borisyuk.Lab5.Lab5_1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5</title>
    </head>
    <body>
        <a href="index.jsp">Back to landing page</a>
        <%! Lab5_1 lab5_1 = new Lab5_1("Alcoholism is, broadly, any drinking of"
            + " alcohol that results in significant mental or physical health problems."
            + " Alcoholism is not a recognized diagnostic entity. Predominant diagnostic"
            + " classifications are alcohol use disorder (DSM-5) or"
            + " alcohol dependence (ICD-11). Excessive alcohol use can damage"
            + " all organ systems, but it particularly affects the brain, heart,"
            + " liver, pancreas and immune system.[4][5] Alcoholism can result in"
            + " mental illness, delirium tremens, Wernicke–Korsakoff syndrome, irregular"
            + " heartbeat, an impaired immune response, liver cirrhosis and increased"
            + " cancer risk. Drinking during pregnancy can result in fetal alcohol"
            + " spectrum disorders. Women are generally more sensitive than men to"
            + " the harmful effects of alcohol, primarily due to their smaller body"
            + " weight, lower capacity to metabolize alcohol, and higher proportion"
            + " of body fat. In a small number of individuals, prolonged, severe"
            + " alcohol misuse ultimately leads to frank dementia. Environmental"
            + " factors and genetics are two factors affecting risk for alcoholism,"
            + " with about half the risk attributed to each. Someone with a parent or"
            + " sibling with alcoholism is three to four times more likely to become"
            + " an alcoholic themselves, but only a minority of them do. Environmental"
            + " factors include social, cultural and behavioral influences. High stress"
            + " levels and anxiety, as well as alcohol's inexpensive cost and easy"
            + " accessibility, increase the risk. People may continue to drink "
            + "partly to prevent or improve symptoms of withdrawal. After a person"
            + " stops drinking alcohol, they may experience a low level of"
            + " withdrawal lasting for months.[4] Medically, alcoholism is considered"
            + " both a physical and mental illness. Questionnaires are usually used"
            + " to detect possible alcoholism. Further information is then collected"
            + " to confirm the diagnosis. Prevention of alcoholism may be attempted"
            + " by regulating and limiting the sale of alcohol (particularly to minors),"
            + " taxing alcohol to increase its cost, and providing education and"
            + " inexpensive treatment. Prohibition did not work. Treatment of "
            + "alcoholism may take several forms. Due to medical problems that "
            + "can occur during withdrawal, alcohol detoxification should "
            + "be carefully controlled. One common method involves the use "
            + "of benzodiazepine medications, such as diazepam. These can be"
            + " either given while admitted to a health care institution or occasionally"
            + " while a person remains in the community with close supervision. Mental illness"
            + " or other addictions may complicate treatment. After detoxification, "
            + "various forms of individual or group therapy or support groups can help "
            + "keep a person from returning to drinking. One commonly used form of support"
            + " is the group Alcoholics Anonymous. The medications acamprosate, disulfiram"
            + " or naltrexone may also be used to help prevent further drinking. The World"
            + " Health Organization has estimated that as of 2016, there were 380 million"
            + " people with alcoholism worldwide (5.1% of the population over 15 years of"
            + " age). As of 2015 in the United States, about 17 million (7%) of adults and "
            + "0.7 million (2.8%) of those age 12 to 17 years of age are affected."
            + " Alcoholism is most common among males and young adults. Geographically, "
            + "it is least common in Africa (1.1% of the population) and has the highest"
            + " rates in Eastern Europe (11%). Alcoholism directly resulted in 139,000 "
            + "deaths in 2013, up from 112,000 deaths in 1990. A total of 3.3 million deaths"
            + " (5.9% of all deaths) are believed to be due to alcohol. Alcoholism reduces"
            + " a person's life expectancy by approximately ten years. Many terms,"
            + " some insulting and others informal, have been used to refer to people"
            + " affected by alcoholism; the expressions include tippler, drunkard, dipsomaniac"
            + " and souse. In 1979, the World Health Organization discouraged the use"
            + " of alcoholism due to its inexact meaning, preferring alcohol dependence syndrome");%>
            <p><b>Text:</b> <%= lab5_1.GetText()%></p>
            <form action="./lab5" method="post" class="form-inline">
                <label for="x"><b>Enter word to search for: </b></label>
                <div class="input-group">
                    <input  class="form-control" id="find" type="text" name="find"/>
                    <input class="btn btn-success" type="submit" value="Submit"/>
                </div>
                <p class="mt-3 mb-0"><b>Word number: </b><%=request.getAttribute("result")%></p>
            </form>
            <p><b>Most popular words:</b> <%= lab5_1.GetMostPopularWords()%></p>
            <p><b>Most popular sequences (4):</b>
                <%= lab5_1.MostPopularSequences(4)%></p>
            <%! Lab5_2 lab5_2 = new Lab5_2(20); %>
            <% lab5_2.InitList(); %>
            <p><b>List: </b><br/> <%= lab5_2.DisplayList()%></p>
            <%! String find = "model #1"; %>
            <% lab5_2.SortByStringField();%>
            <p><b>Sorted by string field: </b><br/> <%= lab5_2.DisplayList()%></p>
            <p><b>Index of element with value </b><%= find %>: <%= lab5_2.jumpSearch(find)%></p>
            <% lab5_2.SortByByteField();%>
            <p><b>Sorted by byte field: </b><br/> <%= lab5_2.DisplayList()%></p>
    </body>
</html>
