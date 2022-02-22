package training.main.dayfive.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class AppendInAFile {
	public static void main(String[] args) {
		try {
			String data="Its intresting to learn IO";
			File file=new File("C:\\Users\\HP\\eclipse-workspace\\corejavaexample\\src\\corejavaexample\\main\\dayfive\\iostream\\writerABC.txt");
				if(!file.exists()) {
					file.createNewFile();
				}
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(" || "+data);
			bw.close();
			
			FileReader fr=new FileReader("C:\\Users\\HP\\eclipse-workspace\\corejavaexample\\src\\corejavaexample\\main\\dayfive\\iostream\\writerABC.txt");
			BufferedReader br=new BufferedReader(fr);
			System.out.println(br.readLine());
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
