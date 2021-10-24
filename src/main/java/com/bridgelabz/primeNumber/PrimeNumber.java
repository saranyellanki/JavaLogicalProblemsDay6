package com.bridgelabz.primeNumber;

import java.util.Scanner;

public class PrimeNumber {
    /**
     * primeNumber is a method to check it is a prime number or not
     * divide the number with all the previous numbers to check
     * 0 and 1 are not included in the loop
     */
    public void primeNumber(){
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is a prime number or not : ");
        int primeCheck = sc.nextInt();
        for (int i=2; i<primeCheck; i++){
            if (primeCheck % i == 0) {
                System.out.println(primeCheck + " is not a prime number");
                isPrime = false;
                break;
            }
        }
        if(primeCheck==0) System.out.println(primeCheck+" is not a valid number");
        else if(primeCheck==1) System.out.println(primeCheck+" is neither prime nor composite number");
        else if(isPrime) System.out.println(primeCheck + " is a prime number");
    }
    public static void main(String[] args){
        PrimeNumber primeNumberObj = new PrimeNumber();
        primeNumberObj.primeNumber();
    }
}
