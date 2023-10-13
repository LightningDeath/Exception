package Model;
import Exception.GenderException;

public class CheckGender {
    public void checkGender(String gender) throws GenderException{
        if (!gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m")){
            throw new GenderException();
        }
    }
}
