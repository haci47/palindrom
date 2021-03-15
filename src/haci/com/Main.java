package haci.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number :");
         int num =scan.nextInt();

           int remainder, originalInteger;

        originalInteger = num;

        int reversedInteger = 0;
        for (; num != 0; num /= 10) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }

        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");


    }
}


   
   
    

