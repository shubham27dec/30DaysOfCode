package com.company;
import java.io.*;
import java.util.*;



public class Day04ClassVsInstance {
    private int age;

    public Day04ClassVsInstance(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(initialAge>=0){
            age = initialAge;
        }
        else{
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String printStatement;
        if(age<13){
            printStatement = "You are young.";
        }
        else if(age>=13 && age<18){
            printStatement = "You are a teenager.";
        }
        else{
            printStatement = "You are old.";
        }
        System.out.println(/*Insert correct print statement here*/printStatement);
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day04ClassVsInstance p = new Day04ClassVsInstance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
