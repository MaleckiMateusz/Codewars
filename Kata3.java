import java.util.Arrays;

public class Kata3 {

	public static void main(String[] args) {
		System.out.println(switchItUp(1));
		System.out.println(switchItUp(3));
		System.out.println(switchItUp(9));

	}
	
	public static String switchItUp(int number)
	  {
		switch(number) {
			case 0:return "Zero";
			case 1:return "One";
			case 2:return "Two";
			case 3:return "Three";
			case 4:return "Four";
			case 5:return "Five";
			case 6:return "Six";
			case 7:return "Seven";
			case 8:return "Eight";
		}
		return "Nine";
	  }

}
