
/**
 * The orderedPair Class.
 *
 * Alicia Tang
 * AP compsci
 * Sept,28th 2023
 * to seperate constructor and instance variable use:
 * "this.X" <-- meaning instance variable
 */
public class OrderedPair{
        double X, Y;
        
        public OrderedPair () {
            X = 0;
            Y = 0;
        }
        
        public OrderedPair (double x, double y) {
            X = x; 
            Y = y;    
        }
        
        public String toString(){
            return "(" + X + ", " + Y + ")";
        }
        
        public double getX(){
            return X;
        }
        
        public double getY(){
            return Y;
        }
   
}
