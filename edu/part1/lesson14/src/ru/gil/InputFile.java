package ru.gil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Gil on 25-Nov-16.
 */
public class InputFile {

    private BufferedReader in;

    public InputFile(String filename) throws Exception {
        try {
            in = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            System.err.println("Not found " + filename);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.err.println("In.close unsuccesfull");
            }
        }
    }
}
