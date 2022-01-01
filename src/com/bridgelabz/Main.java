package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // Before Swapping
        System.out.println("Enter the first number= ");
        float num1 = sc.nextFloat();

        System.out.println("Enter the second number= ");
        float num2 = sc.nextFloat();

        float temp = num1;
              num1 = num2;
              num2 = temp;

        // After Swapping
        System.out.println("After swapping, the numbers are= "+num1 +" and "+num2);

    }
}





