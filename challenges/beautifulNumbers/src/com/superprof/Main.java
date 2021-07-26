package com.superprof;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);

        int[] beautiful_numbers = get_beautiful_numbers(  keyboardReader.nextInt(), keyboardReader.nextInt() );

        for(int i=0; i<beautiful_numbers.length; i++){
            System.out.println(beautiful_numbers[i]);
        }

    }

    //Beautiful numbers are all those numbers that are divisible by 2, 3 and 6 at the same time.
    //Write a function that, given two numbers, return all the beautiful numbers in between.
    public static int[] get_beautiful_numbers(int start, int end){

    }

}
