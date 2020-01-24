
public class Max {

	public static void main(String[] args) {
		System.out.println(sequence(new int[]{}));
		System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

	}

	public static int sequence(int[] arr) {
		if(arr.length == 0) return 0;
		if(arr.length == 1) return arr[0];
		if(arr.length == 2) return arr[0] + arr[1];
		int max = arr[0];
		int almostmax = arr[1];
		for(int i=2; i<arr.length; i++) {
			if(arr[i] >= max) {
				almostmax = max;
				max = arr[i];
			}
			else 
			{
				if(arr[i] > almostmax) almostmax = arr[i];
			}
		}
	    return max+almostmax;
	 }
}
