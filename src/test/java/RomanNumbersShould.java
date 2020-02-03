import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersShould {

    @Test
    public void convert_number_one_to_I(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        String result = romanNumeralsConverter.toRoman(1);

        assertEquals(result, "I");
    }

    @Test
    public void convert_number_two_to_II() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        String result = romanNumeralsConverter.toRoman(2);

        assertEquals(result, "II");
    }
}

