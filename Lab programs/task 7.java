import java.util.*;

public class HashtagFrequencyCounter {

    public static void main(String[] args) {
        String text = "#Java is great. #Java is powerful. #AI and #Java are popular. #AI";

        Map<String, Integer> frequency = new HashMap<>();

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (word.startsWith("#")) {
                String hashtag = word.replaceAll("[^#a-zA-Z0-9_]", "");

                frequency.put(hashtag, frequency.getOrDefault(hashtag, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}





#Java : 3
#AI : 2
