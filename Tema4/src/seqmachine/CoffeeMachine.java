package seqmachine;

import java.util.HashMap;
import java.util.Scanner;

public class CoffeeMachine extends StateMachine {

    CoffeeMachine()
    {		
	transitionTable = new HashMap<Integer, HashMap<Integer, Integer>>();
		
	HashMap<Integer, Integer> state0 = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> state5 = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> state10 = new HashMap<Integer, Integer>();
		
	state0.put(5,5);
	state0.put(10, 10);
		
	state5.put(5, 10);
	state5.put(10, 15);
		
	state10.put(5, 15);
	state10.put(10, 20);

	transitionTable.put(0, state0);
	transitionTable.put(5, state5);
	transitionTable.put(10, state10);
		
	currentState=0;
	}
	
    @Override
    public void run()
    {
	Scanner scanner = new Scanner(System.in);
	int action;
        int option;

	while(true)
	{
            System.out.println("Credit: " + currentState);
            System.out.println("Introduceti bancnote: ");
            action = scanner.nextInt();
            if(action == 5 || action == 10)
            {
		if(transitionTable.get(currentState).get(action)!=null)
		{
                    currentState = transitionTable.get(currentState).get(action);
		}
		else
		{
                    System.out.println("\nOptiune invalida");
		}
                
                    if(currentState >= 10)
                    {
                        System.out.println("1.Cafea mica - 10 ");
                        System.out.println("2.Cafea mare - 15 ");
                        System.out.println("Optiunea dvs:");
                        option = scanner.nextInt();
                        switch(option){
                                        
                            case 1 :			
                                       
                                currentState -=10;
                                System.out.println("\nAi destui bani pt o cafea mica (pret 10). \nAi cumparat o cafea mica");
                                break;
                                        
                            case 2 :
                                System.out.println("Credit: " + currentState);
                                System.out.println("Introduceti bancnote: ");
                                action = scanner.nextInt();
                                        
                                if(action == 5 || action == 10)
                                {
				
                                    currentState = transitionTable.get(currentState).get(action);
				
                                }
                                        
                                if(currentState >= 15)
                                {
                                    currentState -=15;
                                    System.out.println("\nAi destui bani pt o cafea mare(pret 15). \nAi cumparat o cafea mare");				
                                }
                                break;
                                }
                           
                    }
            }
            else
            {
		System.out.println("\n Introduceti bancnote de 10 sau 15");
            }
			
	}
    }
}