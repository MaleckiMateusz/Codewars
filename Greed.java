
public class Greed {

	public static void main(String[] args) {
		System.out.println(greedy(new int[]{5,1,3,4,1})); //250
		System.out.println(greedy(new int[]{1,1,1,3,1})); //1100
		System.out.println(greedy(new int[]{2,4,4,5,4})); //450

	}
	
	public static int greedy(int[] dice){
	    int[] howManyNum = new int[7];
	    for(int d : dice)
	    	howManyNum[d]++;
	    
	    int score = 0;
	    for(int i=2; i<howManyNum.length; i++)
	    	if(howManyNum[i] >= 3) {
	    		score += i * 100;
	    		howManyNum[i] -= 3;
	    	}
	    if(howManyNum[1] > 0) score += howManyNum[1] * 100;
	    if(howManyNum[5] > 0) score += howManyNum[5] * 50;
	    return score;
	}

}
