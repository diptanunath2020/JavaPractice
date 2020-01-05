package com.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDimesion {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            //String[] arrRowItems = scanner.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                //int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = j;
            }
        }

        System.out.println(arr);
        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n"));

        int sum=0;
        int tempSum=0;
        for(int i=0;i<6;i++){
            for (int j=0;j<6;j++){
                if(i>1 && j>1){

                    tempSum=arr[i][j - 2] + arr[i ][j - 1] + arr[i ][j]+
                            arr[i-1 ][j - 1] +
                            arr[i-2][j - 2] + arr[i -2][j - 1] + arr[i -2][j];
                }
//                try {
//                    tempSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j+1]
//                            + arr[i + 2][j + 2];

                if (tempSum>sum){
                    sum=tempSum;
                }
//                }
//                catch (Exception e){
//                    System.out.println("array completed");
//                }

            }
        }
        System.out.println(sum);
        scanner.close();

    }


}
