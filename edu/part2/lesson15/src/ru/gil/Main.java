package ru.gil;

import java.io.File;
import java.io.IOException;
import static ru.gil.CopyMain.crypt;

public class Main {

    public static void main(String[] args) throws IOException {

        File src = new File("D:\\work\\java\\lesson15\\src\\ru\\gil\\1234.txt");
        File pwd = new File("D:\\work\\java\\lesson15\\src\\ru\\gil\\pwd.log");
        File dst = new File("D:\\work\\java\\lesson15\\src\\ru\\gil\\new.txt");

//        String pass = "password";

	crypt(src, pwd, dst);

    }
}
