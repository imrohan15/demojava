package training.main.methodoverriding;

public class SwipeMachineTest {

	public static void main(String[] args) {
		SwipeMachine normal=new SwipeMachine();
		normal.readCard();
		System.out.println("**********Using Normal Referance Variable**********");
		
		normal=new ChipCardMachine();
		normal.readCard();
		
		System.out.println("**********Using Chipcard Referance Variable**********");
		SwipeMachine chipCard=new ChipCardMachine();
		chipCard.readCard();
		
		System.out.println(chipCard instanceof ChipCardMachine);
		System.out.println(chipCard instanceof SwipeMachine);
	}

}
