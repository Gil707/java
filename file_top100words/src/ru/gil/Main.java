package ru.gil;

import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final String FILE_NAME = "D:\\work\\java\\file_top100words\\lt2.txt";
    private static List<String> book = new ArrayList<>();
    private static List<String> pack = new ArrayList<>();
    private static Map<String, Integer> treeMap = new HashMap<String, Integer>();
    private static Map<String, Integer> sortedMap = new HashMap<String, Integer>();
    private static int cnt = 0;
    private static int c = 1;

//    public static int searchWord(String message, String word) {
//        message = message.toLowerCase();
//        word = word.toLowerCase();
//        int i = message.indexOf(word);
//        int count = 0;
//        while (i >= 0) {
//            count++;
//            i = message.indexOf(word, i + 1);
//        }
//        return count;
//    }
//

    public static List divideWords(String s) {
        ArrayList<String> tmp = new ArrayList<String>();
        int i = 0;
        s = s.toLowerCase();
        s = s.replaceAll("на", " ");
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ' || s.charAt(j) == ',' || s.charAt(j) == '.' || s.charAt(j) == '-' || s.charAt(j) == 'и' || s.charAt(j) == 'в') {
                if (j > i && s.substring(i, j).length() > 3) {
                    tmp.add(s.substring(i, j));
                }
                i = j + 1;
            }
        }
        if (i < s.length() && s.substring(i).length() > 3) {
            tmp.add(s.substring(i));
        }
        return tmp;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public static void main(String[] args) throws IOException {

        Stream<String> stream = Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
        book = stream.collect(Collectors.toList());



//        book.forEach(System.out::println);

        for (String items: book                 // создаем коллекцию из слов
                ) {
            pack.addAll(divideWords(items));
        }
//        System.out.println(pack.get(3466));

        pack.forEach(item -> {
//            System.out.println("Слово '" + item +"' : " + Collections.frequency(pack, item) + " раз");
            if (!treeMap.containsKey(item)) {
                treeMap.put(item, Collections.frequency(pack, item));
            }
        });

        sortedMap = sortByValue(treeMap);

//
//        for (int i = 0; i < pack.size(); i++) {
//            for (int j = 0; j < pack.size(); j++) {
//                if (pack.get(i).equals(pack.get(j)))
//                    c++;
//            }
//            treeMap.put(c, pack.get(i));
//            c = 0;
//        }
//
//        System.out.println(treeMap);


//
//        for (String find : pack) {
//            System.out.println("Количество вхождений элемента " + find + " = " + searchWord(book.toString(), find));
//            cnt1 += searchWord(book.toString(), find);
//            treeMap.put(cnt1, find);
//        }
//
        for (Map.Entry e : sortedMap.entrySet()){
            if (c <= 50) {
                System.out.println(c + " : " + e.getKey()+" "+ e.getValue());
                c++;
            }
            else break;

        }
////        book.forEach(System.out::println);
//
//
////        System.out.println("Кол-во элементов 'BMW' : " + cnt);
//            System.out.println("Кол-во слов = " + pack.size() + " --- коллекция: " + pack.toString() + "\n");
////        System.out.println(book.toString() + "\n");

    }
}