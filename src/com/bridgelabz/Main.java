package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth value= ");
        int N = sc.nextInt();

        double a = 0;
        for (double i = 1; i <= N; i++) {
            a = (a + (1 / i));
            System.out.println(a);
        }
        System.out.println("The Nth harmonic value= "+a);
    }
}





