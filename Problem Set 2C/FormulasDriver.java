
/**
 * Write a description of class FormulasDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class FormulasDriver
{   
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 +bx + c. "
        + "Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();
        
        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for 1x^2 + 5x + 6 are " + roots + ".");
        System.out.println();
        
        System.out.println("SLOPE FORMULA: Find the slope between (x1, y1) and (x2, y2)");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        
        OrderedPair A1 = new OrderedPair(x1, y1);
        OrderedPair B1 = new OrderedPair(x2, y2);
        double slope = Formulas.findSlope(A1, B1);
        
        System.out.println("A line between " + A1 + " and " + B1 + " has a slope of " 
        + slope + ".");
        System.out.println();
        
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1, y1) and (x2, y2)");
        System.out.print("x1: ");
        double X1 = input.nextDouble();
        System.out.print("y1: ");
        double Y1 = input.nextDouble();
        System.out.print("x2: ");
        double X2 = input.nextDouble();
        System.out.print("y2: ");
        double Y2 = input.nextDouble();
        
        OrderedPair A2 = new OrderedPair(X1, Y1);
        OrderedPair B2 = new OrderedPair(X2, Y2);
        OrderedPair midPoint = Formulas.findMidpoint(A2, B2);
        
        System.out.println("The midpoint between " +A2+ " and " +B2+ " is " + midPoint + ".");
        System.out.println();
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int k = input.nextInt();
        System.out.print("Starts with: ");
        double a1 = input.nextDouble();
        System.out.print("Increases by: ");
        double d = input.nextDouble();
        
        double sum = Formulas.findArithmeticSeriesSum(a1, d, k);
        
        System.out.println("The sum of the first " + k + " terms of an arithmetic series that starts with "
        + a1 + " and increase by " + d + " is " + sum + ".");
        System.out.println();

        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        int k1 = input.nextInt();
        System.out.print("Starts with: ");
        double a2 = input.nextDouble();
        System.out.print("Rate of growth: ");
        double r = input.nextDouble();
        
        double sum1 = Formulas.findGeometricSeriesSum(a2, r, k1);
        
        System.out.println("The sum of the first " + k1 + " terms of a finite geometric series that starts with " + a2 + " and increases by a rate of " + r + " is " + sum1 + ".");
        System.out.println();
        
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int n = input.nextInt();
        
        int side = Formulas.rollDie(n);
        
        System.out.println("Rolling a " + n + "-sided die... you got a " + side + "!");
        
        
    
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
