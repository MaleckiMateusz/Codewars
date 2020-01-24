
public class RemoveChars {

	public static void main(String[] args) {
		System.out.println(remove("eloquent"));
		System.out.println(remove("country"));
		System.out.println(remove("person"));
		System.out.println(remove("place"));

	}
	
	public static String remove(String str) {
		return str.substring(1, str.length()-1);
    }

}
