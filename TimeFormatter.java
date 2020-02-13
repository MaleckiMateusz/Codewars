
public class TimeFormatter {

	public static void main(String[] args) {
		System.out.println(formatDuration(1));
		System.out.println(formatDuration(62));
		System.out.println(formatDuration(120));
		System.out.println(formatDuration(3600));
		System.out.println(formatDuration(3662));
		System.out.println(formatDuration(0));

	}
	
	public static String formatDuration(int seconds) {
		if(seconds == 0) return "now";
		
		int minutes = seconds / 60;
		seconds -= minutes * 60;
		int hours = minutes / 60;
		minutes -= hours * 60;
		int days = hours / 24;
		hours -= days * 24;
		int years = days / 365;
		days -= years * 365;
		
		int num_of_units = 0;
		String[] resultArray = new String[8];
		
		if(seconds == 1) resultArray[num_of_units++] = Integer.toString(seconds) + " second";
		if(seconds > 1) resultArray[num_of_units++] = Integer.toString(seconds) + " seconds";
		if(minutes == 1) resultArray[num_of_units++] = Integer.toString(minutes) + " minute";
		if(minutes > 1) resultArray[num_of_units++] = Integer.toString(minutes) + " minutes";
		if(hours == 1) resultArray[num_of_units++] = Integer.toString(hours) + " hour";
		if(hours > 1) resultArray[num_of_units++] = Integer.toString(hours) + " hours";
		if(days == 1) resultArray[num_of_units++] = Integer.toString(days) + " day";
		if(days > 1) resultArray[num_of_units++] = Integer.toString(days) + " days";
		if(years == 1) resultArray[num_of_units++] = Integer.toString(years) + " year";
		if(years > 1) resultArray[num_of_units++] = Integer.toString(years) + " years";
		
		String result = "";
		for(int i=num_of_units-1; i>0; i--) {
			result += resultArray[i];
			if( i == 1 ) result += " and ";
			else result += ", ";
		}

		return result += resultArray[0];
    }

}
