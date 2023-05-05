package com.company;
import java.util.*;

public class Day26NestedLogic {
    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int dayActual = sc.nextInt();
            int monthActual = sc.nextInt();
            int yearActual = sc.nextInt();
            int dayExpected = sc.nextInt();
            int monthExpected = sc.nextInt();
            int yearExpected = sc.nextInt();
            int fine = 0;
            if(yearActual<yearExpected){
                fine=  0;
            }
            else if(yearActual>yearExpected){
                fine=10000;
            }
            else{
                if(monthActual<monthExpected){
                    fine=0;
                }
                else if(monthActual>monthExpected){
                    fine = 500*(monthActual-monthExpected);
                }
                else{
                    if(dayActual<=dayExpected){
                        fine=0;
                    }
                    else{
                        fine = 15*(dayActual-dayExpected);
                    }
                }
            }
            System.out.println(fine);
        }
    }
}
