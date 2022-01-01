package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power value (from 0 to 30) N= ");
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            double a = Math.pow(2, i);
            System.out.println(a);
        }

    }
}





