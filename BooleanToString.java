
public class BooleanToString {

	public static void main(String[] args) {
		System.out.println(convert(true));
		System.out.println(convert(false));
	}
	
	public static String convert(boolean b){
		if(b) {
			return "true";
		} else {
			return "false";
		}
  }


}
