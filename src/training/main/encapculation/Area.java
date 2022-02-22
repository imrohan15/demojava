package training.main.encapculation;

public class Area {
	private int length;
	private int bredth;
	public Area(int length, int bredth) {
		this.length = length;
		this.bredth = bredth;
	}
	 
	public void getArea() {
		int area=length*bredth;
		System.out.println("Area : "+area);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBredth() {
		return bredth;
	}

	public void setBredth(int bredth) {
		this.bredth = bredth;
	}
	
}
