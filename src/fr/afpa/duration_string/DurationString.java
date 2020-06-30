package fr.afpa.duration_string;

public class DurationString {
	
	private static final String INVALID_MESSAGE = "Invalid value";
	
	public static final String getDurationString(long minutes, long seconds) {
		if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			
			return INVALID_MESSAGE ;
			
		}
		
		long hours = minutes / 60; //hours le nombre d'heures 
		long remainingMinutes = minutes % 60; // remainingMinutes le nombre de secondes
		
		String hoursString = hours +"h";  //hoursString nous renvoie le format XXh
		
		if(hours < 10) {
			hoursString = "0" + hoursString;
		}
		
		String minutesString = remainingMinutes + "m";
		if(remainingMinutes < 0) {
			minutesString = "0" + minutesString;
		}
		
		String secondsString = seconds + "s";
		if (seconds <0) {
		    secondsString = "0" + secondsString;
		}
		
		return hoursString + " "+minutesString+ " "+secondsString+ " ";
	}
	
	public static String getDurationString(long seconds) {
		if(seconds < 0) {
			return INVALID_MESSAGE ;
		}
		
		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60; // le restant des secondes
		
		return getDurationString(minutes, remainingSeconds);
	}

}
