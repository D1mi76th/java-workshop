package com.vetias.java.workshop.tempdata.employee;

import java.util.Arrays;

public class employee {

    public static void main(String[] args) {
    String[][] employees =  new String[63][2];
    employees[0][0] = "Rs.40000";
    employees[0][1] = "John Doe";
    employees[1][0] = "Rs.40001";
    employees[1][1] = "Jane Smith";
    employees[2][0] = "Rs.59900";
    employees[2][1] = "Alice Johnson";  
    employees[3][0] = "Rs.59901";
    employees[3][1] = "Bob Brown";
    employees[4][0] = "Rs.75000";
    employees[4][1] = "Charlie Davis";
    employees[5][0] = "04411";
    for (String[] employee : employees) {
        
        System.out.println(Arrays.toString(employee));
    }
  }
}