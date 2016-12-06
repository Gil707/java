package com.itmo.iostreams.serial.print;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by GilEO on 06.12.2016.
 */
public class EncryptInputStream extends FilterInputStream {

    private final byte CODE = 'c';

    protected EncryptInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        return in.read()^CODE;
    }

//    @Override
//    public int read(byte[] b) throws IOException {
//        int c = in.read(b);
//        for (int i = 0; i < b.length; i++) {
//            b[i] ^= CODE;
//        }
//        return c;
//    }
//
//    @Override
//    public int read(byte[] b, int off, int len) throws IOException {
//
//        int n = in.read(b);
//        for (int i = 0; i < b.length; i++) {
//            b[i] ^= CODE;
//        }
//
//        return super.read(b, off, len);
//    }
}
