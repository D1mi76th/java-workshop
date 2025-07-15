package com.vetias.java.workshop.workshop.collections;
import java.util.ArrayList;
import java.util.List; 
public class ListExample {
    public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    names.add("Ali"); 
    names.add("Berb");
    names.add("Chedi");

    System.out.println(names);
    names.set(1, "Bobby");
    for (int i = 0; i < names.size(); i++) {
        System.out.println(names.get(i));
    }
 }
}