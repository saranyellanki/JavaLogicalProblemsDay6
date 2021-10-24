package com.bridgelabz.reverse_number;

import java.util.Scanner;

public class ReverseNumber {
    /**
     * reverse method is used to reverse the number by modulo operator
     * remainder is stored and used in next iteration
     */
    public void reverse(){
        int digit;
        int reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse : ");
        int number = sc.nextInt();
        while (number>0){
            digit = number%10;
            number = number/10;
            reverse = reverse*10+digit;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        ReverseNumber reverseNumberObj = new ReverseNumber();
        reverseNumberObj.reverse();
    }
}
