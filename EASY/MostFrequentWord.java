import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {

        String paragraph =
                "Ram hit a ball, the hit ball flew far after it was hit";

        String banned[] = {"hit"};

        paragraph = paragraph.toLowerCase()
                .replaceAll("[^a-z ]", "");

        String[] words = paragraph.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        HashSet<String> bannedSet =
                new HashSet<>(Arrays.asList(banned));

        for (String word : words) {

            if (!bannedSet.contains(word)) {

                map.put(word,
                        map.getOrDefault(word, 0) + 1);
            }
        }

        String result = "";
        int max = 0;

        for (String key : map.keySet()) {

            if (map.get(key) > max) {

                max = map.get(key);
                result = key;
            }
        }

        System.out.println(result);
    }
}