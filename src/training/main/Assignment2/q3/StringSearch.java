package training.main.Assignment2.q3;

public class StringSearch extends AbstractSerachMain {
	public boolean search(Object[] obj_list, Object obj) {
		for (int i = 0; i < obj_list.length; i++) {
			if(obj_list[i].equals(obj)) 
				return true;
		}
		return false;
	}
}
