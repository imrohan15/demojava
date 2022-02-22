package training.main.dayfour.StringEx.Assignment;

public class StringQue1to3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println("Initial Capacity : "+sb.capacity());
	
		String hannah = "Did Hannah see bees? Hannah did.";
	/*2-a*/	System.out.println(hannah.length());
	/*2-b*/	System.out.println(hannah.charAt(12));
	/*2-c*/	System.out.println(hannah.charAt(15));
		
	/*3*/	System.out.println("Was it a car or a cat I saw?".substring(9, 12));
	}
}
