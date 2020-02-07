
public class CountIPAddresses {

	public static void main(String[] args) {
		System.out.println(ipsBetween( "10.0.0.0", "10.1.0.0" ));
		System.out.println(ipsBetween( "20.0.0.10", "20.0.1.0" ));
		
		
	}
	
	public static long ipsBetween(String start, String end) {
		String[] ipStr1 = start.split("\\.");
		String[] ipStr2 = end.split("\\.");
		int score = 0;
		for(int i=0;i<4;i++) {
			int ip = Integer.parseInt(ipStr1[i]);
			ip -= Integer.parseInt(ipStr2[i]);
			score = score * 256 + ip;		
			}

		return score < 0 ? -score : score;
	}

}
