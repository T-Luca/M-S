package seqmachine;

/**
 *
 * @author Luca
 */
import java.util.HashMap;

public abstract class StateMachine {
	int currentState;
	public HashMap<Integer, HashMap<Integer, Integer>> transitionTable;
	
	
    public void run() 
    {}
	
	
	public void Transition(int action)
	{
		currentState = action;
	}
	
} 