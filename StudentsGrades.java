package org.fasttrackit.maps.Exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentsGrades {

    public static void main(String[] args) {
        // Create the Map
        Map<String, Integer> studentGrade = new HashMap<>();

        // Initialize it
        studentGrade.put("Harry", 4);
        studentGrade.put("Merry", 7);
        studentGrade.put("Gerry", 10);
        studentGrade.put("Terry", 3);
        studentGrade.put("Henry", 2);
        studentGrade.put("Kerry", 10);
        studentGrade.put("Larry", 8);
        studentGrade.put("Perry", 9);
        studentGrade.put("Corry", 5);
        studentGrade.put("Dorry", 10);

        // Print it
        System.out.println();
        System.out.println("Students and their grades:");
        System.out.println(studentGrade);

        // Find the highest Grade
        int highestGrade = 10;
        boolean foundHighestGrade = false;
        while (!foundHighestGrade && highestGrade > 1) {
            if (studentGrade.containsValue(highestGrade)) {
                foundHighestGrade = true;
                break;
            }
            highestGrade--;
        }

        System.out.println();
        if (foundHighestGrade) { // Found a grade
            System.out.println("Highest grade is " + highestGrade);

            // Print all the Names having the highest grade
            Set<Map.Entry<String, Integer>> studentEntries = studentGrade.entrySet();
            for (Map.Entry<String, Integer> entry : studentEntries) {
                if (entry.getValue() == highestGrade) {
                    System.out.println(String.format("%s has grade %d", entry.getKey(), entry.getValue()));
                }
            }
        }
        else // No grade
            System.out.println("Everybody has grades less than 1!");
    }
}
