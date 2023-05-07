package com.company;

public class Day29BitwiseAnd {

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int maxValue = 0;
        for(int i=1; i<N; i++){
            for(int j=i+1; j<=N; j++){
                int value = i&j;
                if(value>maxValue && value<K){
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        
    }
}
