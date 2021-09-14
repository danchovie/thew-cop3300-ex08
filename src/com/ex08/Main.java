/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
	    int people, pizzas, slices_per, slices_tot, people_slice, leftovers;
        System.out.print("How many people? ");
        people = newScanner.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizzas = newScanner.nextInt();
        System.out.print("How many slices per pizza? ");
        slices_per = newScanner.nextInt();
        slices_tot = pizzas*slices_per;
        people_slice = slices_tot/people;
        leftovers = slices_tot%people;
        System.out.printf("%d people with %d pizzas (%d slices)\nEach person gets %d pieces of pizza.\nThere are %d leftover pieces.", people, pizzas, slices_tot, people_slice, leftovers);
    }
}
