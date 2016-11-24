package ru.gil;

import java.io.*;
import java.nio.file.Files;

public class Main {

    private final static String FILE = "D:\\work\\java\\0bit_count\\src\\wp.txt";
    public static long count = 0;

    public static void main(String[] args) throws IOException {
        long time = System.currentTimeMillis();

        InputStream stream = new BufferedInputStream(new FileInputStream(FILE));

        byte[] buffer = new byte[256000];

        int bufferSize = 256000;

        while(stream.available() > 0){
            stream.read(buffer, 0 , bufferSize);
            countArr(buffer);
        }

        stream.close();

        long checkout = System.currentTimeMillis();

        System.out.println("Time: "+ (checkout - time) + " ms");
        System.out.println("Количество нулевых бит: " + count);
    }

    public static void countArr(byte[] b) {
        for (int i = 0; i < b.length; i++) {
            if(b[i] != 0) count += (8 - Integer.bitCount(b[i]));
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
        }
    }
}
