package com.itmo.iostreams.serial.print;

/**
 * Created by GilEO on 02.12.2016.
 */
public class Ping extends Message {
    public Ping() {
        super(System.currentTimeMillis(), "innercmd", "ping");
    }
}