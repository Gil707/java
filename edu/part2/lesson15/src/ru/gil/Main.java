package ru.gil;

import java.io.File;
import java.io.IOException;
import static ru.gil.FilesFunctions.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        File src = new File("E:\\work\\java\\edu\\part2\\lesson15\\src\\ru\\gil\\src.txt");
        File pwd = new File("E:\\work\\java\\edu\\part2\\lesson15\\src\\ru\\gil\\pwd.txt");
        File dst = new File("E:\\work\\java\\edu\\part2\\lesson15\\src\\ru\\gil\\new.txt");

        String path = "E:\\work\\java\\edu\\part2\\lesson15\\src\\ru\\gil\\splitted\\";
        File appended = new File("E:\\work\\java\\edu\\part2\\lesson15\\src\\ru\\gil\\splitted\\all.txt");

//        crypt(src, pwd, dst);
//        splitFile(src, 1024, path);
//        appendFiles(path, appended);
//        randomByte2File(dst);
//        randomF(src, dst);

        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Введите строку поиска: ");
        str = sc.nextLine();

        findString(src, str);

    }


}