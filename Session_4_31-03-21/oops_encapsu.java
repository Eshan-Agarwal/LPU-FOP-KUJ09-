package com.company;

import java.io.*;
import java.util.*;

// Encapsulation
class Student{

   private String name;
   private int age;
   private int rollNo;

   public String getName() {
       return name;
   }

   public int getAge() {
       return age;
   }

   public int getRollNo() {
       return rollNo;
   }

   public void setName(String newName) {

       name = newName;

   }

    public void setAge(int newAge) {

        age = newAge;

    }

    public void setRollNo(int newRollNo) {

        rollNo = newRollNo;

    }

}


public class Main {

    public static void main(String[] args) throws IOException {

        Student s1 = new Student();

        s1.setName("Rohit");
        s1.setAge(25);
        s1.setRollNo(5);

        System.out.println("Name " + s1.getName());
        System.out.println("Age " + s1.getAge());
        System.out.println("Roll Num " + s1.getRollNo());

    }



    }
