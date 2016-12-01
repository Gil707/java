package com.itmo.iostreams.serial.print;

import java.io.*;

/**
 * Created by GilEO on 01.12.2016.
 */
public class Command implements Externalizable {

    private String command;

    public String getCommand() {
        return command;
    }

    public Command(String command) {
        this.command = command;
    }

    public void getList() {
        System.out.println("Show list");

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}

