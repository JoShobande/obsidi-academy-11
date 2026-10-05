package com.bptn.course._04_arrays;

public class Fibonacci {
    public static void main(String[] args) {
// ----------------- Loop Approach ---------------
//        // Predefined numbers to start off the Fibonacci series:
//        int num1 = 0; int num2 = 1;
//        System.out.print(num1+", "+num2);
//
//        // Print the first two numbers of the Fibonacci series:
//        for(int i=3; i<=10; i++){
//          int num3 = num1 + num2;
//          System.out.print(", "+num3);
//          num1 = num2;
//          num2 = num3;
//        }
//
//        // Print the next 8 numbers of the Fibonacci series:
//    	----------------- Array Approach ---------------
    	 // Predefined numbers to start off the Fibonacci series:
        int num1 = 0; int num2 = 1;
        int[] fibonacci = new int[10];
        fibonacci[0]=num1;
        fibonacci[1]=num2;
        
        // Print the first two numbers of the Fibonacci series:
        for(int i=2; i<10; i++){
          fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }

        // Print the next 8 numbers of the Fibonacci series:
        for(int i=0;i<10;i++){
          System.out.print(fibonacci[i]+", ");
        }
        
    
    }
}