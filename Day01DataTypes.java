package com.company;
import java.util.*;

public class Day01DataTypes {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0d;
        String s = "HackerRank ";
        //String s1 = "45";
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        double d1 = sc.nextDouble();
        sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s + s1);
        //System.out.print(s + i);
        //System.out.print(s1 - i); // Its not concat the code subtract the code 45 - 4 = 41;

    }
}
