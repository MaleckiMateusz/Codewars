
public class Kata5 {

	public static void main(String[] args) {
		

		
		System.out.println(findMissingLetter(new char[] {'a','b','c','d','f'}));
		System.out.println(findMissingLetter(new char[] {'O','Q','R','S'}));

		
	}
	/*
	public static char findMissingLetter(char[] array)
	{
		int num = (int)(array[0]);
		for(int i=0; i<array.length; i++, num++) {
			if(num != (int)(array[i])) {
				return (char)((int)(array[0])+i);
			}
		}
		return '0';
	}
	*/
	public static char findMissingLetter(char[] array)
	{
		int num = (int)(array[0]);
		for(int i=0; i<array.length; i++, num++) 
			if(num != (int)(array[i]))
				return (char)((int)(array[0])+i);
		return '0';
	}

}
