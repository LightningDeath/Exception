package Model;
import Exception.PhoneNumberFormatException;

public class CheckPhone {
    public void checkPhone(String phone) throws PhoneNumberFormatException{
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                throw new PhoneNumberFormatException();
            }
        }
    }
}
