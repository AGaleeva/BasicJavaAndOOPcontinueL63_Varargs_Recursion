package homework63;

import java.time.LocalDate;

public class ViolinAppl {

    /*
    Задание 3. Varargs

    Создайте класс скрипка. Пусть у скрипки будут поля:
    - String имя мастера,
    - LocalDate дата производства

    Создайте в Майне метод, который должен принимать произвольное
    число скрипок и возвращать имя мастера самой старой скрипки из переданных.
    То есть метод должен бытия статическим и возвращать String.
    */
    public static void main(String[] args) {
        Violin v1 = new Violin("Amati", "1652-12-31");
        Violin v2 = new Violin("Amati", "1635-12-31");
        Violin v3 = new Violin("Guiseppe Guarneri", "1735-12-31");
        Violin v4 = new Violin("Vuillaume", "1842-12-31");



        System.out.println(getNameofViolinMaster(v1, v2, v3, v4));
    }

    public static String getNameofViolinMaster(Violin... violins) {
        LocalDate oldestDate = violins[0].getDateOfProduction();
        int j = 0;
        for (int i = 0; i < violins.length; i++) {
            if (violins[i].getDateOfProduction().isBefore(oldestDate)) {
                oldestDate = violins[i].getDateOfProduction();
                j++;
            }
        }
        return violins[j].getNameOfMaster() + "\nНе имей Амати, а умей играти!";
    }
}
