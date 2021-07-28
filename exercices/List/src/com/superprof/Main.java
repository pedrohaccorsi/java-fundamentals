package com.superprof;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Tipo nome = new tipo();
        //Pokemon p = new Pokemon(nome, força);
        //List<Pokemon> p = new ArrayList<Pokemon>();

        List<String>  names   = new ArrayList<String>();
        List<Integer> numbers = new ArrayList<Integer>();

        Scanner keyboardReader = new Scanner(System.in);

        names.add(keyboardReader.next());
        names.add("João");
        names.add("Carlos");
        names.add("Guto");

        numbers.add(keyboardReader.nextInt());
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        print(names, numbers);

        names.remove("Pedro");
        numbers.remove(new Integer(1));

        print(names, numbers);

     }

     public static void print(List<String> a, List<Integer> b){
         System.out.println(a);
         System.out.println(b);
     }

}
