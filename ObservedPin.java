import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObservedPin {
	
	static ArrayList<String> keys = new ArrayList();
	static ArrayList<String> variations = new ArrayList();
	
	public static void main(String[] args) {
		System.out.println(getPINs("369"));

	}

	public static List<String> getPINs(String observed) {	
		
		addkeys(observed); //add to keys variations
		
		createVarietions(); // add firsts variations
		
		for(int i=1; i<observed.length();i++) {
			multiplexingVarietions(i); // Multiplexing previous variations
			addNextVarietions(i); // add next numbers
		}
		
		Collections.sort(variations);
		
		// show variations
		int previoussize = variations.size() / keys.get(0).length();
		for(int i=0; i<variations.size(); i++) {
			if(i%previoussize == 0) System.out.println("");
			System.out.print(variations.get(i) + " ");
		}

		return variations;
    }

	private static void addNextVarietions(int num) {
		// add next numbers
		int previoussize = variations.size() / keys.get(num).length();
		for(int j=0; j<keys.get(num).length(); j++) {
			for(int i=j*previoussize; i<(j+1)*previoussize; i++) {	
				variations.add(i, (variations.get(i)  + keys.get(num).charAt(j)));
				variations.remove(i+1);
			}
		}
	}

	private static void multiplexingVarietions(int num) {
		// Multiplexing previous variations
		int previoussize = variations.size();
		for(int i=0; i<previoussize*(keys.get(num).length()-1); i++) {
			variations.add(variations.get(i));
		}
	}

	private static void createVarietions() {
		// add firsts variations
		for(int i=0; i<keys.get(0).length(); i++) {
			variations.add(keys.get(0).substring(i, i+1));
		}
		
	}

	private static void addkeys(String observed) {
		for(int i=0; i<observed.length(); i++) {
			switch (observed.charAt(i)) {
				case '1':keys.add("124");break;
				case '2':keys.add("1235");break;
				case '3':keys.add("236");break;
				case '4':keys.add("1457");break;	
				case '5':keys.add("24568");break;
				case '6':keys.add("3569");break;
				case '7':keys.add("478");break;
				case '8':keys.add("57890");;break;
				case '9':keys.add("689");break;
				case '0':keys.add("80");break;
			}
		}	
	}


	
}
