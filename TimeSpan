// Represents a time span of elapsed hours and minutes.
// Simple implementation using only total minutes as state.
public class TimeSpan implements Comparable<TimeSpan> {
   private int totalMinutes;

   // Constructs a time span with the given interval.
   // pre: hours >= 0 && minutes >= 0
   public TimeSpan(int hours, int minutes) {
      totalMinutes = 0;
      add(hours, minutes);
   }
   
   // Adds the given interval to this time span.
   // pre: hours >= 0 && minutes >= 0
   public void add(int hours, int minutes) {
      totalMinutes += 60 * hours + minutes;
   }

   // Returns a String for this time span such as "6h15m".
   public String toString() {
      return (totalMinutes / 60) + "h"
             + (totalMinutes % 60) + "m";
   }

//sort by total minutes. Returns zero if time is same
public int compareTo(TimeSpan o) {
	if(totalMinutes < o.totalMinutes) {
		return -1;
	}else if(totalMinutes >o.totalMinutes) {
		return 1;
	}else {
		return 0;
	}
}
}
