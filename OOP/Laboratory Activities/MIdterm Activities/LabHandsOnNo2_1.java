/*
Version 1.0.1
Date finished: 08/31/24

Take note:
  When you run this java file, rename this "LabHandsOnNo2_1.java" into "LabHandsOnNo2.java".


Instruction:

    *Experiment with different control structures. In the provided JAVA program, replace or supplement the existing
    control structures with alternative approaches to achieve similar functionality.

    *1) Decision Control Structures
    *Switch-Case for Voting Eligibility
    *THe program used an if-else statement to determine voting eligibility
    *Replace with a switch-case structure by dividing age by 18. This technicque will showcase how division can map conditions to switch cases

 

 
 */

import java.util.InputMismatchException;
import java.util.Scanner;


class LabHandsOnNo2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        userInterface(scanner);
        usingArray(scanner);
        scanner.close();

        


    }

    public static void userInterface(Scanner scanner){

        boolean is_Valid = false;

        String name = null;

        int userAge = 0;

        System.out.println("Welcome to my JAVA PROGRAM!!!!!!");

        do {
            try {
                System.out.print("Enter your valid name:");
                name = scanner.nextLine();
                
                System.out.print("Enter your valid age:");
                userAge = scanner.nextInt();
                
                System.out.println("Hello, " + name + "! You are " + userAge + " years old.");

                is_Valid = true;
                
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again!");
                scanner.nextLine();
            }
            
            
        } while (!is_Valid);
        

        ageValidation(userAge);
        gradeValidation(scanner);
        usingRepeatingLoops(scanner, name);




    }

    public static void ageValidation(int userAge){
        int ageCategory = userAge/18; 

        if (userAge > ageCategory && userAge >= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

        switch(ageCategory){
            case 0 -> System.out.println("You are not eligible to vote");
            case 1, 2, 3, 4, 5, 6 -> System.out.println("You are eligible to vote");
        }

    }

    public static void gradeValidation(Scanner scanner){
        boolean is_Valid = false;
        char grade;

        do {

            try {
                System.out.println("Enter your grade (A, B, C, D, F)");
                grade = Character.toUpperCase(scanner.next().charAt(0));

                switch(grade){
                    case 'A' -> System.out.println("Excellent! Keep up the good work.");
                    case 'B' -> System.out.println("Good job! Try to aim for an A.");
                    case 'C' -> System.out.println("Fair performance. There's room for improvement.");
                    case 'D' -> System.out.println("Passing, but consider studying more.");
                    case 'F' -> System.out.println("Unfortunately, you have failed. Better luck next time");
                    default -> System.out.println("Invalid grade entered");
                }

                is_Valid = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please try again.");

            }
        }
        while (!is_Valid);

    }

    public static void usingRepeatingLoops(Scanner scanner, String name){
        System.out.println("How many times would you like to repeat your name");
        int repeatCount = scanner.nextInt();
        int initFirst = 0;
        int initSecond = 0;

        System.out.println("Using a for loop.");
        for (int i = 0; i < repeatCount; i++){
            System.out.println((i + 1) + ". " + name);
        }

        System.out.println("Using a while loop.");
        while (initFirst < repeatCount){
            System.out.println((initFirst + 1) + ". " + name);
            initFirst++;
        }

        System.out.println("Using a do-while loop:");
  
        do {
            
            System.out.println((initSecond + 1) + ". " + name);
            initSecond++;    
        } while (initSecond < repeatCount);
        
    }

    public static void usingArray(Scanner scanner){

        boolean is_Valid = false;

        do {
            try {
                System.out.println("Enter the size of your favorite numbers you want to input:");
                int arraySize = scanner.nextInt();
        
                int[] favoriteNumbers = new int[arraySize];

                for (int i = 0; i < arraySize; i++){
                    System.out.print("Enter the" + " " + (i + 1) + " " + "number:");
                    favoriteNumbers[i] = scanner.nextInt();
                }

                for (int number : favoriteNumbers){
                    System.out.println("Your favorite numbers are: ");
                    System.out.println(number);
                }

                int sum = 0;
                for (int number : favoriteNumbers){
                    sum += number;
                }

                double average = (double) sum / favoriteNumbers.length;
                System.out.println("The average of your favorite number is: " + average);

                is_Valid = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please try again.");
            }
            
        } while (!is_Valid);

    } 
}
