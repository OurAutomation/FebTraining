package org.SravanAssignments;

import java.io.File;
import java.util.Scanner;

public class FileNotFoundException {
    public static void main(String[] args) {
        File file = new File("FunFolder");
        System.out.println(file.exists());
        System.out.println(file.canRead());

    }
}
