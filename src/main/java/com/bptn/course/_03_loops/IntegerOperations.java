package com.bptn.course._03_loops;

import java.util.Scanner;

public class IntegerOperations {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int positives = 0, negatives = 0, evens = 0, odds = 0, count = 0;
    float average = 0.0f, total = 0.0f;
    
    System.out.print("Enter the first integer(0 to terminate): ");
    int input = scanner.nextInt();

    if(input==0){
      System.out.println("No numbers are entered except 0.");
    } else {
      while(input!=0){
        if(input>0){
          positives++;
        } else {
          negatives++;
        }
        if(input%2==0){
          evens++;
        } else {
          odds++;
        }
        count++;
        total = total+input;
        System.out.print("Enter the next integer (0 to terminate): ");
        input = scanner.nextInt();
      }
    }
    average = total/count;
    System.out.println("The number of positives is "+positives+".");
    System.out.println("The number of negatives is "+negatives+".");
    System.out.println("The number of evens is "+evens+".");
    System.out.println("The number of odds is "+odds+".");
    System.out.println("The total is "+total+".");
    System.out.printf("The average is %.2f",average);
    scanner.close();
		
	}

}

