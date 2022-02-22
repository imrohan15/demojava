package training.main.Assignment2;
import java.util.Scanner;

public class FindIntArray {

	public static void main(String[] args) {
		int t=0;
		int arr[]=new int[10];
		java.util.Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int n=sc.nextInt();
		System.out.print("Enter Array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Entered Array : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nEnter the Number you want to Search : ");
		int search=sc.nextInt();
		for (int i = 0; i < n; i++) {
			if(search==arr[i]) {
				System.out.println(search +" found at index "+i);
				t=1;
			}
		}
		if(t==0) {
			System.out.println("Not Found");
		}
	}

}
