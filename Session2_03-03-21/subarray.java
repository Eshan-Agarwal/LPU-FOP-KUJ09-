
package com.company;

import java.util.*;


public class Main {

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){

            arr[i] = scn.nextInt();

        }

        for(int i = 0; i < arr.length; i++){

            for(int j = i; j <= arr.length; j++){

                for(int k = i; k < j; k++){

                    System.out.print(arr[k] + " ");

                }
                System.out.println();

            }

        }

    }
}