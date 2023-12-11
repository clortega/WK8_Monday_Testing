/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
    }
    public static boolean IsPrime(int number) {
        for(int i = 2; i<Math.sqrt(number); i++) {
            if(number %i ==0) {
                return false; //a divsor is found
            }
        }
        return true; //no divsors found
    }
}
