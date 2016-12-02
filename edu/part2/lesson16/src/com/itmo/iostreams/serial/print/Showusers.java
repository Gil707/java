package com.itmo.iostreams.serial.print;

import java.io.*;

/**
 * Created by GilEO on 01.12.2016.
 */
public class Showusers extends Message {

    public Showusers() {
        super(System.currentTimeMillis(), "innercmd", "showusers");
    }
}

