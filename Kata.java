
public class Kata {

	public static void main(String[] args) {
		System.out.println(reverseWords("This is an example!"));
		System.out.println(reverseWords("double  spaces"));
		System.out.println(reverseWords("This is an example!"));
		System.out.println(reverseWords("This is an example!"));
	}

	public static String reverseWords(final String original)
	{
		String word = "";
		String fliporiginal = "";
		for(int i=0; i<original.length(); i++) {
			if(original.substring(i, i+1).equals(" ")) {
				fliporiginal += flipword(word);
				word = "";
				fliporiginal += " ";
			}
			else
				word += original.substring(i, i+1);
		}
		fliporiginal += flipword(word);
		return fliporiginal;
	}
	
	public static String flipword(String word) {
		String flipword = "";
		for(int i=word.length(); i>0; i--) {
			flipword += word.substring(i-1, i);
		}
		return flipword;
	}
}
