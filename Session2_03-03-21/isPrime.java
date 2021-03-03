
package com.company;

import java.util.*;



public class Main {
    
    
    public static boolean isPrime(int n){
        if(n == 1) return false;
        
        for(int i = 2; i <= (n / 2); i++){
            
            if(n % i == 0) return false;
            
        }
        
        return true;
    }

    public static boolean isPrimeBest(int n){
        if(n == 1) return false;

        for(int i = 2; i * i <= n; i++){

            if(n % i == 0) return false;

        }

        return true;
    }

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println(isPrime(n));
    }
}