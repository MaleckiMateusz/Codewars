import java.util.Arrays;
import java.util.stream.IntStream; 
public class Kata4 {

	public static void main(String[] args) {
		System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1}));
		System.out.println(findEvenIndex(new int[] {1,100,50,-51,1,1}));
		System.out.println(findEvenIndex(new int[] {1,2,3,4,5,6}));
		System.out.println(findEvenIndex(new int[] {20,10,30,10,10,15,35}));
		System.out.println(findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
		System.out.println(findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
		System.out.println(findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
	}

	public static int findEvenIndex(int[] arr) {
		int sumLEFT = 0, sumrRIGHT = 0;
		for(int index=0; index<arr.length; index++) {
		sumLEFT = sumarr(Arrays.copyOfRange(arr, 0, index));
		sumrRIGHT = sumarr(Arrays.copyOfRange(arr, index+1, arr.length));
		if(sumLEFT == sumrRIGHT) return index;
		}
		return -1;
	}

	private static int sumarr(int[] copyOfRange) {
		return IntStream.of(copyOfRange).sum();
	}

}
