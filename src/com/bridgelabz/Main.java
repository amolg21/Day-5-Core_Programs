package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet= ");

        // Alphabet input from user
        char alphabet = sc.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A'
                || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {

            System.out.println(alphabet + " is Vowel");
    }   else

    {
        System.out.println(alphabet + " is consonant");
    }
    }
}






