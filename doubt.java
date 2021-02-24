package com.company;

import java.util.*;
import java.io.*;

public class Main {

    // Find min dist between array elements

    public static int minDistance(int[] dist, int x, int y){

        int minAns = Integer.MAX_VALUE;

        for(int i = 0; i < dist.length; i++){

            for(int j = i + 1; j < dist.length; j++){

                if((x == dist[i] && y == dist[j]) || (y == dist[i] && x == dist[j])){

                    int tempDist = (j - i);

                    if(tempDist < minAns){

                        minAns = tempDist;

                    }

                }

            }

        }

        return minAns;
    }
    
    // Find Length of last word of string
    public static int strLeng(String str){
        
        int count = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            
            char ch = str.charAt(i);
            
            if(ch == ' '){
                break;
            } else {
                
                count++;
                
            }
            
        }
        
        return count;
    }

    // Fibonacci seeries
    
    public static void fib(int n){

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for(int i = 2; i <= n; i++){

            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }

    }

    public static void armStrong(){

        int d1; int d2; int d3;
        for(int i = 1; i <= 500; i++){

            int temp = i;

            d1 = temp % 10;

            temp /= 10;
            d2 = temp % 10;

            temp /= 10;
            d3 = temp % 10;

            if((d1*d1*d1) + (d2*d2*d2) + (d3*d3*d3) == i){
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // int n = scn.nextInt();
        // int[] arr = new int[n];

        // for(int i = 0; i < n; i++){

        //     arr[i]= scn.nextInt();

        // }

        // int x = scn.nextInt();
        // int y = scn.nextInt();

        // int ans = minDistance(arr, x, y);

        // System.out.println("min dist between " + x + " & " + y + " : " + ans);


        // String s = scn.nextLine();
        
        // int ans = strLeng(s);

        // System.out.println("ans is " + ans);


    }

}