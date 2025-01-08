import java.util.HashMap;
import java.util.Map;

public class Countries {
    private static final Map<String, String[]> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new String[]{"Pakistan", "China", "Nepal", "Bangladesh", "Bhutan"});
        countryMap.put("US", new String[]{"Canada", "Mexico"});
        countryMap.put("NZ", new String[]{}); 
        countryMap.put("AU", new String[]{});
    }

    public String[] getAdjacentCountries(String countryCode) {
        return countryMap.get(countryCode);
    }
}