public class ArabicInteger {
    private static final String NumeralFor1 = "I";
    private static final String NumeralFor5 = "V";
    private static final String NumeralFor10 = "X";
    private final int integer;

    public ArabicInteger(int integer) {
        this.integer = integer;
    }

    public String toRomanNumeral() {
        if(integer < 4) {
            return appendNumeralFor1To("", integer);
        }
        else if(integer == 4) {
            return NumeralFor1 + NumeralFor5;
        }
        else if(integer == 5) {
            return NumeralFor5;
        }
        else if(integer < 9) {
            int numberOfIsToAdd = integer - 5;
            return appendNumeralFor1To(NumeralFor5, numberOfIsToAdd);
        }
        else if(integer == 9) {
            return NumeralFor1 + NumeralFor10;
        }
        else if(integer == 10) {
            return NumeralFor10;
        }
        else if(integer < 14) {
            int numberOfIsToAdd = integer - 10;
            return appendNumeralFor1To(NumeralFor10, numberOfIsToAdd);
        }
        else if(integer == 14) {
            return NumeralFor10 + NumeralFor1 + NumeralFor5;
        }
        else if(integer == 15) {
            return NumeralFor10 + NumeralFor5;
        }
        else if(integer == 16) {
            return NumeralFor10 + NumeralFor5 + NumeralFor1;
        }
        else if(integer == 17) {
            return NumeralFor10 + NumeralFor5 + NumeralFor1 + NumeralFor1;
        }
        else {
            return NumeralFor10 + NumeralFor5 + NumeralFor1 + NumeralFor1 + NumeralFor1;
        }
    }

    private String appendNumeralFor1To(String baseNumeral, int numberOfIsToAdd) {
        for(int i = 0; i < numberOfIsToAdd; i++) {
           baseNumeral += NumeralFor1;
       }
        return baseNumeral;
    }
}
