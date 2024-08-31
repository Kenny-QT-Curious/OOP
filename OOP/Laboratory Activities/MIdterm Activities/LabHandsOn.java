/*
Java 1.0.0

Name: Christian Kenneth F. Gonzales
Year & Section: BSIT 2A
Laboratory Activity #: 1
Date finished: 08/28/24


Instruction:
*Modify the program, by adding additional input validation.
*To add additional input validation to the provided Java program, you can
introduce checks for invalid inputs to ensure that the program handles erreneous
data gracefully

Key changes and improvements:
1) Input Validation for Age
*Print appropriate messages for invalid inputs, ensuring the program only continues with valid data.

2)Input Validation for Grade:
*Implement a loop that checks if the entered grade is one of the specified valid characters 
('A','B','C','D','F')
*Use a switch statement to validate and handle each grade, providing specific feedback for each case

*/

import java.util.InputMismatchException;
import java.util.Scanner;



class LabHandsOn{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.nextLine();

        boolean is_Valid = false;
        int age = 0;


        do{
            System.out.print("Please enter your age:");
            try{
                age = scan.nextInt();
    
                if (age <= 17 && age > 10){
                    System.out.println("You are not eligible to vote.");
                    is_Valid = true;
                    
                    
                }
                else if(age <= 0){
                    System.out.println("Invalid input");
                    
                }

                else{
                    System.out.println("You are eligible to vote.");
                    is_Valid = true;
                    
                    
    
                }
    
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input.");
                scan.nextLine();
            }

 
        }
        while(!is_Valid);

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        


        char my_Grade;

        for (int i = 0; is_Valid; i++){
            System.out.println("Enter your grade (A, B, C, D, F)");
            System.out.println("Select:");
            my_Grade = Character.toUpperCase(scan.next().charAt(0));

            switch(my_Grade){
                case 'A':
                    System.out.println("Excellent! Keep it up!");
                    is_Valid = false;
                    break;

                case 'B':
                    System.out.println("Good! Try to aim for an A!");
                    is_Valid = false;
                    break;

                case 'C':
                    System.out.println("Fair performance! There is no room for improvement!");
                    is_Valid = false;
                    break;

                case 'D':
                    System.out.println("Passing, but consider studying more.");
                    is_Valid = false;
                    break;

                case 'F':
                    System.out.println("Unfortunately, you have failed. Better luck next time!");
                    is_Valid = false;
                    break;

                default:
                     System.out.println("Invalid input.");
                     
            
                
            }

            scan.close();

           

            
            
            
            
            
        }


        


   
      
        /*switch(my_Grade){
            case 'A' -> System.out.println("Excellent! Keep it up!");
            case 'B' -> System.out.println("Good! Keep it up!");
            case 'C' -> System.out.println("Satisfactory! Keep it up!");
            case 'D' -> System.out.println("Poor! Keep it up!");
            case 'F' -> System.out.println("Failing! Keep it up!");
            
        }
        */

    }
}
        

    
    

