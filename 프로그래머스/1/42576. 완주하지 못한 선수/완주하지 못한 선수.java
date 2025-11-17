import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Boolean> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, !map.getOrDefault(s, true));
        }

        for (String s : completion) {
            map.put(s, !map.getOrDefault(s, false));
        }

        return map.entrySet().stream()
                .filter(entry -> !entry.getValue())
                .map(Map.Entry::getKey)
                .reduce((first, second) -> second)
                .orElse("");
    }
}