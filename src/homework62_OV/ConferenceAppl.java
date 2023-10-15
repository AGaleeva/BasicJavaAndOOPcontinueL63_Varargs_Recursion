package homework62_OV;

import java.util.List;

public class ConferenceAppl {
    public static void main(String[] args) {

        List<Conference> conferences = List.of(
                new Conference("project", "17-10-2023", "09-30", "https//link"),
                new Conference("threads", "16-10-2023", "09-30", "https//link"),
                new Conference("project2", "15-10-2023", "09-30", "https//link")
        );

        List<Conference> orderedConferences = conferences.stream().sorted().toList();
        System.out.println(orderedConferences);
    }
}
