package RomanNumeral;

public class Validity {
    public boolean checkValidity(int num) {
        if(num >= 1 && num <=1000000) {
            return true;
        }
        return false;
    }
}
