import java.util.regex.Pattern;

public class TimeParser {

    public static int parseHour(String input) {
        if (validate(input)) {
            int hour = Integer.parseInt(input.substring(0, input.indexOf(":")));
            return hour;

        } else {
            return -1;
        }
    }

    public static int parseMinutes(String input) {
        if (validate(input)) {
            int minutes = Integer.parseInt(input.substring(input.indexOf(":") + 1));
            return minutes;

        } else {
            return -1;
        }
    }

    private static boolean validate(String s) {
        return Pattern.compile("[0-2][0-9]:[0-5][0-9]").matcher(s).matches();
    }

}
