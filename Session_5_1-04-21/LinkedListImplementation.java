package com.company;

import org.w3c.dom.Node;

import java.io.*;
import java.util.*;



public class Main {

    static Node head; // globally one access it any other place without passing in functions

    static class Node{

        int data;
        Node next;

        Node(int data) {

            this.data = data;
            next = null;

        }

    }

    public static void printElementsOfLinkedList() {

        // These line are imp to add
        if(head == null) return;

        if(head.next == null) System.out.println(head.data);

        Node temp = head;

        while(temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;

        }


    }

    public static void main(String[] args) throws IOException {



        Scanner scn = new Scanner(System.in);

        // number of nodes
        int n = scn.nextInt();

        if(n > 0) {

            head = new Node(scn.nextInt());

            Node temp = head;

            for(int i = 1; i < n; i++) {

                temp.next = new Node(scn.nextInt());

                temp = temp.next;

            }


        }

        printElementsOfLinkedList();


    }



    }
