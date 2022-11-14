import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeParserTest {

    @Test
    public void givenTimeAsString_whenParseHour_ThenReturnIntegerSuccess() {
        String input = "00:41";
        int expected = 0;

        int actual = TimeParser.parseHour(input);

        assertEquals(expected, actual);
    }

    @Test
    public void givenTimeAsString_whenParseMinutes_ThenReturnIntegerSuccess() {
        String input = "08:43";
        int expected = 43;

        int actual = TimeParser.parseMinutes(input);

        assertEquals(expected, actual);
    }

    @Test
    public void givenTimeAsString_whenParseMinutesIncorrectNumberOfCharacters_ThenFailOnValidation() {
        String input = "00:057";
        int expected = -1;

        int actual = TimeParser.parseMinutes(input);

        assertEquals(expected, actual);
    }

    @Test
    public void givenTimeAsString_whenParseHourIncorrectNumberOfCharacters_ThenFailOnValidation() {
        String input = "001:57";
        int expected = -1;

        int actual = TimeParser.parseMinutes(input);

        assertEquals(expected, actual);
    }

    @Test
    public void givenTimeAsString_whenParseHourIncorrectNumberOfCharacters_andWrongSubset_ThenFailOnValidation() {
        String input = "01a:57";
        int expected = -1;

        int actual = TimeParser.parseMinutes(input);

        assertEquals(expected, actual);
    }

    @Test
    public void givenTimeAsString_whenParseMinutesIncorrectNumberOfCharacters_andWrongSubset_ThenFailOnValidation() {
        String input = "01:57b";
        int expected = -1;

        int actual = TimeParser.parseMinutes(input);

        assertEquals(expected, actual);
    }

    @Test
    public void givenTimeAsString_whenParseHourInvalidCharacter_ThenFailOnValidation() {
        String input = "0a:57";
        int expected = -1;

        int actual = TimeParser.parseMinutes(input);

        assertEquals(expected, actual);
    }

    @Test
    public void givenTimeAsString_whenParseMinutesInvalidCharacter_ThenFailOnValidation() {
        String input = "00:5b";
        int expected = -1;

        int actual = TimeParser.parseMinutes(input);

        assertEquals(expected, actual);
    }

}
