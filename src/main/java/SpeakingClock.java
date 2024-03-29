import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SpeakingClock {


    public static String sayTheTime(String input) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                            "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
                            "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine",
                            "thirty", "thirty one", "thirty two", "thirty three", "thirty four",
                            "thirty five", "thirty six", "thirty seven", "thirty eight", "thirty nine",
                            "forty", "forty one", "forty two", "forty three", "forty four",
                            "forty five", "forty six", "forty seven", "forty eight", "forty nine",
                            "fifty", "fifty one", "fifty two", "fifty three", "fifty four",
                            "fifty five", "fifty six", "fifty seven", "fifty eight", "fifty nine",
                            "sixty"
                            };

        Optional<String> s = Arrays.stream(numbers)
                .filter(n -> n.equals("sixty"))
                .findFirst();

        List<String> numbersList = Arrays.asList(numbers);

        if (s.isPresent()) {
            numbersList.remove(s.get());

        }

        String[] numbersAfterConversion = new String[numbersList.size()];
        numbersList.toArray(numbersAfterConversion);


        String result = "It's ";
        int hour = TimeParser.parseHour((input));
        int minutes = TimeParser.parseMinutes(input);

        if (hour == -1 || minutes == -1) {
            result = "Validation Failure. Check number of characters or format.";

        } else if (hour == 0 && minutes == 0) {
            result += "Midnight";

        } else if (hour == 12 && minutes == 0) {
            result += "Midday";

        } else if (hour != 0 && hour != 12 && minutes == 0) {
            result += numbersAfterConversion[hour];

        } else {
            result += numbersAfterConversion[hour] + " " + numbersAfterConversion[minutes];

        }

        return result;
    }
}
