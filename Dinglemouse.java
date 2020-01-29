
public class Dinglemouse {

	public static void main(String[] args) {
		
		System.out.println(countDeafRats("~O~O~O~O P")); //0
		System.out.println(countDeafRats("P O~ O~ ~O O~")); //1
		System.out.println(countDeafRats("~O~O~O~OP~O~OO~")); //2

	}

	public static int countDeafRats(final String town) {
		int indexP = town.indexOf('P');
		int DeafRats = 0;
		
		for(int i=0; i<indexP; i++) //left side
			if(town.charAt(i) == '~' && town.charAt(i+1) == 'O') i++;
			else if(town.charAt(i) == 'O' && town.charAt(i+1) == '~') { DeafRats++; i++; }
		
		for(int i=indexP; i<town.length(); i++) //right side
			if(town.charAt(i) == 'O' && town.charAt(i+1) == '~') i++;
			else if(town.charAt(i) == '~' && town.charAt(i+1) == 'O') { DeafRats++; i++; }	
		return DeafRats;
	}
}
