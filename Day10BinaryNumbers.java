package com.company;

import java.io.*;


class Day10BinaryNumbers{
    class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            bufferedReader.close();
            if (n > 0) {
                String b=Integer.toBinaryString(n);
                int i=0,j=0,count=1,max=1;
                while(i<b.length()-1)
                {
                    if(b.charAt(i)=='1' && b.charAt(i+1)=='1')
                    {
                        count++;
                        if(count>max)
                            max=count;
                    }
                    else
                        count=1;
                    i++;
                }
                System.out.println(max);
            }
            else
                System.out.println(0);


        }
    }
}

