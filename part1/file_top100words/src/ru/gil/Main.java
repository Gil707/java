package ru.gil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final String FILE_NAME = "D:\\work\\java\\file_top100words\\wp.txt";
    private static Map<String, Integer> sortedMap = new HashMap<String, Integer>();
    private static Map<String, Integer> top = new HashMap<String, Integer>();

    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .limit(100)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    private static void parse(String str) {
        String[] strs = str.toLowerCase()
                .replaceAll("\\p{Punct}", " ")
                .split(" ");
        for (String s : strs
                ) {
            Integer count;
            if ((count = top.get(s)) != null) {
                count++;
                top.replace(s, count);
            } else {
                if (!s.equals("")) {
                    top.put(s, 1);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        long timeout= System.currentTimeMillis();

        Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8).forEach(Main::parse);

        sortedMap = sortByValue(top);

//        for (Map.Entry e : sortedMap.entrySet()) {
//            if (c <= 100) {
//                System.out.println(c + " : '" + e.getKey() + "' : " + e.getValue() + " повторений");
//                c++;
//            } else break;
//
//        }

        sortedMap.forEach((K, V) -> System.out.println(K + " : " + V));

        timeout = System.currentTimeMillis() - timeout;

        System.out.println("\nВыполнено за : " + timeout + " ms");


    }
}