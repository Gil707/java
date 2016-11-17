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

    private static final String FILE_NAME = "E:\\work\\java\\file_top100words\\2.txt";
    private static List<String> book = new ArrayList<>();
    private static List<String> pack = new ArrayList<>();
    private static Map<Integer, String> treeMap = new TreeMap<Integer, String>();
    private static int cnt = 0;
    private static int c = 0;

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

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ' || s.charAt(j) == ',' || s.charAt(j) == '.') {
                if (j > i) {
                    tmp.add(s.substring(i, j));
                }
                i = j + 1;
            }
        }
        if (i < s.length()) {
            tmp.add(s.substring(i));
        }
        return tmp;
    }

    public static void main(String[] args) throws IOException {

        Stream<String> stream = Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
        book = stream.collect(Collectors.toList());




//        book.forEach(System.out::println);


        for (String items: book                 // создаем коллекцию из слов
             ) {
            pack.addAll(divideWords(items));
        }

        for (int i = 0; i < pack.size(); i++) {
            for (int j = 0; j < pack.size(); j++) {
                if (pack.get(i).equals(pack.get(j)))
                    c++;
            }
            treeMap.put(c, pack.get(i));
            c = 0;
        }

        System.out.println(treeMap);
//

//
//        for (String find : pack) {
//            System.out.println("Количество вхождений элемента " + find + " = " + searchWord(book.toString(), find));
//            cnt1 += searchWord(book.toString(), find);
//            treeMap.put(cnt1, find);
//        }
//
//        for (Map.Entry e : treeMap.entrySet()){
//
//            System.out.println(e.getKey()+" "+ e.getValue());
//
//        }
////        book.forEach(System.out::println);
//
//
////        System.out.println("Кол-во элементов 'BMW' : " + cnt);
//            System.out.println("Кол-во слов = " + pack.size() + " --- коллекция: " + pack.toString() + "\n");
////        System.out.println(book.toString() + "\n");

    }
}
