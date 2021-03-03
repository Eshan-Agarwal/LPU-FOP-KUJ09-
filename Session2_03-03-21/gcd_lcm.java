
package com.company;

import java.util.*;



public class Main {


    public static int gcdOfTwoNum(int a, int b){

        while(b != 0){

            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;
    }

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

       int gcd = gcdOfTwoNum(a, b);

       int lcm = (a * b) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}