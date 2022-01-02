package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value (Dividend)= ");
        Float a = sc.nextFloat();

        System.out.println("Enter the value (Divisor)= ");
        Float b = sc.nextFloat();

        Float Quotient = ( a/b );                  // Quotient = Dividend / Divisor
        System.out.println("Value of Quotient is " +Quotient);

        Float Remainder = a -( b * Quotient );     // Remainder = Dividend - ( Divisor * Quotient )
        System.out.println("Value of Remainder is " +Remainder);

    }
}





