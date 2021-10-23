package com.bridgelabz.perfectNumber;

import java.util.Scanner;

public class PerfectNumber {
    public void divisors(){
        int updateNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check is perfect number or not : ");
        int number = sc.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                updateNum+=i;
                System.out.print(i+ " ");
            }
        }
        if(updateNum==number){
            System.out.println("\n"+number+" = "+updateNum);
            System.out.println("It is a perfect number");
        }
        else {
            System.out.println("\n"+number+" != "+updateNum);
            System.out.println("It is not a perfect number");
        }
    }
    public static void main(String[] args){
        PerfectNumber perfectNumberObj = new PerfectNumber();
        perfectNumberObj.divisors();
    }
}