import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		System.out.println(sortDesc(0));
		System.out.println(sortDesc(15));
		System.out.println(sortDesc(123456789));

	}

	public static int sortDesc(final int num) {
		String str = Integer.toString(num);
		int[] arr = new int[str.length()];
		for(int i=0; i<str.length(); i++)
			arr[i] = Integer.parseInt((str.substring(i, i+1)));
        Arrays.sort(arr); 
        int result = 0;
        for(int i=str.length()-1; i>0; i--) {
        	result += arr[i];
        	result*=10;
        }
		return result += arr[0];
	  }
}
