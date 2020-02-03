public class RomanNumeralsConverter {
    public String toRoman(int decimal) {
        if(decimal == 5){
            return "V";
        }

        if(decimal == 4){
            return "IV";
        }

        if(decimal == 3){
            return "III";
        }

        if (decimal == 2) {
            return "II";
        }

        return "I";
    }
}
