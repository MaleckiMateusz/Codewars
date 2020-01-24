
public class Troll {

	public static void main(String[] args) {
		if("bcd fgh jkl mnp rst wxyz".equals(disemvowel("abcd efgh ijkl mnop rstu wxyz"))) System.out.println("1");
		else System.out.println(disemvowel("abcd efgh ijkl mnop rstu wxyz"));
		
		if("Ths wbst s fr lsrs LL!".equals(disemvowel("This website is for losers LOL!"))) System.out.println("2");
		else System.out.println(disemvowel("This website is for losers LOL!"));
		
		if("Wht r y,  cmmnst?".equals(disemvowel("What are you, a communist?"))) System.out.println("3");
		else System.out.println(disemvowel("What are you, a communist?"));
		
		if("N ffns bt,\\\\nYr wrtng s mng th wrst 'v vr rd".equals(disemvowel("No offense but,\\nYour writing is among the worst I've ever read"))) System.out.println("4");
		else System.out.println(disemvowel("No offense but,\\nYour writing is among the worst I've ever read"));
		

	}
	public static String disemvowel(String allstr) {
		return allstr.replaceAll("(?i)[aeiou]" , "");
    }
/*
	public static String disemvowel(String allstr) {
		String withoutVowel = new String();
		for( int i=0; i<allstr.length(); i++) {
				if(!(allstr.substring(i, i+1).equals("a") || allstr.substring(i, i+1).equals("e")
						 || allstr.substring(i, i+1).equals("i") || allstr.substring(i, i+1).equals("o")
						 || allstr.substring(i, i+1).equals("u")))
					withoutVowel += allstr.substring(i, i+1);
			}
        return withoutVowel;
    }
*/
}
