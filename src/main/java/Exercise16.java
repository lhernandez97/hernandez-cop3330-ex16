/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        //create Scanner
        Scanner in = new Scanner(System.in);
        //prompt the user for their age
        System.out.print("What is your age? ");
        int age = in.nextInt();
        //check if the user is old enough to drive
        if(age < 16) {
            System.out.print("You are not old enough to legally drive.");
        } else {
            System.out.print("You are old enough to legally drive.");
        }
    }
}
