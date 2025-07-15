package com.vetias.java.workshop.workshop.collections;
import java.util.HashSet;
import java.util.Set;   
import java.util.TreeSet;

public class StudentSet {
    public static void main(String[]args){
        Set<Integer> rollNos = new TreeSet<>();
        rollNos. add(1001);
        rollNos. add(1101);
        rollNos. add(1011);
        rollNos. add(1102);
        rollNos. add(1003);
        rollNos. add(1008);

        System.out.println(rollNos);

    }
    
}
