package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tails = 0;
        double heads = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coin flips (x)= ");
        int x = sc.nextInt();
        int flip = 1;

        for (flip=1; flip<=x; flip++) {

            double flip_check = Math.floor(Math.random() * 10) % 2;
            System.out.println(flip_check);
            if (flip_check < 0.5) {
                System.out.println("It is Tails");
                tails = tails + 1;
            } else {
                System.out.println("It is Heads");
                heads = heads + 1;
            }
            System.out.println("Number of times tails= "+tails);
            System.out.println("Number of times heads= "+heads);
        }
            double c = (heads / x) * 100;
            double d = (tails / x) * 100;

        System.out.println("Percentage of Heads= " + c);
        System.out.println("Percentage of Tails= " + d);
    }
}