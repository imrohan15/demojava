package training.main.dayfour.StringEx;

public class StringModification {
	//java.lanf.StingBuffer allow modification to string
	public static void main(String[] args) {
		String x="abc";
		x=x.concat("def");
		System.out.println("X = "+x);
		
		StringBuffer sb=new StringBuffer("fgh");
		sb.append("ijk");
		System.out.println("sb = "+sb);
		//StringBuilder class exactly same API as the STringBuffer class 
		// except it is not thread safe(Not Synchronized) . it runs faster than StringBuffer
		
		sb.insert(2,"AAA");
		System.out.println(sb);
		
		sb.replace(6,8,"HI");
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		StringBuffer sbuff=new StringBuffer();
		System.out.println("Default Capacity : "+sbuff.capacity());
		sbuff.append("Lunch");
		System.out.println("Capacity : "+sbuff.capacity());
		sbuff.append("its Lunch Time");
		System.out.println("Capacity : "+sbuff.capacity());
	}
}
