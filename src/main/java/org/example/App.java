/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        int l, w;
        double conv = 0.09290304;
        System.out.print("What is the length of room in feet? ");
        l = in.nextInt();
        System.out.print("What is the width of room in feet? ");
        w = in.nextInt();

        System.out.println("You entered dimensions of " + l + " feet by " + w + " feet.");
        System.out.println("The area is");
        String sqft = String.format("%d square feet", (l*w));
        System.out.println(sqft);

        String sqm = String.format("%.3f square meters", (l*w*conv));
        System.out.println(sqm);

        in.close();
    }
}