package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number= ");
        double num = sc.nextDouble();

        if ((num % 2) == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

    }
}





