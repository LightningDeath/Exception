import java.io.IOException;
import java.util.Arrays;

import Exception.*;

import static java.lang.System.exit;


public class Presentor {
    private static final Model mod = new Model();
    private static final View vw = new View();

    public static void Run() {
        String[] newData;
        String data = vw.ED();

        try {
            newData = mod.parsing(data);
        } catch (DataExceptionLittle e) {
            vw.Info("Недостаточно данных! Повторите ввод.");
            newData = new String[5];
            Run();
        } catch (DataExceptionMany e) {
            vw.Info("Введено слишком много данных! Повторите ввод.");
            newData = new String[5];
            Run();
        }

        try{
            mod.checkDate(newData[3]);
        }catch (DateBirthFormatException e){
            vw.Info("Не верный формат даты рождения(верный формат дд.мм.гггг)! Повторите ввод.");
            newData = new String[5];
            Run();
        }

        try {
            mod.checkPhone(newData[4]);
        }catch (PhoneNumberFormatException e){
            vw.Info("Не верный номер телефона! Должны присутствовать только цифры! Повторите ввод.");
            newData = new String[5];
            Run();
        }

        try{
            mod.checkGender(newData[5]);
        }catch (GenderException e){
            vw.Info("Выбран не верный пол (формат ввода f - женский, m - мужской! Повторите ввод");
            newData = new String[5];
            Run();
        }

        try {
            mod.writeFile(newData);
            exit(0);
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}