package nrandom;

import interfata.Generator;

/**
 *
 * @author Luca
 */
public class Evaluator {
    private final float pi = 3.14f;
	
	private Generator gen;
	private int np_p;
	private int np_sc;

	public Evaluator(Generator gen, int nrOfNumbers) {
		this.gen = gen;
		this.np_p = nrOfNumbers;
	}
	
	public float eval(){
		np_sc = 0;
		for(int i = 0; i < np_p; i++){
			float x = gen.next();
			float y = gen.next();
			if(Math.pow(x, 2) + Math.pow(y, 2) <= 1){
				np_sc++;
			}
		}
		float aux = (4*np_sc)/np_p;
		return (Math.abs(pi-aux));
	}
    
}
