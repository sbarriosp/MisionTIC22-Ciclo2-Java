package first.java.project;
//Start Program

import java.util.Scanner;

public class FirstJavaProject {
    public static void main(String[] args) {
         Scanner enter = new Scanner (System.in);
         int number;
         System.out.println ("Enter a number: "); 
           number = enter.nextInt();
           System.out.print("The number is: " + number);
        
    }
    
}