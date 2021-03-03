
package com.company;

import java.util.*;

class student{

    String name;
    int age;

    // param Constructor
    student(String name, int age){

        // this keyword is pointing to name or age which is defined in class
        // So it sets name and age defined in class to name and age passed in this method
        this.name = name;
        this.age = age;

    }

}

public class Main {

    public static void swap(int eshanAge, int shubhamAge){

        int temp = eshanAge;
        eshanAge = shubhamAge;
        shubhamAge = temp;

    }

    public static void swap2(student eshan, student shubham){

        int temp = eshan.age;
        eshan.age = shubham.age;
        shubham.age = temp;

    }

    public static void main(String args[]){

        student s1 = new student("Eshan", 21);
        student s2 = new student("Shubham", 25);

        // Before Swapping

        System.out.println("Eshan Age " + s1.age);
        System.out.println("shubham Age " + s2.age);

        swap2(s1, s2);

        // After Swapping

        System.out.println("Eshan Age " + s1.age);
        System.out.println("shubham Age " + s2.age);
    }
}