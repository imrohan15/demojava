package training.main.dayfive.iostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromConsole {

	public static void main(String[] args) {
		try {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Salary : ");
			Double sal= 1.0;
			while(sal!=0.0) {
			sal= Double.parseDouble(br.readLine());
			System.out.println("Salary : "+sal);
			}
			isr.close();
			br.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

}
