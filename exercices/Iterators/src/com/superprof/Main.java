package com.superprof;

 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner KeyboardReader = new Scanner(System.in);
        System.out.print("Type the first and last numbers of the series: ");

        int start = KeyboardReader.nextInt();
        int end   = KeyboardReader.nextInt();

        //print_numbers_for( start, end );
        print_numbers_while( start, end );

    }

    public static void print_numbers_for(int start, int end){
        // int i=0 -> INITIATING THE ITERATOR i
        // i<10    -> CONTINUE UNTIL FALSE
        // i++     -> INCREMENTING THE ITERATOR
        for (int i=start; i<=end; i++){
            System.out.println(i);
        }
    }

    public static void print_numbers_while(int start, int end){
        //while -> WHILE (this condition is true){
        //  do this
        // }
        int l_start = start;

        while(l_start <= end){
            System.out.println(l_start++);
        }

    }

}
