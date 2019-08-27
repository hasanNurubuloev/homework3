package com.company;

public class Main {

    public static void main(String[] args) {
       String names [] = new String[3];
       names [0] = "Jack";
       names [1] = "John";
       names [2] = "Bill";
        for (int i = 1; i <names.length ; i++) {
           switch (i) {
               case 1:
               System.out.println("Good morning, " + names[0]);

               case 2:
               System.out.println("Good afternoon, " + names[1]);
               case 3:
               System.out.println("Good evening, " + names[2]);

           }
            break;
        }


    }
}

