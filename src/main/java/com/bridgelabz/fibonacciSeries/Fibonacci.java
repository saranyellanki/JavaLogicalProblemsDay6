package com.bridgelabz.fibonacciSeries;

import java.util.Scanner;

public class Fibonacci {
    /**
     * Sum of previous two integers is updated and stored in another variable
     * updated variable is used for the logic till the range of series
     */
    public void fibonacciSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number up to required series : ");
        int fibRange = sc.nextInt();
        int num1=0;
        int num2=1;
        int updateNum;
        for(int i=0;i<fibRange;i++){
            System.out.print(num1 + " ");
            updateNum = num1+num2;
            num1 = num2;
            num2 = updateNum;
        }
    }
    public static void main(String[] args){
        Fibonacci fibSeriesObj = new Fibonacci();
        fibSeriesObj.fibonacciSeries();
    }
}
