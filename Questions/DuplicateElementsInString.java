package Questions;

import java.util.HashMap;
import java.util.Map;
public class DuplicateElementsInString {
    public static void main(String[] args) {
        String input = "Java";
        findDuplicate(input);
    }

    public static void findDuplicate(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (c != ' ') { 
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Duplicate characters in \"" + str + "\":");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
