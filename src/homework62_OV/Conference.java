package homework62_OV;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Conference implements Comparable<Conference> {
    private String topic;
    private LocalDateTime time;
    private String link;

    public Conference(String topic, String date, String time, String link) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH-mm");
        LocalDate localDate = LocalDate.parse(date, dtf);
        LocalTime localTime =LocalTime.parse(time, dtf2);
        this.time = LocalDateTime.of(localDate, localTime);
        this.topic = topic;
        this.link = link;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Conference{" + "topic='" + topic + '\'' + ", time=" + time + ", link='" + link + '\'' + '}';
    }

    @Override
    public int compareTo(Conference o) {
        return this.time.compareTo(o.time);
    }
}
