package com.company;

import org.omg.CORBA.Environment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static String[] strings;
    public static void main(String[] args){
          set();
//        System.out.println(new GemStone().numberOfMinerals(strings));
        //System.out.println(new MysteryLoveLetter().minimum("abc"));
        //Arrays.fill(strings,"ajay");
        HashMap<Integer,String> hashMap= new HashMap<>();
        Arrays.asList(strings).stream()
                .map(s -> s.length())
                .distinct()
                .sorted()
                .map(integer -> {
                    hashMap.put(integer,"Ajay");
                return integer;
                })
                .forEach(System.out::print);
        Arrays.asList(strings).stream()
                .sorted()
                .forEach(System.out::println);
    }






    private static void set() {
        List<String> list=new ArrayList<>();
        try {
            list=Files.lines(new File(System.getProperty("user.dir")+"/src/com/company/input.txt").toPath())
                    .map(s -> s.trim())
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        strings=list.toArray(new String[list.size()]);list.clear();
    }

}
