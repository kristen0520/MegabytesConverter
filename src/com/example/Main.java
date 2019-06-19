package com.example;

public class Main {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long mb = Math.round(kiloBytes/1000);
            long kb = kiloBytes - (mb*1000);
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
}
