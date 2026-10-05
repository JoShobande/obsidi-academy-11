package com.bptn.course._04_strings;

public class Greeting {

    public static void main(String[] args) {
     String start = "Happy Birthday";

      // Declare a string variable `fullName` with the value "John Doe"
      String fullName = "John Doe";

     // Concatenate the `start` string and `fullName` with a space between them
    String result = start + " " + fullName;

     // Append three exclamation points "!!!" to the `result` string
    result = result + "!!!";

     // Print the final concatenated string to the console
     System.out.println(result);
   }
}
