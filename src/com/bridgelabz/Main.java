package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year (four digit only)= ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("This is a leap year");

        } else {
            System.out.println("Not a leap year");
        }
    }
}





