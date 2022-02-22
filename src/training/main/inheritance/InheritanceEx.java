package training.main.inheritance;

public class InheritanceEx {
	public static void main(String[] args) {
		Printer p=new Printer();
		p.powerAdapter();
		p.printMessage();
		
		Scanner s=new Scanner();
		s.powerAdapter();
		s.scanDocs();
	}

}
