package _06_Meeting_Scheduler;

public class MeetingScheduler {
    /*
     * Your task is to code a method to find a meeting time for two people
     * given their schedules.
     * 
     * Code the method below so that it returns a Schedule object that contains
     * all the times during the week that are in BOTH people's schedules. The
     * Schedule class is included in this package.
     * 
     * Example:
     * person1 availability - Monday at 9, Tuesday at 14, and Friday 10
     * person2 availability - Tuesday at 14, Friday 8, and Monday at 9
     * The returned HashMap should contain: Tuesday 14 and Monday 9
     * 
     * The returned Schedule object represents the times both people are
     * available for a meeting.
     * 
     * Time availability is always at the top of the hour, so 9:30 is not valid
     * Time availability always represents 1 hour
     * Assume both schedules are in the same time zones
     */
    public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
       Schedule r = new Schedule();
    	MeetingSchedulerTest m = new MeetingSchedulerTest();
     String[] day = new String[7];
     day[0] = "Monday";
     day[1] = "Tuesday";
     day[2] = "Wednesday";
     day[3] = "Thursday";
     day[4] = "Friday";
     day[5] = "Saturday";
     day[6] = "Sunday";
     for(String d:day) {
    	for (int i:person1.getSchedule().get(d)) {
		for(int k:person2.getSchedule().get(d)) {
			if(i == k) {
				r.addAvailability(d, i);
			}
		}
	}
     }
        return r;
    }
}
