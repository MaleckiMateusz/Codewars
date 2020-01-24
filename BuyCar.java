
public class BuyCar {

	public static void main(String[] args) {
		int[] arr = nbMonths(2000, 8000, 1000, 1.5f);
		for(int i : arr) System.out.print(i + " ");
		System.out.println("");
		arr = nbMonths(12000, 8000, 1000, 1.5);
		for(int i : arr) System.out.print(i + " ");

	}

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
		double cash = 0, FstartPriceOld = startPriceOld, FstartPriceNew = startPriceNew;
	    int numMonth = 0;
	    percentLossByMonth /= 100;
	    
	    while(cash + FstartPriceOld <= FstartPriceNew) {
	    	cash += savingperMonth;
	    	if(numMonth%2 == 1) percentLossByMonth += 0.005;
	    	FstartPriceOld = (FstartPriceOld*(1-percentLossByMonth));
	    	FstartPriceNew = (FstartPriceNew*(1-percentLossByMonth));
	    	numMonth++;
	    }
		return new int[]{numMonth, (int) Math.round((cash+FstartPriceOld) - FstartPriceNew)};
	} 
}
