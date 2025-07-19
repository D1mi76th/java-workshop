package com.java.workshop.basics;
import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);


           System.out.println("Enter your of birth year: ");
           String bday = scanner.nextLine();
           LocalDate currentYear1 = LocalDate.parse(bday);
           int currentYear2 = currentYear1.getYear();
           int currentYear = LocalDate.now().getYear();
           int age1 = currentYear - currentYear2;
           System.out.println("The age is: " + age1 );
              

  
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              