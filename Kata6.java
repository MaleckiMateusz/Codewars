
public class Kata6 {

	public static void main(String[] args) {
		System.out.println(squareSum(new int[] {1,2,2})); //9
		System.out.println(squareSum(new int[] {1,2})); //5
		System.out.println(squareSum(new int[] {5,-3,4})); //50

	}
	
	public static int squareSum(int[] n)
	{ 
		int sum = 0;
		for(int i=0; i<n.length; i++)
			sum += n[i]*n[i];
		return sum;
	}

}
