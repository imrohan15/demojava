package training.main.polymorphism;
//compile time polymorphism
public class BoxMain {
	public static void main(String arg[]) {
		Box b1=new Box();
		Box b2=new Box(30.50);
		
		b1.calculateVol(20.0);
		b1.calculateVol(50);
		b1.calculateVol(10, 20, 30);
	}
}
