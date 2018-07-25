import java.util.Arrays;

class CalendarConverter {

    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    static String convertDayToString(int dayNumber) {
        String dayName = "";
        switch (dayNumber) {
            case MONDAY:
                dayName = "Poniedziałek";
                break;
            case TUESDAY:
                dayName = "Wtorek";
                break;
            case WEDNESDAY:
                dayName = "Sroda";
                break;
            case THURSDAY:
                dayName = "Czwartek";
                break;
            case FRIDAY:
                dayName = "Piątek";
                break;
            case SATURDAY:
                dayName = "Sobota";
                break;
            case SUNDAY:
                dayName = "Niedziela";
                break;

        }
        return dayName;
    }
}
