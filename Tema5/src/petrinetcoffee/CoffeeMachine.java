package petrinetcoffee;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Luca
 */
public class CoffeeMachine extends PetriNetwork{
    public Integer Credit = 0;
    public CoffeeMachine() {

                Location locatie0 = new Location("0", 1);
		Arc arc05o = new Arc(1, locatie0, Direction.OUT);
                Arc arc010o = new Arc(1, locatie0, Direction.OUT);
                Arc arc100i = new Arc(1, locatie0, Direction.IN);
                Arc arc150i = new Arc(1, locatie0, Direction.IN);
                
                Location locatie5 = new Location("5", 0);
		Arc arc05i = new Arc(1, locatie5, Direction.IN);
                Arc arc510o = new Arc(1, locatie5, Direction.OUT);
                Arc arc515o = new Arc(1, locatie5, Direction.OUT);
                Arc arc155i = new Arc(1, locatie5, Direction.IN);

                Location locatie10 = new Location("10", 0);		
		Arc arc010i = new Arc(1, locatie10, Direction.IN);
		Arc arc510i = new Arc(1, locatie10, Direction.IN);
                Arc arc1015o = new Arc(1, locatie10, Direction.OUT);
                Arc arc100o = new Arc(1, locatie10, Direction.OUT);

		Location locatie15 = new Location("15", 0);
		Arc arc515i = new Arc(1, locatie15, Direction.IN);
		Arc arc1015i = new Arc(1, locatie15, Direction.IN);
		Arc arc155o = new Arc(1, locatie15, Direction.OUT);
		Arc arc150o = new Arc(1, locatie15, Direction.OUT);
		

		Transition tranzitie0_5_5 = new Transition(Arrays.asList(arc05o, arc05i), "5");
		Transition tranzitie0_10_10 = new Transition(Arrays.asList(arc010o, arc010i), "10");
		Transition tranzitie5_5_10 = new Transition(Arrays.asList(arc510o, arc510i), "5");
		Transition tranzitie5_10_15 = new Transition(Arrays.asList(arc515o, arc515i), "10");
		Transition tranzitie10_5_15 = new Transition(Arrays.asList(arc1015o, arc1015i), "5");
		Transition tranzitie10_c10_0 = new Transition(Arrays.asList(arc100o, arc100i), "c10");
		Transition tranzitie15_c10_5 = new Transition(Arrays.asList(arc155o, arc155i), "c10");
		Transition tranzitie15_c15_0 = new Transition(Arrays.asList(arc150o, arc150i), "c15");

		this.transitions = Arrays.asList(tranzitie0_5_5, tranzitie0_10_10, tranzitie5_5_10, tranzitie5_10_15,
				tranzitie10_5_15, tranzitie10_c10_0, tranzitie15_c10_5, tranzitie15_c15_0);
	}
    
    @Override
    public void messages(String input)
	{

		switch (input)
		{
		case "5":
			if (Credit == 0 || Credit == 5 || Credit == 10 )
			{
				this.Credit += 5;
				System.out.println("Credit: " + this.Credit);
			}
			break;

		case "10":
			if (Credit == 0 || Credit == 5 || Credit == 10)
			{
				this.Credit += 10;
				System.out.println("Credit: " + this.Credit.toString());
			}
			break;

		case "C10":

			if (this.Credit < 10)
			{
				System.out.println("Credit insuficient!");
			}
			else
			{
				System.out.println("Ai cumparat o cafea mica - 10 bani");
				this.Credit -= 10;
				System.out.println("Credit: " + this.Credit.toString());                        
			}
			break;

		case "C15":                    
			if (this.Credit < 15)
			{
				System.out.println("Credit insuficient!");
			}
			else
			{
				System.out.println("Ai cumparat o cafea mare - 15 bani");
				this.Credit = 0;
				System.out.println("Credit: " + this.Credit.toString());        
			}                   
			break;

		default:
			System.out.println("Invalid input");
			break;
		}


}
    String input = null;
    Scanner scanner = new Scanner(System.in);

	public void Run()
	{
		CoffeeMachine coffeemachine = new CoffeeMachine();

		while (true)
		{
			System.out.println("Introduceti bancnote:");
			input = scanner.nextLine().toUpperCase();
			coffeemachine.execute(input);
		}
}
}
