// Sajid Ahmed
// COMP163 Lab Quiz 1 Section 002

package comp163labquiz1;

/**
 *
 * @author Sajid Ahmed
 */

import java.util.Scanner; //allows input from the user
import java.text.DecimalFormat; //allows rounding of a number
import java.util.Random; //generates a random number

public class Comp163LabQuiz1 {

    public static void main(String[] args) {
        Ball Ball1, Ball2; //creates two objects of type Ball
        Box Box1, Box2; //creates two objects of type Box
        
        Ball1 = new Ball(); //initializes Ball1 to type Ball
        // Uses constructor1 to set the diameter, color, and weight
        Ball1.setDiameter(1.5);
        Ball1.setColor("red");
        Ball1.setWeight(2.75);
        
        // Uses constructor2 to set the diameter, color, and weight
        Ball2 = new Ball(5.75, "blue", 3.5);
        
        Box1 = new Box(); //initiazlies Box1 to type Box
        // uses constructor1 to set the length, width, height, and color
        Box1.setlength(1.5);
        Box1.setWidth(2.5);
        Box1.setHeight(1.0);
        Box1.setColor("white");
        
        // uses constructor2 to set the length, width, height, and color
        Box2 = new Box(6.75, 5.35, 3.95, "Yellow");
        
        // prints Ball1, Ball2, Box1, and Box2 using the toString method
        System.out.println("Ball1: " + Ball1);
        System.out.println("Ball2: " + Ball2);
        System.out.println("Box1: " + Box1);
        System.out.println("Box2: " + Box2);
        
        //creates scan and scan1 of type Scanner to allow user input from the keyboard
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        
        //asks and allows the user to enter Ball2's diameter, weight, and color
        System.out.print("Please enter ball2's diameter: ");
        Ball2.setDiameter(scan.nextDouble());
        System.out.print("Please enter ball2's weight: ");
        Ball2.setWeight(scan.nextDouble());
        System.out.print("Please enter ball2's color: ");
        Ball2.setColor(scan1.nextLine());
        //prints the new Ball2 using the toString method
        System.out.println("New Ball2: " + Ball2);
        
        // creates df of type DecimalFormat and sets it to round 2 decimal places
        DecimalFormat df = new DecimalFormat("0.##");
        //gets Ball2's volume and area and rounds it 2 decimal points
        System.out.println("New Ball2 volume (rounded 2 decimal points) = " + df.format(Ball2.volume()));
        System.out.println("New Ball2 area (rounded 2 decimal points) = " + df.format(Ball2.area()));
        
        System.out.println("Generating random length, width, and height for Box2");
        //creates rand of type Random to generate a random number
        Random rand = new Random();
        //sets Box2's length a random between 0.0-5.0, width between 5.0-15.0, and height between 4.0-9.0
        Box2.setlength(0.0 + (5.0 - 0.0) * rand.nextDouble());
        System.out.println("Generating random length between 0.0 to 5.0 inclusive: " + Box2.getLength());
        Box2.setWidth(5.0 + (15.0 - 5.0) * rand.nextDouble());
        System.out.println("Generating random width between 5.0 to 15.0 inclusive: " + Box2.getWidth());
        Box2.setHeight(4.0 + (9.0 - 4.0) * rand.nextDouble());
        System.out.println("Generating random height between 4.0 to 9.0 inclusive: " + Box2.getHeight());
        //prints the new Box2 using the toString method
        System.out.println("New Box2: " + Box2);
    }
    
}
