
public class isogram {

	public static void main(String[] args) {
		System.out.println(isIsogram("Dermatoglyphics"));
		System.out.println(isIsogram("isogram"));
		System.out.println(isIsogram("moose"));
		System.out.println(isIsogram("isIsogram"));
		System.out.println(isIsogram("aba"));
		System.out.println(isIsogram("moOse"));
		System.out.println(isIsogram("thumbscrewjapingly"));
		System.out.println(isIsogram(""));

	}
	
	public static boolean  isIsogram(String str) {
        str = str.toUpperCase();
        boolean isogram = true;
        for(int i=0; i<str.length(); i++) {
        	for(int j=i+1; j<str.length()-i;j++) {
        		if(str.charAt(i) == str.charAt(j)) isogram = false;
        	}
        }
		return isogram;
    } 

}
