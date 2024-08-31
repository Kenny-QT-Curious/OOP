/*
Version 1.0.0
Date finished: 08/31/24


Instruction:

    *Replace or supplement the existing control structures with alternative approach

    *Used if and else statement to determine voting eligibility

    *Replace with a switch case structure by dividing age by 18. It showcase how division can map conditions to switch case

 
 */

import java.util.Scanner;


class LabHandsOnNo2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your valid name:");
        String name = scanner.nextLine();

        System.out.print("Enter your valid age:");
        int userAge = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + userAge + " years old.");

        int ageCategory = userAge/18;

        if (userAge > ageCategory){
            System.out.println("You are not eligible to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }

        switch(ageCategory){
            case 0 -> System.out.println("You are not eligible to vote");
            case 1, 2, 3, 4, 5, 6 -> System.out.println("You are eligible to vote");
        }







    }
    
}