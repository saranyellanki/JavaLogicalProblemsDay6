package com.bridgelabz.stopwatch;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stopwatch {
    static Instant start;
    static Instant stop;
    public static void setStart(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter START to start the timer : ");
            String startTime = sc.next();
            if(startTime.equals("START")){
                start = Instant.now();
                break;
            }
        }
    }
    public static void setStop(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter STOP to stop the timer : ");
            String stopTimer = sc.next();
            if (stopTimer.equals("STOP")){
                stop = Instant.now();
                break;
            }
        }
    }
    public void getTime(){
        setStart();
        setStop();
        long timeElapsed = Duration.between(start,stop).toMillis();
        System.out.println("Timer Count : "+timeElapsed+" milliseconds");
    }
    public static void main(String[] args){
        Stopwatch stopwatchObj = new Stopwatch();
        stopwatchObj.getTime();
    }
}