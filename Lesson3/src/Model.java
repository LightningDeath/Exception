import Model.*;
import Exception.*;

import java.io.IOException;

public class Model {
    private static final Parsing par = new Parsing();
    private static final WriteFile wf = new WriteFile();
    private static final CheckDate cd = new CheckDate();
    private static final CheckGender cg = new CheckGender();
    private static final CheckPhone cp = new CheckPhone();


    public String[] parsing(String data) throws DataExceptionMany, DataExceptionLittle {
        return par.parsing(data);
    }

    public void writeFile(String[] data) throws IOException {
        wf.writeFile(data);
    }

    public void checkDate(String date) throws DateBirthFormatException{
        cd.checkDate(date);
    }

    public void checkPhone(String phone) throws PhoneNumberFormatException{
        cp.checkPhone(phone);
    }

    public void checkGender(String gender) throws GenderException{
        cg.checkGender(gender);
    }
}
