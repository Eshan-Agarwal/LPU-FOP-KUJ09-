package com.company;

import java.io.*;
import java.util.*;



public class Main {

    public static void reverse(int[] arr, int si, int ei) {

        while(si < ei) {

            int temp = arr[si];
            arr[si]  = arr[ei];
            arr[ei] = temp;

            si++;
            ei--;

        }

    }

    public static void main(String[] args) throws IOException {

            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < arr.length; i++) {

                arr[i] = scn.nextInt();

            }


            int r = scn.nextInt();

            // r > n
            r = r%n;

            // r is -ve
            if(r < 0) {

                r = r + n;
            }

            int siFirst = (n - r - 1);
            int siSecond = (n - r);

            // reverse first segment
            reverse(arr, 0, siFirst);

            // reverse second segment
            reverse(arr, siSecond, (n - 1));

            // reverse whole arr
            reverse(arr, 0 , n - 1);

            for(int val : arr) {
                System.out.print(val + " ");
            }

    }



    }
