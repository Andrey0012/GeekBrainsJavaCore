package ru.geekbrains.lesson3;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String [] arr = {"прпрр", "привет", "пока", "привет", "прощай", "пока", "привет", "хорошо", "плохо", "нет", "да", "нет", "ок"};
        Set<String> set = new HashSet<>();// (порядок не определ)
        for (String iVal : arr) {
           set.add(iVal);
        }
        System.out.println(set);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String str : arr) {
            int ctn = 0;
            for (String str2 : arr) {
                if (str.equals(str2)) {
                    ctn++;
                }
            }
            wordCount.put(str,ctn);
        }
        System.out.println(wordCount);
    }
}
