package com.company;
import java.util.*;

public class Day0HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println("Hello, World.");
        for(int i=0;i<1000000;i++);   // It takes some time of execute the code
        System.out.println(inputString);
    }
}
