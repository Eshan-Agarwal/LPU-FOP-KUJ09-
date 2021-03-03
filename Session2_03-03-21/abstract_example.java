
package com.company;

import java.util.*;

abstract class prime{

    abstract int isPrime(int n);

    public void print(){
        System.out.println("this is prime class");
    }

}

class sanskar extends prime {

    int isPrime(int n){
        return 1;
    }

}

public class Main {

    public static void main(String args[]){
        prime p = new prime(){
            int isPrime(int n){
                return 1;
            }
        };

        System.out.println(p.isPrime(2));
    }
}