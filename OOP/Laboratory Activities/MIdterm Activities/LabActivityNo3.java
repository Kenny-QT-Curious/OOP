/*

Version 1.0.0

2) Advanced Looping
 * Modify this program to add the following features:
 * 1) Display the Array in Reverse Order: After the user has entered their favorite numbers, display the contents of the array in reverse order.
 * 2) Calculate and Display the Sum of All Numbers: Add functionality to calculate the sum of all the favorite numbers entered by the user and display it.
 * 3) Find and Display the Average of All Numbers: Add functionality to calculate the average of the favorite numbers entered by the user and display it.
 */


import java.util.Scanner;
public class LabActivityNo3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        try{
            solvingProblemNumber1(scanner);
            solvingProblemNumber2(scanner);
        }
        finally{
            scanner.close();
        }
        


    }

    public static void solvingProblemNumber1(Scanner scanner){
        /*
        2) Advanced Looping
        Implement a program that finds the maximum and minimum numbers in the user's favorite numbers array.

        Sample Expected Output:
        Enter the number of favorite numbers you want to input: 3
        Enter your favorite numbers:
        Number 1: 4
        Number 2: 8
        Number 3: 2
        Maximum Number: 8
        Minimum Number: 2
         
         */
        int arraySize = 0;

         System.out.print("Enter the number of favorite numbers you want to input:");
         arraySize = scanner.nextInt();

         int[] favoriteNumbers = new int[arraySize];

         System.out.println("Enter your favorite numbers:");
         for(int i = 0; i < arraySize; i++){
            System.out.print("Number" + " " + (i+1) + ":");
            favoriteNumbers[i] = scanner.nextInt();
         }

         
         int minimumNumber = favoriteNumbers[0];
         int maximumNumber = favoriteNumbers[arraySize-1];

         for(int j = 1; j < arraySize; j++){
            if (favoriteNumbers[j] < minimumNumber){
                minimumNumber = favoriteNumbers[j];
            }

            if (favoriteNumbers[j] > maximumNumber){
                maximumNumber = favoriteNumbers[j];
            }   
         }
         System.out.println("Minimum Number:" + minimumNumber);
         System.out.println("Maximum Number:" + maximumNumber);
    }

    public static void solvingProblemNumber2(Scanner scanner){

        /*
        2) Advanced Looping
        Modify this program to add the following features:
        1) Display the Array in Reverse Order: After the user has entered their favorite numbers, display the contents of the array in reverse order.
        2) Calculate and Display the Sum of All Numbers: Add functionality to calculate the sum of all the favorite numbers entered by the user and display it.
        3) Find and Display the Average of All Numbers: Add functionality to calculate the average of the favorite numbers entered by the user and display it.
        
        Example output:
        Enter the number of favorite numbers you want to input: 3
        Enter your favorite numbers:
        Number 1: 4
        Number 2:8
        Number 3:2
        Array in Reverse Order: 2 8 4
        Sum of all numbers:14
        Average of all Numbers:4
 */

        //The storage unit of the array
        int index = 0;
        int sum = 0;
        int overallAverage = 0;

        //Getting the size of the user's favorite number
        System.out.print("Enter the number of favorite numbers you want to input:");
        int arraySize = scanner.nextInt();
        int[] favoriteNumbers = new int[arraySize];
        int [] reverseOrder = new int[arraySize];

        //Getting the favorite number of the user
        System.out.println("Enter your favorite numbers:");
        for (int i = 0; i < arraySize; i++){
            System.out.print("Number " + (i+1) + ": ");
            favoriteNumbers[i] = scanner.nextInt();
        }
        //Reverse the element inside the array
        System.out.println("Array in Reverse Order:");
        do{
            reverseOrder[index] = favoriteNumbers[(arraySize - index - 1)];
            System.out.print(reverseOrder[index] + " \t ");
            index++;
        }
        while(index < arraySize);

        //Calculate the average and the sum of the array
        for (int j = 0; j <arraySize; j++){
            sum += favoriteNumbers[j];
            if (j == (favoriteNumbers.length - 1)){
                overallAverage = sum/favoriteNumbers.length;
                System.out.println("\nSum of all numbers:" + sum);
                System.out.println("Average of all numbers:" + overallAverage);
            }
        }
        

    }
    
}