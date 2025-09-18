/**
 * Name: Destiny A. Rodriguez
 * Date: 9/17/2025
* Purpose: InClass 3 - 
* write a program thta will ask the user for the length of a cube side. then the program should calculate the volume and area of the cube and print the numbers.
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class InClass3_Destiny_Rodriguez
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);   

        // In-Class 3 Example:

        double side;
        double volume;
        double surface;
        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("Enter the length of the side of a cube: ");

        // Step 2: Read the user's input and store it in a variable.
        side = input.nextDouble();

        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side,3);
        
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surface = Math.pow(side,2);
        surface *= 6;

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume is: " + volume);
        System.out.println("The surface area is: " + surface);
    }
}