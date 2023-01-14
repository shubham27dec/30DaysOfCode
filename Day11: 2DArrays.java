import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        int sum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.size()-1; i++) 
            for (int j = 1; j < arr.size()-1; j++) {
                int tempSum = arr.get(i).get(j)+
                              arr.get(i-1).get(j-1)+
                              arr.get(i-1).get(j)+
                              arr.get(i-1).get(j+1)+
                              arr.get(i+1).get(j-1)+
                              arr.get(i+1).get(j)+
                              arr.get(i+1).get(j+1);
                if(tempSum > sum)
                    sum = tempSum;
            }
            System.out.print(sum);
    }
}
