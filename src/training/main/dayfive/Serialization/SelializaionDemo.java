package training.main.dayfive.Serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SelializaionDemo {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpId(101);
		e.setName("Aakash");
		System.out.println(e);
		
		//serialize an object e
		//write an object into a file system
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\corejavaexample\\src\\corejavaexample\\main\\dayfive\\iostream\\SerializedObject.txt"); 
		FileOutputStream fos;
		try {
			fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*Deserialize
		Employee emp;
		try (FileOutputStream fis=new FileOutputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);){
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}*/
	}

}
