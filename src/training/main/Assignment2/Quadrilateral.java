package training.main.Assignment2;

public abstract class Quadrilateral {
	int base,height;
	public Quadrilateral() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Quadrilateral(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	abstract void area();

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
