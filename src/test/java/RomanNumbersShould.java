import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class RomanNumbersShould {

    private RomanNumeralsConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new RomanNumeralsConverter();
    }

    @Test
    @Parameters({
            "1,I",
            "2,II",
            "3,III",
            "4,IV",
            "5,V",
            "6,VI",
            "7,VII",
            "8,VIII",
            "9,IX",
            "10,X",
            "11,XI",
            "14,XIV",
    })
    public void convert_decimals_to_roman_numbers(int decimal, String roman){
        String result = converter.toRoman(decimal);

        assertEquals( roman, result);
    }
}

