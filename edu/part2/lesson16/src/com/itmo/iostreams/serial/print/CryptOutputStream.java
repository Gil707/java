package com.itmo.iostreams.serial.print;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Gil on 06-Dec-16.
 */
public class CryptOutputStream extends FilterOutputStream {

//    private String key1 = "password";
    private byte key = 'a';

    public CryptOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        int res = b;
        byte buffer = (byte) res;
        buffer ^= key;
        res = buffer & 0xFF;
        super.write(res);
    }


    @Override
    public void write(byte[] b, int off, int len) throws IOException {
//        byte[] pwd = key1.getBytes();
        for (int i = off; i < len; i++) {
//            b[i] ^= key;
            b[i] ^= key;
        }

        out.write(b, off, len);
    }
}
