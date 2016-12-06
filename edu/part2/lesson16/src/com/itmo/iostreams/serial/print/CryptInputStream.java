package com.itmo.iostreams.serial.print;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Gil on 06-Dec-16.
 */
public class CryptInputStream extends FilterInputStream {

    private byte key = 'a';
//    private String key1 = "password";

    protected CryptInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int res = super.read();
        byte b = (byte) res;
        b ^= key;
        res = b & 0xFF;
        return res;
    }

//    @Override
//    public int read(byte[] b) throws IOException {
//        int res = in.read(b);
//
//        for (int i = 0; i < res; i++) {
//            b[i] ^= key;
//        }
//        return res;
//    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int res = in.read(b, off, len);

//        byte[] pwd = key1.getBytes();

        for (int i = off; i < res; i++) {
//            if (j == pwd.length) j = 0;
            b[i] ^= key;
        }
        return res;
    }
}
