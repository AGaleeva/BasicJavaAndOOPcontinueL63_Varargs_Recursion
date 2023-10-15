package homework62_OV;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateToString {
    /*
    Задача 2.
    Создайте метод, который принимает две даты LocalDate, а возвращает строку, сколько времени между ними пройдет.

    Например: "10 years, 2 months, 3 days"

    Используйте класс Period
    */

    public static void main(String[] args) {

//        %d - digit - для целочисленных значений
//        %f - float - для даблов и флоат (%.2f - два знака после запятой)
//        %s - String - для строк
//        %b - boolean - для булеан

        System.out.println(periodBetweenTwoDates(LocalDate.now(), LocalDate.of(2022, 12, 24)));
    }
    public static String periodBetweenTwoDates(LocalDate date1, LocalDate date2) {
        Period timePeriod = Period.between(date1, date2);

//        Математический метод дает погрешность в день, если даты в методе between поменять местами
//        int years = Math.abs(timePeriod.getYears());
//        int months = Math.abs(timePeriod.getMonths());
//        int days = Math.abs(timePeriod.getDays());

//        return String.format("%d years, %d months, %d days", years, months, days);
        return "";
    }
}
