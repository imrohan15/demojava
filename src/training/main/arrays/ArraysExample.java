package training.main.arrays;
public class ArraysExample {
	int intNum[];
	ArraysExample(int i){
		intNum=new int[i];
	}
	
	void populateArray() {
		for (int i = 0; i < intNum.length; i++) {
			intNum[i]=i;
		}
	}
	
	void displayArray() {
		for (int i = 0; i < intNum.length; ++i) {
			System.out.println("Number "+i+" : "+intNum[i]);
		}
	}
	
	public static void main(String[] args) {
		int intArg=Integer.parseInt(args[0]);
		ArraysExample ae=new ArraysExample(intArg);
		ae.displayArray();
		System.out.println("**********************");
		ae.populateArray();
		ae.displayArray();
	}
}
