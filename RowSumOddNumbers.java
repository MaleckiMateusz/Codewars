
public class RowSumOddNumbers {

	public static void main(String[] args) {
		System.out.println(rowSumOddNumbers(1)); //1
		System.out.println(rowSumOddNumbers(2)); //8
		System.out.println(rowSumOddNumbers(3));
		System.out.println(rowSumOddNumbers(4));
		System.out.println(rowSumOddNumbers(5));
		System.out.println(rowSumOddNumbers(42));

	}
	
	public static int rowSumOddNumbers(int n) {
		int firstInRow = 1;
		for(int i=1; i<n; i++)
			firstInRow += 2*i;
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += firstInRow;
			firstInRow += 2;
		}
		 
		return sum; // ty idioto, wynik to n*n*n :)
    }
}
