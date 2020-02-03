import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersShould {

    private RomanNumeralsConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new RomanNumeralsConverter();
    }

    @Test
    public void convert_number_one_to_I(){
        String result = converter.toRoman(1);

        assertEquals( "I", result);
    }

    @Test
    public void convert_number_two_to_II() {
        String result = converter.toRoman(2);

        assertEquals( "II", result);
    }

    @Test
    public void convert_number_three_to_III() {
        String result = converter.toRoman(3);

        assertEquals( "III", result);
    }

    @Test
    public void convert_number_four_to_IV() {
        String result = converter.toRoman(4);

        assertEquals( "IV", result);
    }


    @Test
    public void convert_number_5_to_V() {
        String result = converter.toRoman(5);

        assertEquals( "V", result);
    }

    @Test
    public void convert_number_6_to_VI() {
        String result = converter.toRoman(6);

        assertEquals( "VI", result);
    }
}

