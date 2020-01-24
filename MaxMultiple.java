
public class MaxMultiple {

	public static void main(String[] args) {
		System.out.println(maxMultiple(2, 7)); //6
		System.out.println(maxMultiple(3, 10)); //9
		System.out.println(maxMultiple(7, 17)); //14

	}
	
	public static int maxMultiple(int divisor, int bound) {
		return bound-bound%divisor;
	 }

}
