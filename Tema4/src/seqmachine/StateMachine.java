package seqmachine;

/**
 *
 * @author Luca
 */
import java.util.HashMap;

public abstract class StateMachine {
	int currentState;
	public HashMap<Integer, HashMap<Integer, Integer>> transitionTable = new HashMap<Integer, HashMap<Integer, Integer>>();
	
	public abstract void run();	
	
} 
