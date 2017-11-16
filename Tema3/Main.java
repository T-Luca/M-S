package nrandom;

/**
 *
 * @author Luca
 */
import interfata.Generator;

public class Main {
    
    public static void main(String[] args) {
         	/*Generator ms = new MidSquare(9524);
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
                Evaluator evlcg =  new Evaluator(lcg,100);
                Evaluator evms =  new Evaluator(ms,100);
                System.out.println("\nLCG:"+evlcg.eval());
                System.out.println("MSQ:"+evms.eval());*/
                                       
                Generator poisson = new Poisson(100, 28.4);   
                Generator binomial = new Binomial(10,0.2f);
                
                System.out.println("Random number Poisson: ");
                for (int i = 0; i < 20; i++) {
                System.out.println(poisson.next());
                }
                
                System.out.println("Random number Binomial: ");
                for (int i = 0; i < 20; i++) {
                System.out.println(binomial.next());
                }
    }
    
}