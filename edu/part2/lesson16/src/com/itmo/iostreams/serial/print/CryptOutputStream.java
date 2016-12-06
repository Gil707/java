package com.itmo.iostreams.serial.print;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by GilEO on 06.12.2016.
 */
public class CryptOutputStream extends FilterOutputStream {

    private final byte CODE = 'c';

    protected CryptOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b ^ CODE);
    }

//    @Override
//    public void write(byte[] b) throws IOException {
//        for (int i = 0; i < b.length; i++) {
//            b[i] ^= CODE;
//        }
//        super.write(b);
//    }
//
//    @Override
//    public void write(byte[] b, int off, int len) throws IOException {
//        super.write(b, off, len);
//    }
}