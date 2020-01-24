
public class MaxRotate {

	public static void main(String[] args) {
		System.out.println(maxRot(56789)); 
		
		System.out.println(maxRot(38458215)); //85821534
		System.out.println(maxRot(195881031)); //988103115
		
		System.out.println(maxRot(896219342)); //962193428

	}
	
	public static long maxRot (long n) {

		long max = n;
		for(int i=0; i<String.valueOf(n).length(); i++) {
			n = rotation(n, i);
			if(n > max) max = n;
		} 
		return (long) n;
    }

	public static long rotation (long number, int count) {
		String firstpart = Long.toString(number).substring(0, count);
		String middlepart = Long.toString(number).substring(count, count+1);
		String lastpart = Long.toString(number).substring(count+1);
		return Integer.parseInt(firstpart + lastpart + middlepart);
	}
}
