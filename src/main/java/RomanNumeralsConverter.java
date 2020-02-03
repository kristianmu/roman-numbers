public class RomanNumeralsConverter {
    public String toRoman(int decimal) {
        if(decimal == 5){
            return "V";
        }

        if(decimal == 4){
            return "IV";
        }

        String result = "";
        for (int i = decimal; i > 0; i--) {
             result += "I";
        }

        return result;
    }
}
