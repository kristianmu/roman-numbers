public class RomanNumeralsConverter {

    public enum RomanNumber {
        X,
        IX,
        V,
        IV,
        I,
    }

    public String toRoman(int decimal) {
        String result = "";

        while (decimal >= 10){
            result += RomanNumber.X.toString();
            decimal -= 10;
        }

        if(decimal == 9){
            return RomanNumber.IX.toString();
        }

        if(decimal >= 5){
            result += RomanNumber.V.toString();
            decimal -= 5;
        }

        if(decimal == 4){
            result += RomanNumber.IV.toString();
            decimal -= 4;
        }

        for (int i = decimal; i > 0; i--) {
             result += RomanNumber.I.toString();
        }

        return result;
    }
}
