import java.util.Arrays;
public class Minimum {

	public static void main(String[] args) {
		System.out.println(minValue(new int[] {1,3,1}));
		System.out.println(minValue(new int[] {4, 7, 5, 7}));
		System.out.println(minValue(new int[] {4, 8, 1, 4}));
		System.out.println(minValue(new int[] {5, 7, 9, 5, 7}));
		System.out.println(minValue(new int[] {6, 7, 8, 7, 6, 6}));

	}
	
	public static int minValue(int[] values){
		Arrays.sort(values);	
		String num = "";
		num += values[0];
		for (int i=1; i<values.length; i++) 
			if(values[i] != values[i-1]) num += values[i];
			   
		return Integer.parseInt(num);
	}

}
