package com.vetias.java.workshop.workshop.collections;
import java.util.HashMap;
import java.util.Map;
public class StudentMap {
    public static void main (String[]args){
        Map<Integer, String> students = new HashMap<>();
        students.put(1001, "Alice");
        students.put(1002, "Bob");
        students.put(1003, "Charlie");
        students.put(1004, "David");
        students.put(1005, "Eve");

        System.out.println("Student Map: " + students);

        // Accessing a student by roll number
        String studentName = students.get(1002);
        System.out.println("Student with roll number 1002: " + studentName);

        // Checking if a roll number exists
        boolean exists = students.containsKey(1003);
        System.out.println("Does roll number 1003 exist? " + exists);
    
    
      
        // Iterating through the map
        System.out.println("Iterating through the student map:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Removing a student by roll number
        students.remove(1004);
        System.out.println("After removing roll number 1004: " + students);


}
