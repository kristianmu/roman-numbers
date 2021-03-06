public class RomanNumeralsConverter {

    public enum RomanNumber {
        C,
        XC,
        L,
        XL,
        X,
        IX,
        V,
        IV,
        I,
    }

    public String toRoman(int decimal) {
        String result = "";

        while (decimal >= 100) {
            result += RomanNumber.C.toString();
            decimal -= 100;
        }

        if (decimal >= 90) {
            result += RomanNumber.XC.toString();
            decimal -= 90;
        }

        if (decimal >= 50) {
            result += RomanNumber.L.toString();
            decimal -= 50;
        }

        if (decimal >= 40) {
            result += RomanNumber.XL.toString();
            decimal -= 40;
        }

        while (decimal >= 10) {
            result += RomanNumber.X.toString();
            decimal -= 10;
        }

        if (decimal == 9) {
            return RomanNumber.IX.toString();
        }

        if (decimal >= 5) {
            result += RomanNumber.V.toString();
            decimal -= 5;
        }

        if (decimal == 4) {
            result += RomanNumber.IV.toString();
            decimal -= 4;
        }

        for (int i = decimal; i > 0; i--) {
            result += RomanNumber.I.toString();
        }

        return result;
    }
}
