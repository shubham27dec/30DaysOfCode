package com.company;
import java.io.*;
import java.util.*;

public class Day19Interfaces {
    interface AdvancedArithmetic{
        int divisorSum(int n);
    }
    static class Calculator implements AdvancedArithmetic {
        public int divisorSum(int n) {
            int divisorSum=1;
            for(int i=2; i<=n; i++){
                if(n%i==0){
                    divisorSum += i;
                }
            }
            return divisorSum;
        }
    }

    class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();

            AdvancedArithmetic myCalculator = new Calculator();
            int sum = myCalculator.divisorSum(n);
            System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
            System.out.println(sum);
        }
    }
}
