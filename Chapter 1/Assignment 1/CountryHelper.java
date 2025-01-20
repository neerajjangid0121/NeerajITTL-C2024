public class CountryHelper{
    public String[] getAdjacentCountries(String countryCode) {
        Countries data = new Countries();
        return data.getAdjacentCountries(countryCode);
    }
}