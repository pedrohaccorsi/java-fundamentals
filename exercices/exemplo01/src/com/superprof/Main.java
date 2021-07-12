package com.superprof;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int age;
        Scanner keyboardReader;

        //1. read age
        keyboardReader = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = keyboardReader.nextInt();

        //2. check if it is over 18 years old
        if(age >= 18){
            System.out.println("You are of age!");
        }else{
            System.out.println("You are too young");
        }

    }

}