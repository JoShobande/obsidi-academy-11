package com.bptn.course._03_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        int pin;
        boolean accessGranted = false;

        Scanner scanner = new Scanner(System.in);

        do{
          System.out.print("Enter your 4-digit PIN: ");
          pin = scanner.nextInt();
          attempts++;
          if(pin == CORRECT_PIN){
            accessGranted = true;
          } else {
            System.out.println("Incorrect PIN. Try again.");
          }
        }while(!accessGranted && attempts<3);
        
        if(accessGranted){
          System.out.println("Access granted. Welcome!");
        } else {
          System.out.println("Incorrect PIN. Account locked.");
        }
        scanner.close();
    }
}
