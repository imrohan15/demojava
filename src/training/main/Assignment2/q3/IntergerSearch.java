package training.main.Assignment2.q3;

public class IntergerSearch extends AbstractSerachMain{
	public boolean search(Object[] obj_list, Object obj) {
		for (int i = 0; i < obj_list.length; i++) {
			if(obj_list[i]==obj) 
				return true;
		}
		return false;
	}
}
