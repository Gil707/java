package ru.gil;

import java.io.*;

/**
 * Created by Gil on 28-Nov-16.
 */
public class CopyMain {

    public static void crypt(File src, File pwd, File dst) throws IOException {
        try (FileInputStream in = new FileInputStream(src);
             FileInputStream code = new FileInputStream(pwd);
             FileOutputStream out = new FileOutputStream(dst)) {


            byte buffer[] = new byte[1024];
            byte pass[] = new byte[1024];

            int len;

            while ((len = in.read(buffer)) > 0) {
                code.read(pass, 0, len);
                for (int i=0; i < len; i++) {
                    buffer[i] ^= pass[i];
                }
                out.write(buffer);
            }
        }
    }


}
