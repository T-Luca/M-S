package seqmachine;

/**
 *
 * @author Luca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StateMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.run();
    }
    
}
