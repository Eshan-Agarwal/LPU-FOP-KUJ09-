
package com.company;

import java.util.*;

public class Main {
    
    
    // Lambda expression Example
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(6);

        list.forEach((val) -> System.out.println(val)); // lambda expression



    }


}