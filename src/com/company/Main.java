package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static String[] strings;
    public static void main(String[] args){
//          set();
//        System.out.println(new GemStone().numberOfMinerals(strings));
        //System.out.println(new MysteryLoveLetter().minimum("abc"));
        //Arrays.fill(strings,"ajay");
//        HashMap<String,Integer> hashMap= new HashMap<>();
//        Arrays.asList(strings).stream()
//                .distinct()
//                .sorted()
//                .map(s -> {
//                    hashMap.put(s,(int)new MysteryLoveLetter().minimum(s));
//                    return s;
//                })
//                .forEach(System.out::print);
//        hashMap.entrySet()
//                .stream()
//                .map(e -> e.getValue())
//                .forEach(System.out::println);
//        System.out.println(new PalindromeIndex().palindromeIndex("bcba"));
        System.out.println(new Anagram().gameOfThrones("cdefghmnopqrstuvw"));
    }






    private static void set() {
        List<String> list=new ArrayList<>();
        try {
            list=Files.lines(new File(System.getProperty("user.dir")+"/src/com/company/input.txt").toPath())
                    .map(s -> s.trim())
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.toList());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        strings=list.toArray(new String[list.size()]);list.clear();
    }

}
