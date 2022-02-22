package training.main.dayfive.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
			//Read Byte from a file
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\corejavaexample\\src\\corejavaexample\\main\\dayfive\\iostream\\output1.txt");
			//read single char from file
		/*	int  i = fis.read();
			System.out.println(i);
			System.out.println((char)i);
			System.out.println(fis.read());
			*/
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
