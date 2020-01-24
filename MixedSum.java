import java.util.Arrays;
import java.util.List;

public class MixedSum {

	public static void main(String[] args) {
		System.out.println(sum(Arrays.asList(5,"5")));
		System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
		System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
		System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
		System.out.println(sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
		System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
		System.out.println(sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));

	}
	public static int sum(List<?> mixed) {	
		int result = 0;
		for(Object s : mixed)
			result += Integer.parseInt(s.toString());
		return result;
	}

}
