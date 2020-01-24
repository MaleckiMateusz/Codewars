
public class Snail {

	public static void main(String[] args) {
		int[][] array
        = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
		int[] res = snail(array);
		for(int  i : res)
			System.out.print(i);
		
		System.out.println();
		int[][] array1
        = {{1, 2, 3 , 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
		int[] res1 = snail(array1);
		for(int  i : res1)
			System.out.print(i);
	}
	
	public static int[] snail(int[][] array) {
		if(array[0].length == 0) return new int[]{};
		
		int Bright = array.length, Bdown = array.length, Bleft = 0, Bup = 0;
		int[] result = new int[array.length*array.length];
		int resultCounter = 0;
		
		for(int j=0; j<array.length; j++) {
			for(int i=Bleft; i<Bright; i++) result[resultCounter++] = array[Bup][i];
			Bup++;
			for(int i=Bup; i<Bdown; i++) result[resultCounter++] = array[i][Bright-1];
			Bright--;
			for(int i=Bright-1; i>=Bleft; i--) result[resultCounter++] = array[Bdown-1][i];
			Bdown--;
			for(int i=Bdown-1; i>=Bup; i--) result[resultCounter++] = array[i][Bleft];
			Bleft++;
		}
		
		return result;
	 } 
}
