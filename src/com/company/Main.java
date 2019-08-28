package com.company;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       String names [] = new String[3];
       names [0] = "Jack";
       names [1] = "John";
       names [2] = "Bill";

       names = Arrays.copyOf (names, names.length +1);
       names [names.length -1 ] = "Alex";

        for (int i = 0; i <names.length ; i++) {
           switch (i) {
               case 0:
               System.out.println("Good morning, " + names[0] + "!");
                   break;

               case 1:
               System.out.println("Good afternoon, " + names[1] + "!");
                   break;
               case 2:
               System.out.println("Good evening, " + names[2] + "!");
                   break;
                   case 3:
               System.out.println("Good night, " + names[3] + "!");
                   break;

           }

        }


    }
}

