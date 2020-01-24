//https://www.codewars.com/kata/54d7660d2daf68c619000d95/train/java
public class Fracts {

	public static void main(String[] args) {
		
	    long[][] lst;
		lst = new long[][] { {1, 2}, {1, 3}, {10, 40} };
	    System.out.println(convertFrac(lst));
	    
	    long[][] lst1;
	    lst1 = new long[][] { {69, 130}, {87, 1310}, {30, 40} }; // Expect (18078,34060)(2262,34060)(25545,34060)
	    System.out.println(convertFrac(lst1));
	    
	    long[][] lst2;
	    lst2 = new long[][] {  }; 
	    System.out.println(convertFrac(lst2));
	}
	
	public static String convertFrac(long[][] lst) {
		
		long[] NWDarr = new long[lst.length];
		for(int i=0; i<lst.length; i++)
			NWDarr[i] = NWD(lst[i][0], lst[i][1]);

		for(int i=0; i<NWDarr.length; i++) {
			lst[i][0] = lst[i][0] / NWDarr[i];
			lst[i][1] = lst[i][1] / NWDarr[i];
		}
		
		long denominator = 0;
		if(lst.length > 0) denominator = lst[0][1];
		for(int i=0;i<lst.length; i++)
			denominator = LCM(denominator, lst[i][1]);

		String str = ""; 
		for(int i=0;i<NWDarr.length; i++)
			str += "(" + denominator/lst[i][1]*lst[i][0] + "," + denominator + ")";

		return str;
	  }
	
	public static long LCM(long a, long b) {
		return (a*b)/NWD(a, b);
    }
	
	public static long NWD(long first, long second) {
        while (first != second)
            if (first > second) first = first - second;
            else second = second - first;
        return first; 
    }
	
	public static long multiMax(long[] nWDarr) {
		long max = nWDarr[0];
		long almostmax = nWDarr[1];
		for(int i=2; i<nWDarr.length; i++) {
			if(nWDarr[i] >= max) {
				almostmax = max;
				max = nWDarr[i];
			}
			else 
				if(nWDarr[i] > almostmax) almostmax = nWDarr[i];
		}
	    return max*almostmax;
    }
}
