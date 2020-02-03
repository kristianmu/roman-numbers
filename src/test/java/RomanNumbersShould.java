import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersShould {

    @Test
    public void convert_number_one_to_I(){
        converter converter = new converter();

        String result = converter.toRoman(1);

        assertEquals(result, "I");
    }
}

