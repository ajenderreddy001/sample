package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//between ([\w-]+)\|\|([\w-]+)
// in \{([\w-,]*)\}

public class Regex {
    public Regex(String search) {
        //name:fashion,created_at:12-05-2018||13-05-2018,status:published
        //([0-9a-zA-Z._]+?)(:|<|>|::)(\w+?),
        //(\w+)(:|<|>|::)([\w-|]+),
        search="name:fashion,created_at:12-05-2018||13-05-2018,status:published";
        String[] params=search.split(",");
        for(String param:params){
            String key=param.split(":")[0];
            String value=param.split(":")[1];

        }
        //(\w+)(:|<|>|::)([\w-|]+)
        Pattern pattern=Pattern.compile("(\\w+)(:|<|>|::|<>)([\\w-|]+|(?:\\{[\\w-,]+\\}))");
        Matcher matcher=pattern.matcher("name<>clothes,name<fashion,created_at:12-05-2018||13-05-2018,status:published,release_date:{12-05-2018}");

        int groupCount=matcher.groupCount();
        System.out.println("group count="+groupCount);
        while (matcher.find()){
        for(int i=0;i <= groupCount;i++){
            System.out.println(matcher.group(i));
        }}
    }
}
