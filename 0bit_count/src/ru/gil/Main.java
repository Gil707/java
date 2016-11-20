package ru.gil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class Main {

    private final static String FILE = "D:\\work\\java\\0bit_count\\src\\wp.txt";
    private static byte[] buffer = new byte[256];
    private static int c = 0, k = 0;

    public static void main(String[] args) throws IOException {

        FileInputStream fs = new FileInputStream(FILE);
//        System.out.println(fs.available());
//        while (c > fs.available()) {
//            k += (8 - Integer.bitCount(fs.read(buffer, 0, 256)));
//            c += 256;
//        }
        long timeout= System.currentTimeMillis();

        for (int b = fs.read(); b >= 0; b = fs.read()) {
//            System.out.println(Integer.bitCount(b));
            k += (8 - Integer.bitCount(b));
            if (Integer.bitCount(b) == 8) {
            System.out.println((char)b + " : " + Integer.toBinaryString(b) + " : " + Integer.bitCount(b));
            }
        }

//        while (c <= fs.available()) {
//            k += (8-Integer.bitCount(fs.read()));
//            fs.skip(c);
//            System.out.println(c + " : " + (char)fs.read());
//            c++;
//        }
        timeout = System.currentTimeMillis() - timeout;

        System.out.println(k);
        System.out.println("\nВыполнено за : " + timeout + " ms");

    }
}
