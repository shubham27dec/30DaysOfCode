package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day02Operators {


    static class Result {
        static int data =0 ;
        static int round =0;
        /*
         
         *
         * The function accepts following parameters:
         *  1. DOUBLE meal_cost
         *  2. INTEGER tip_percent
         *  3. INTEGER tax_percent
         */

        public static void solve(double meal_cost, int tip_percent, int tax_percent) {
            // Write your code here

            double tip = ((tip_percent * meal_cost) / 100.0);
            double tax = ((tax_percent * meal_cost) / 100.0);
            double total = tip + tax + meal_cost;
            int pay = (int)Math.round((total));
            System.out.print(pay);
            data = (int)meal_cost;
            round = tax_percent;
        }
        
        public static void print(){
            System.out.print(data +" "+round);
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

            int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

            int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

            Result.solve(meal_cost, tip_percent, tax_percent);
            Result.print();
            bufferedReader.close();
        }
    }

}
