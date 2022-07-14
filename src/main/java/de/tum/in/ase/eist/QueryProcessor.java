package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor { //test

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Noah";
        } else if (query.contains("what is")) { // TODO extend the programm here
            String[] str = query.split(" ");
            int num1 = Integer.parseInt(str[2]);
            int num2 = Integer.parseInt(str[4]);
            int res = num1 + num2;
            return Integer.toString(res);
        } else if (query.contains("which of")) {
            int loc = query.indexOf(":");
            String newquery = query.substring(loc + 2);
            String[] str = newquery.split(" ");
            return null;
        }
        return null;
    }
}
