package training.main.Assignment2.q3;

public class AbstractSerachMain {
	public static void main(String[] args) {
		Integer[] intObj = {21,55,7,656,7};
		String[] strObj = {"AAA","BBB","CCC","DDD","EEE"};
		IntergerSearch intSearch=new IntergerSearch();
		if(intSearch.search(intObj, 2)) {
			System.out.println("Int Item Found");
		}else {
			System.out.println("Int Item Not Found");
		}
		
		StringSearch strSearch=new StringSearch();
		if(strSearch.search(intObj, "BBB")){
			System.out.println("Str Item Found");			
		}else {
			System.out.println("Str Item Not Found");
		}
	}
}
