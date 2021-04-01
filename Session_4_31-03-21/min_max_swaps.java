package com.company;

import java.io.*;
import java.util.*;



public class Main {




    public static void main(String[] args) throws IOException {


        Scanner scn = new Scanner((System.in));

        // take input as number of elements
        int n = scn.nextInt();

        // make array
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {

            arr[i] = scn.nextInt();

        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIdx = 0; int maxIdx = 0;

        for(int i = 0; i < n; i++) {

            int val = arr[i];

            if(min > val) {

                min = val;
                minIdx = i;

            }

            if(max < val) {

                max = val;
                maxIdx = i;

            }

        }
        int result = 0;
        if(minIdx < maxIdx) {

            result = maxIdx + (n - minIdx - 2);

        } else {

            result = maxIdx + (n - minIdx - 1);

        }

        System.out.println(result);

    }



    }
