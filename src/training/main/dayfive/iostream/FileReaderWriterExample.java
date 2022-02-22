package training.main.dayfive.iostream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\corejavaexample\\\\src\\\\corejavaexample\\\\main\\\\dayfive\\\\iostream\\writer.txt");
			fw.write("Good Morning Everyone");
			fw.close();
			
			FileReader fr=new FileReader("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\corejavaexample\\\\src\\\\corejavaexample\\\\main\\\\dayfive\\\\iostream\\writer.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
