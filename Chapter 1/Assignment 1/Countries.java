import java.util.HashMap;
import java.util.Map;

public class Countries {
    private static final Map<String, String[]> countryCodeToItsAdjacentCountriesMap = new HashMap<>();

    static {
        countryCodeToItsAdjacentCountriesMap.put("IN", new String[]{"Pakistan", "China", "Nepal", "Bangladesh", "Bhutan"});
        countryCodeToItsAdjacentCountriesMap.put("US", new String[]{"Canada", "Mexico"});
        countryCodeToItsAdjacentCountriesMap.put("NZ", new String[]{}); 
        countryCodeToItsAdjacentCountriesMap.put("AU", new String[]{});
    }

    public String[] getAdjacentCountries(String countryCode) {
        return countryCodeToItsAdjacentCountriesMap.get(countryCode);
    }
}