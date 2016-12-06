package com.itmo.iostreams.serial.print;

import java.io.*;

/**
 * Created by GilEO on 02.12.2016.
 */
public class Ping implements Serializable {

    private long time;

    public Ping(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(new Ping(time));
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        time =  (long) in.readObject();
//    }
}