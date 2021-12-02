package com.bridgelabz;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class CouponNumber {

    static int input;

    public static void main(String[] args) {
        userInput();
        distinctCoupon(input);
    }

    public static void userInput(){
        System.out.println("Enter how many unique Coupons do you want");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }

    public static void generateCoupons(){
        double coupon = Math.floor(Math.random()*1000000);
        System.out.println((int)coupon);
    }

    public static void distinctCoupon(int a){
        System.out.println("Unique Coupons are :- ");
        while (a>0){
            generateCoupons();
            a--;
        }
    }
}
