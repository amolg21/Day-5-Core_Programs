package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number (a)= ");
        double a = sc.nextDouble();

        System.out.println("Enter the second number (b)= ");
        double b = sc.nextDouble();

        System.out.println("Enter the third number (c)= ");
        double c = sc.nextDouble();

        if (a > b && a > c) {
            System.out.println("number a is greater among three numbers");
        }
        else if ( b > c) {
            System.out.println("number b is greater among three numbers");
        }
        else {
            System.out.println("number c is greater among three numbers");
        }
    }
}





