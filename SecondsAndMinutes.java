import java.sql.SQLOutput;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE  = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(75,78));
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;

        }
        long hour  = minutes/60;
        long remainingMinute = minutes % 60;

        String hourString = hour + "h ";
        if (hour<10){
            hourString = "0" + hourString;
        }
        String minuteString = remainingMinute + "m ";
        if (remainingMinute<10){
            minuteString = "0" + minuteString;
        }
        String secondString = seconds + "s ";
        if (seconds<10){
            secondString = "0" + secondString;
        }
        return hourString + minuteString + secondString ;
        }

    public static String getDurationString(long seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
            long minutes = seconds/60;
        long remainSeconds = seconds % 60;
        return getDurationString(minutes, remainSeconds);

        }

}
