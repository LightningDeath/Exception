package Model;
import Exception.*;

public class Parsing {
    public String[] parsing(String data) throws DataExceptionLittle, DataExceptionMany{
        String[] newData = data.split(" ");
        if (newData.length <= 5){
            throw new DataExceptionLittle();
        }else if (newData.length > 6 ) {
            throw new DataExceptionMany();
        }
        return newData;
    }
}
