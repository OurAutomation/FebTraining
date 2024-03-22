package org.SravanAssignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowException {
    public static void main(String[] args) throws FileNotFoundException {
        String n = System.getProperty("user.dir");
        File file = new File(n+ File.separator + "Smile.txt");
        throw new FileNotFoundException();

    }
}
