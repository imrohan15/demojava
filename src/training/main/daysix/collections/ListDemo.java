package training.main.daysix.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		//List can store the ordered collection of object.
		//it cat have Duplicate values
		//list interface is implements by the classes ArrayList,VectorList,Vector and Stack
		List arrayList=new ArrayList();
		List linkedList=new LinkedList();
		List vector=new Vector();
		List stack=new Stack();
		
		//ArrayList class implemets the List interface
		//it used a dynamic array to store the duplicate elemets
		//it maintains insertion order and is non-synchronized
		arrayList.add(11);
		arrayList.add("Hello");
		arrayList.add(10.56);
		arrayList.add('A');
		
		System.out.println("ArrayList Display"+arrayList);
		Iterator itr=arrayList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"  ");
		}
		System.out.println("\nIs Empty : "+arrayList.isEmpty());
		System.out.println("contains 'Hello' : "+arrayList.contains("Hello"));
		System.out.println("Element at index 2 : "+arrayList.get(2));
		System.out.println("Size : "+arrayList.size());
		System.out.println("Remove element at index 0 : "+arrayList.remove(0));
		System.out.println("ArrayList Display : "+arrayList);
		
		System.out.println("**********************************************");
		
		//here we are decoupling our code from a specific implementation of the interface
		//this is called programming to interface. it will be helpful in case you wish to move to other implementation of list in future
		//unlike ArrayList ar=new ArrayList();
		//List ls=new ArrayList();
		List<String> strList = new ArrayList<String>();
		strList.add("String List");
		//strList.add(10); //complile time error
		strList.add("String 2");
		strList.add("String 3");
		strList.add("String 4");
		strList.add(null);
		System.out.println(strList.size());
		System.out.println(strList);
		
		System.out.println("**********************************************");
		
		Employee e = new Employee();
		e.setEmpId(101);
		e.setEmpName("Aman");
		
		Employee e1 = new Employee();
		e1.setEmpId(102);
		e1.setEmpName("Mohit");
		
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(e);
		listOfEmp.add(e1);
		System.out.println(listOfEmp);
		System.out.println("\n**********************************************");
		for(Employee emp : listOfEmp ) {
			System.out.println(emp);
		}
		System.out.println("\n**********************************************");
		Iterator it=listOfEmp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"  ");
		}
		
		System.out.println("\n**********************************************");
		List<String> linkList = new LinkedList<String>();
		linkList.add("Yash");
		linkList.add("Sahil");
		linkList.add("Ajay");
		linkList.add("Ashwin");
		linkList.add("Ajay");
		linkList.add("Jay");
		Iterator itL=linkList.iterator();
		while(itL.hasNext()) {
			System.out.println(itL.next()+"  ");
		}
		System.out.println(linkList);
		linkList.set(1,"Ayushi");
		System.out.println(linkList);
		Collections.replaceAll(linkList,"Ajay", "Asmita");
		System.out.println(linkList);
		linkList.replaceAll(String::toUpperCase);
		System.out.println(linkList);
		
		//vector used a dynamic array to store the data elements. it is similar to ArrayList
		//it is synchronised and contains many methods that are not part of collection framework
		System.out.println("\n**********************************************\n");
		List<Integer> VecList = new Vector<Integer>();
		VecList.add(101);
		VecList.add(102);
		VecList.add(103);
		VecList.add(104);
		VecList.add(105);
		System.out.println("Vector Display :");
		for(Integer intNum:VecList) {
			System.out.println(intNum);
		}
		System.out.println(VecList);
		
		//stack is subclass of vector. it implements LIFO data structure i.e. Stack
		//it contains methods of vector and also provides like boolean push(),peek() etc
		List st = new Stack(); 
		Stack<Double> stackOfDoubleNum = new Stack<Double>();
		stackOfDoubleNum.push(10.20);
		stackOfDoubleNum.push(22.50);
		stackOfDoubleNum.push(14.00);
		stackOfDoubleNum.push(20.20);
		stackOfDoubleNum.push(40.20);
		
		for(Double num:stackOfDoubleNum) {
			System.out.print(num);
		}
		System.out.println("");
		System.out.println(stackOfDoubleNum);
		stackOfDoubleNum.pop();
		System.out.println(stackOfDoubleNum);
		
		Double[] arrDoubleNum = {55.65,44.50,88.20,44.59};
		Stack stackofDBStack = new Stack();
		stackofDBStack.push(arrDoubleNum);
		stackofDBStack.push("Stack");
		stackofDBStack.push(155);
		System.out.println(stackofDBStack);
		
		
	}
	
}
