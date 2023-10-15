package homework63;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Violin implements Comparable<Violin> {
    private String nameOfMaster;
    private LocalDate dateOfProduction;

    public Violin(String nameOfMaster, String date) {
        this.nameOfMaster = nameOfMaster;
        this.dateOfProduction = stringToDate(date);
    }

    private LocalDate stringToDate(String str) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(str, dtf);
    }

    public String getNameOfMaster() {
        return nameOfMaster;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    @Override
    public String toString() {
        return "Violin{" + "nameOfMaster='" + nameOfMaster + '\'' + ", dateOfProduction=" + dateOfProduction + '}';
    }

    @Override
    public int compareTo(Violin o) {
        return this.dateOfProduction.compareTo(o.dateOfProduction);
    }
}
