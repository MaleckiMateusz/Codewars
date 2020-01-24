
public class Kata2 {

	public static void main(String[] args) {
		int[] result = countPositivesSumNegatives(new int[] {});
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] countPositivesSumNegatives(int[] input)
    {
		int[] result = new int[0];
		if(input == null) 
			return result;
		
		int[] result1 = new int[2];
		for( int num : input) {
			if(num > 0) result1[0]++;
			else result1[1] += num;
		}
        return result1; //return an array with count of positives and sum of negatives
    }
}
