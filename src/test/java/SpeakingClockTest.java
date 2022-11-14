import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class SpeakingClockTest {

    @Test
    public void givenTimeInHoursAndMinutes_whenHourEqualsEight_andMinutesEqualsFortyThree_thenReturnTimeUsingWords() {
        String input = "01:43";
        String expected = "It's one forty three";

        String actual = SpeakingClock.sayTheTime(input);

        assertNotNull(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void givenTimeInHoursAndMinutes_whenTimeLaterThanMidnightEarlierThanTen_thenReturnTimeUsingWords() {
        String input = "01:43";
        String expected = "It's one forty three";

        String actual = SpeakingClock.sayTheTime(input);

        assertNotNull(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void givenTimeInHoursAndMinutes_whenMinutesEqualsZero_and_HourNotEqualsZero_andHourNotEqualsTwelve_thenReturnTimeUsingWords() {
        String input = "01:00";
        String expected = "It's one";

        String actual = SpeakingClock.sayTheTime(input);

        assertNotNull(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void givenTimeInHoursAndMinutes_whenTimeLaterThanTenEarlierThanTwenty_thenReturnTimeUsingWords() {
        String input = "11:12";
        String expected = "It's eleven twelve";

        String actual = SpeakingClock.sayTheTime(input);

        assertNotNull(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void givenTimeInHoursAndMinutes_whenTimeLaterThanTwentyEarlierThanTwentyThreeFiftyNine_thenReturnTimeUsingWords() {
        String input = "22:23";
        String expected = "It's twenty two twenty three";

        String actual = SpeakingClock.sayTheTime(input);

        assertNotNull(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void givenTimeInHoursAndMinutes_whenHourEqualsTwentyThree_andMinutesEqualsFiftyNine_thenReturnTimeUsingWords() {
        String input = "23:59";
        String expected = "It's twenty three fifty nine";

        String actual = SpeakingClock.sayTheTime(input);

        assertNotNull(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void givenTimeInHoursAndMinutes_whenHourEqualsZero_andMinutesEqualsZero_thenReturnTimeUsingWords() {
        String input = "00:00";
        String expected = "It's Midnight";

        String actual = SpeakingClock.sayTheTime(input);

        assertNotNull(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void givenTimeInHoursAndMinutes_whenTimeNoon_thenReturnTimeUsingWords() {
        String input = "12:00";
        String expected = "It's Midday";

        String actual = SpeakingClock.sayTheTime(input);

        assertNotNull(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void givenTimeInHoursAndMinutes_whenInvalidInputStringFormat_thenReturnMessageValidationFailure() {
        String input = "11:1b";
        String expected = "Validation Failure. Check number of characters or format.";

        String actual = SpeakingClock.sayTheTime(input);

        assertNotNull(actual);
        assertTrue(expected.equals(actual));
    }
}
