package com.company;

import java.io.*;
import java.util.*;

class Student{

    String name;
    int id;

}

// TestStudent
public class Main {

    public static void main(String[] args) throws IOException {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = 1;
        s1.name = "Shubham";

        s2.id = 2;
        s2.name = "Kirti";

        System.out.println("My name is " + s1.name + " and my id is " + s1.id);
        System.out.println("My name is " + s2.name + " and my id is " + s2.id);

    }



    }
