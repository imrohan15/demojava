package training.main.dayfive.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
			//InputSTream and OutputStream API or classes to perform IO in our program
			//InputStream to read data from source and output stream to write data
		//Write a byte in a file
		try {
			String word="Hello Everyone";
			FileOutputStream fout=new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\corejavaexample\\src\\corejavaexample\\main\\dayfive\\iostream\\output1.txt");
			//fout.write(65);
			byte bArr[]=word.getBytes();
			fout.write(bArr);
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
