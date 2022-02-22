package training.main.dayfive.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndWriterEx {

	public static void main(String[] args) {
		try {
			FileWriter fe=new FileWriter("writer.txt");
			BufferedWriter bw=new BufferedWriter(fe);
			bw.write("Java provides IO related libraries in java.io package");
			//bw.append("It is intresting to append");
			bw.close();
			
			FileReader fr=new FileReader("writer.txt");
			BufferedReader br=new BufferedReader(fr);
			System.out.println(br.readLine());
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
