package nrandom;

/**
 *
 * @author Luca
 */
import interfata.Generator;

public class Main {
    
    public static void main(String[] args) {
         	Generator ms = new MidSquare(9524);
                System.out.println("MidSquare: ");
		System.out.println(ms.next());
		for (int i = 0; i < 5; i++) {
			System.out.println(ms.next());
        }
                Generator lcg = new LCG(27,17,43,100);
                System.out.println("\nLCG: ");
                System.out.println(lcg.next());
                for (int i = 0; i < 5; i++) {
			System.out.println(lcg.next());
        }
                
    }
}