
package com.company;

import java.util.*;

public class Main {
    final static int CONSTANT = 5;

    // Reverse an array
    public static void main(String args[]){


        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr  = new int[n];

        for(int i = 0; i < n; i++) {

            arr[i] = scn.nextInt();

        }

        System.out.println("Before");
        for(int val : arr) {

            System.out.print(val + " ");

        }

        int left = 0;
        int right = n - 1;

        while(left < right) {

            int temp = arr[right];

            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;

        }
        System.out.println("After");
        for(int val : arr) {

            System.out.print(val + " ");

        }


    }


}