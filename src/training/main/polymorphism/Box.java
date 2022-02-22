package training.main.polymorphism;

public class Box {
	private double doubleValue;
	public Box() {
		//default const no argument
	}
	public Box(double doubleValue) {
		//cont with 1 argument
		this.doubleValue = doubleValue;
	}
	//assuming box is rectangular
	public void calculateVol(int l,int b,int h){
		System.out.println("Volume of Rectangle : "+l*b*h);
	}
	//assuming box is square
	public void calculateVol(int s){
		System.out.println("Volume of Square : "+s*s*s);
	}
	//assuming box is square
		public void calculateVol(double s){
			System.out.println("Volume of Sqaure : "+s*s*s);
		}
}
