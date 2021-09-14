/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String user=" ", pass=" ", def_pass="abc$123";

        System.out.print("What is the username? ");
        user=sc.nextLine();
        System.out.print("What is the password? ");
        pass=sc.nextLine();

        if(pass.equals(def_pass)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I do not know you!");
        }


    }
}