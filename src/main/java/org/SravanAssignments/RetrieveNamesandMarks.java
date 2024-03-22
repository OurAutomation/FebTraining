package org.SravanAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RetrieveNamesandMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> nameMarksMap = new HashMap<>();
        System.out.println("Enter names and marks (Enter 'exit' to stop):");
        while (true) {
            System.out.print("Name: ");
            String name = scanner.next();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Marks: ");
            int marks = scanner.nextInt();
            nameMarksMap.put(name, marks);
        }
        System.out.println("\nNames and Marks:");
        for (Map.Entry<String, Integer> entry : nameMarksMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
