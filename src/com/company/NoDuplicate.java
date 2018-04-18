package com.company;

import java.util.ArrayList;
import java.util.List;

public class NoDuplicate {
    public NoDuplicate(String org) {
        if (org.length() != 0 && org.length() <= 26) {
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                list.add((char) (i + 97));
            }
            StringBuffer buffer = new StringBuffer(org.toLowerCase());
            try {


                for (int i = 0; i < org.length(); i++) {
                    if (buffer.charAt(i) == ' ')
                        continue;
                    if (97 <= (int) buffer.charAt(i) && (int) buffer.charAt(i) <= 97 + 25) {
                        if (list.contains(buffer.charAt(i))) {
                            list.set(((int) (buffer.charAt(i))) - 97, null);
                        } else {
                            int j = (int) buffer.charAt(i) - 97;
                            Character c;
                            while ((c = list.get(j % 26)) == null) {
                                j++;
                            }
                            buffer.setCharAt(i, c);
                            list.set(j % 26, null);
                        }
                    } else {
                        throw new IllegalStateException(org + " Must have only Alphabets and space with total length not exceeding 26");
                    }
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
            System.out.println("The NoDuplicate String of " + org + " is " + buffer.toString().toUpperCase());
        }

    }

}
