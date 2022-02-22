package training.main.dayfour.StringEx;

public class StringOperations {
	public static void main(String[] args) {
		String str="Core"; //New String(""Core) - That means new object will be created
		String s="Core";
		System.out.println(str.hashCode());
		System.out.println(s.hashCode());
		s="Hello";
		System.out.println(s.hashCode());
		
		System.out.println(s);
		String s1=s.replace('l','x');
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		String hello="Hello";
		System.out.println("hello : "+hello);
		System.out.println("Length of hello : "+hello.length());
		System.out.println("Index of 'e' in hello : "+hello.indexOf('e'));
		System.out.println("Sub String from hello : "+hello.substring(1));
		System.out.println("Sub String from hello : "+hello.substring(1,3));
		
		String hi="     Hi      ";
		System.out.println(hi);
		System.out.println("Remove WhiteSpaces : "+hi.trim());
		
	
		int num=12345;
		String numStr=String.valueOf(num);
		System.out.println(numStr instanceof String );
		
		String emptyStr="";
		System.out.println(emptyStr.isEmpty());
		
		System.out.println(hello.hashCode());
		hello=hello.concat(" Everyone");
		System.out.println(hello);
		System.out.println(hello.hashCode());
		
		String strStrip="      Hello World      ";
		System.out.println(strStrip.strip()); //same as trim
		System.out.println(strStrip.trim());
		System.out.println(strStrip.stripLeading());
		System.out.println(strStrip.stripTrailing());
		
		strStrip=strStrip.replaceAll("\\s","");
		System.out.println("After removing Whitespaces :"+strStrip);
		
		System.out.println(strStrip.toUpperCase());
		System.out.println(strStrip.toLowerCase());
		
		String fruit="Ap ple";
		System.out.println(fruit.length());
		String Para=("Hello Everyone. It is a beautiful sunny day. We are leaning string Concepts. This Function Shows how to format sentence into a paragraph.");
		for(String sentence:Para.split("[.]")) {
			System.out.println(sentence);
		}
	}
}
