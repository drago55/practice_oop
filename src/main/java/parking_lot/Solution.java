package parking_lot;

public class Solution {

    private static final int PARKING_ENTRY_FEE = 2;
    private static final int PARKING_FIRST_HOUR_FEE = 3;
    private static final int REGULAR_PARKING_HOUR_FEE = 4;

    public static void main(String[] args) {

    }

    public int solution(String E, String L) {

        int partialHour = parseMinutes(E, L);
        int hours = parseHours(E, L);
        int totalHours = hours + partialHour;

        if (totalHours == 0 && partialHour == 0) {
            return PARKING_ENTRY_FEE;
        }
        System.out.println("partial hours:" + partialHour + " hour "+ hours +" totalHours:" + totalHours + " extraHours:" + (totalHours - 1));
        return PARKING_ENTRY_FEE + PARKING_FIRST_HOUR_FEE + ((totalHours - 1) * REGULAR_PARKING_HOUR_FEE);
    }

    private int parseHours(String e, String l) {
        String[] firstTime = e.split(":");
        String[] secondTime = l.split(":");
        return getHour(firstTime[0], secondTime[0]);
    }

    private int parseMinutes(String e, String l) {
        String[] firstTime = e.split(":");
        String[] secondTime = l.split(":");
        return getPartialHour(firstTime[1], secondTime[1]);
    }

    private int getPartialHour(String s, String s1) {
        return  (59-Integer.valueOf(s).intValue() + Integer.valueOf(s1).intValue()) <= 59 ? 0 : 1;
     }

    private int getHour(String s, String s1) {
        return Integer.valueOf(s1).intValue() - Integer.valueOf(s).intValue();
    }

}
