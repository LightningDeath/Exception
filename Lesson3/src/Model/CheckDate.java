package Model;
import Exception.DateBirthFormatException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckDate {
    public void checkDate(String date) throws DateBirthFormatException {
        SimpleDateFormat dateForm = new SimpleDateFormat("dd.MM.yyyy");
        dateForm.setLenient(false);
        try{
            dateForm.parse(date);
        }catch (ParseException e) {
            throw new DateBirthFormatException();
        }
    }
}
