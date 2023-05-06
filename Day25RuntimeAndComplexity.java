package com.company;
import java.util.*;

public class Day25RuntimeAndComplexity {
    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                if(isPrime(n)){
                    System.out.println("Prime");
                }
                else{
                    System.out.println("Not prime");
                }
            }
        }

        static boolean isPrime(int n){
            if(n==1){
                return false;
            }
            if(n<4){
                return true;
            }
            for(int i=2; i<=(int)Math.ceil(Math.sqrt(n)); i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
