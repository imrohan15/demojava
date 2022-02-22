package training.main.methodoverriding;

public class ChipCardMachine extends SwipeMachine{
	@Override
	public void readCard() {
		System.out.println("Read Card to read chip card from from Swipe Machine");
	}
}
