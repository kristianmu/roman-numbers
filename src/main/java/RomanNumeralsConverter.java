public class RomanNumeralsConverter {
    public String toRoman(int decimal) {
        String result = "";
        if(decimal >= 5){
            result = "V";
            decimal -= 5;
        }

        if(decimal == 4){
            return "IV";
        }

        for (int i = decimal; i > 0; i--) {
             result += "I";
        }

        return result;
    }
}
