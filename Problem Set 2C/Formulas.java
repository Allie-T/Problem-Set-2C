
/**
 * Problem Set 2C
 *
 * Alicia Tang
 * September 28th 2023
 */


public class Formulas{
    
    public static OrderedPair findQuadraticRoots (double a, double b, double c){
        double answer1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2*a);
        double answer2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2*a);
        OrderedPair answer = new OrderedPair(answer1, answer2);
        return answer;
    }
    
    public static double findSlope (OrderedPair A, OrderedPair B){
        double slope = (B.getY()-A.getY())/(B.getX()-A.getX());
        return slope;
        
    }
    
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double midPointX = (A.getX()+B.getX())/2;
        double midpointY = (A.getY()+B.getY())/2;
        OrderedPair answer = new OrderedPair(midPointX, midpointY);
        return answer;
        
        
    }
    
    public static double findArithmeticSeriesSum (double a, double d, int k){
        double sum = (k/2.0) * (2 * a + d * (k-1));
        return sum;
    
    }
    
    public static double findGeometricSeriesSum (double a, double r, int k) {
        return a * ((1 - Math.pow(r, k))/(1 - r));
    }
    
    public static int rollDie (int sides){
        return (int) (Math.random()* sides) + 1;
    }
    
   
}
