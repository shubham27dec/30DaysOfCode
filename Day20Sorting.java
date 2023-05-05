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

public class Day20Sorting {
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            // Write your code here
            int totalSwaps = 0;
            for(int pass=1; pass<=a.size(); pass++){
                int swaps = 0;
                for(int index = 0; index<a.size()-pass; index++){
                    if(a.get(index)>a.get(index+1)){
                        int temp  = a.get(index);
                        a.set(index,a.get(index+1));
                        a.set(index+1,temp);
                        swaps++;
                    }
                }
                totalSwaps += swaps;
                if(swaps==0){
                    break;
                }
            }
            System.out.println("Array is sorted in " + totalSwaps + " swaps.");
            System.out.println("First Element: " + a.get(0));
            System.out.println("Last Element: " + a.get(a.size()-1));

            bufferedReader.close();
        }
    }
}
