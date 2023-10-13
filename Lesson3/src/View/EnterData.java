package View;

import java.util.Scanner;

public class EnterData {
    Scanner in = new Scanner(System.in);

    public String ed(){
        System.out.println("Введите данные, разделяя пробелом, в формате: " +
                "'Фамилия Имя Отчество датарождения(дд.мм.гггг) номертелефона(1234567890) пол(f или m)'");
        System.out.print("--> ");
        in.reset();
        return in.nextLine();
    }

}
