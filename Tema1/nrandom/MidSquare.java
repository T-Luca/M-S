package nrandom;

/**
 *
 * @author Luca
 */
import interfata.Generator;

public class MidSquare implements Generator {
    private int seed;
    
    public MidSquare(int seed) {
        this.seed = seed;
    }
	
    @Override
    public float next() {
        int nr = seed * seed;
	int lenght = LengthNr(nr);
        nr =  (int) (nr /  Math.pow(10, 2));
	int nr2 = (int) (nr % Math.pow(10, lenght/2));
        
	if(LengthNr(nr2) < LengthNr(seed)) {
		nr2 = ChangeLength(nr2);
	}
		
	seed = nr2;		        
        return  (float) (seed / Math.pow(10, LengthNr(seed)));	
    }

    private int LengthNr(int n){
	return new Integer(n).toString().length();
    }
    
    private int ChangeLength(int nr2) {
	while(LengthNr(nr2) < LengthNr(seed)) {
		nr2 = nr2 * 10 + 1;
	}
	return nr2;
    }    
}
