
package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String args[]){

        // Checked Exceptions --> compile Time

        try {
            // Perfect work
            FileReader file = new FileReader("C:\\Users\\eshan\\Desktop\\DS_ALGO\\untitled\\src\\com\\company\\a.txt");

            // Not perfect as there is no b.txt
            // FileReader file = new FileReader("C:\\Users\\eshan\\Desktop\\DS_ALGO\\untitled\\src\\com\\company\\a.txt");

            BufferedReader fileInput = new BufferedReader(file);

            for(int count = 0 ; count < 3; count++) {

                System.out.println(fileInput.readLine());

            }

            fileInput.close();
        } catch (Exception e) {

            System.out.println("This is checked exception " + e);
        }



//        // Unchecked Exception --> Runtime exceptions
//        System.out.println("Exceptional handling");
//
//        int a = 5; int b = 0;
//        try {
//
//            System.out.println("divide number");
//            System.out.println(a / b);
//
//        } catch (Exception error) {
//
//            System.out.println("This is not good " + error);
//
//        }



    }


}