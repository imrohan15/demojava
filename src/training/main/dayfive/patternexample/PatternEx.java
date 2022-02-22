package training.main.dayfive.patternexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		//"abc adef fed abs def ghi" --- abs def
		//pattern abc we want to search in above string or character sequence
		//in java we have pattern API or class and it provides us method to search a pattern
		
		// Pattern.complile method compiles the given regular expression into a pattern
		// .a is a regular expression
		// String or sequence of character which "pa"
		Pattern p = Pattern.compile(".a"); //.a is a regex representing a single character  
		
		Matcher m = p.matcher("pa"); //using matcher method we are trying to 
		boolean matches=m.matches();
		System.out.println(matches);
		
		boolean pattern=Pattern.compile(".a").matcher("sp").matches();
		System.out.println(pattern);
		
		System.out.println(Pattern.compile("..a").matcher("spa").matches());
		System.out.println(Pattern.compile("....n").matcher("rohan").matches());
		
		System.out.println(Pattern.compile("^[\\w]+$").matcher("ABCabc1230").matches());
		System.out.println(Pattern.compile("^pq*?",Pattern.CASE_INSENSITIVE).matcher("pq").matches());
		System.out.println(Pattern.compile("^[a-z]+_[a-z]+$").matcher("java_pattern").matches());
		System.out.println(Pattern.compile("^[A-Z]+[a-z]+$").matcher("Rohan").matches());
		System.out.println(Pattern.compile("p.*?q$").matcher("pkinisq").matches());
		
		
	}

}
