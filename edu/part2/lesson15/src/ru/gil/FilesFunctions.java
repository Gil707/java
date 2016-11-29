package ru.gil;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by GilEO on 29.11.2016.
 */
public class FilesFunctions {

    public static void splitFile(File src, Integer size, String path) throws IOException {
        try (FileInputStream in = new FileInputStream(src)) {

            byte buf[] = new byte[size];

            int len;
            int i = 1;

            while ((len = in.read(buf)) > -1) {
                FileOutputStream out = new FileOutputStream(new StringBuilder().append(path).append("cut").append(i).append(".txt").toString());
                out.write(buf, 0, len);
                i++;
            }
        }
    }

    public static void appendFiles(String path, File dest) throws IOException {
        try (FileOutputStream out = new FileOutputStream(dest)) {

            File fst = new File(path);

            File cutfiles[] = fst.listFiles();

            for (int i = 0; i < cutfiles.length; i++) {
                FileInputStream in = new FileInputStream(cutfiles[i]);
                byte buffer[] = new byte[(int) cutfiles[i].length()];
//                System.out.print(in.available() + " ");
//                System.out.print((int) cutfiles[i].length() + " ");
//                System.out.println(in.read());
                in.read(buffer);
                out.write(buffer);
            }
        }

    }

    public static void randomByte2File(File src) throws IOException {
        try (FileOutputStream out = new FileOutputStream(src)) {
            Random r = new Random();
            byte[] arr = new byte[1024];
//            r.nextBytes(arr);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Byte.parseByte(String.valueOf(i % 4));
            }
            out.write(arr);
        }
    }

    public static void randomF(File src, File dst) throws IOException {
        RandomInputStream rin = new RandomInputStream(src);
        FileOutputStream rout = new FileOutputStream(dst);
        byte buffer[] = new byte[(int) rin.getChannel().size()];
        rin.read(buffer, 0, buffer.length);
//        for (int i = 0; i < buffer.length; i++) {
//            System.out.println(buffer[i]);
//        }
        rout.write(buffer);
    }

    public static void crypt(File src, File pwd, File dst) throws IOException {
        try (FileInputStream in = new FileInputStream(src);
             FileInputStream code = new FileInputStream(pwd);
             FileOutputStream out = new FileOutputStream(dst)) {


            byte buffer[] = new byte[1024];
            byte pass[] = new byte[(int) pwd.length()];
            int len;

            code.read(pass);

            while ((len = in.read(buffer)) > -1) {
                for (int i = 0, j = 0; i < len; i++, j++) {
                    if (j == pass.length) j = 0;
                    buffer[i] ^= pass[j];
                }
                out.write(buffer, 0, len);
            }
//            while ((len = in.read(buffer)) > -1) {
//
//                code.read(pass);
//                for (int i = 0; i < len; i++) {
//                    buffer[i] ^= pass[i];
//                }
//                out.write(buffer);
//            }
        }
    }

    public static void findString(File src, String str) throws IOException {

        try (BufferedReader fr = new BufferedReader(new FileReader(src))) {
            String line;
            int i = 0;
            while ((line = fr.readLine()) != null) {
                i++;
                if (line.contains(str)) {
                    System.out.println("(" + str + ") Строка №" + i + ": " + line);
                }
            }
        }
    }


}
