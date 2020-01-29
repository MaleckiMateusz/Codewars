
public class Line {

	public static void main(String[] args) {
		System.out.println(Tickets(new int[] {25, 25, 50})); //YES
		System.out.println(Tickets(new int []{25, 100}));  //NO
		System.out.println(Tickets(new int []{25, 25, 50, 50, 100}));  //NO
		System.out.println(Tickets(new int []{}));  //NO

	}

	public static String Tickets(int[] peopleInLine)
	{
		int num25 = 0;
		int num50 = 0;	
		for(int person : peopleInLine) {
			if(person == 25) num25++;
			if(person == 50) { num25--; num50++; }
			if(person == 100) {
				if(num50 > 0) { num50--; num25--; }
				else num25-=3;
			}
			if(num25 < 0 || num50 < 0) return "NO";
		}
		return "YES";
	}
}
