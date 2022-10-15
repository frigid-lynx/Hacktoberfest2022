//Save file name Guess.java
//To run the Game type:  "java ./Guess.java" in Console
//GameBy HegdePrasanna

package com.example.guess;

import java.util.Random;
import java.util.Scanner;
   
class Main {
    private static final Random r = new Random();
    private static final int NUMBER = r.nextInt(100) + 1;
    private static int guess = 0,n=0;

    public static void main(String[] args) {  
        Scanner player = new Scanner(System.in);
             System.out.println("You will have 10 attempts to guess the number");
            while ( guess != NUMBER ) {
            System.out.println("Guess a number between 1 and 100");
            guess = player.nextInt();
            if ( guess > NUMBER ) {
                System.out.println("Too high");
            } else if ( guess < NUMBER ) {
                System.out.println("Too low");
            } else {
                System.out.println("That's right!");
                System.exit(0);
            }
            if(n>=10){
                System.out.println("10 Attempts are over.The number is " + String.valueOf(NUMBER));
                   System.exit(0);
            }
            n=n+1;
        }
  }
}