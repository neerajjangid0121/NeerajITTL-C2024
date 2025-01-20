import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a country code (e.g., IN, US, NZ): ");
        String countryCode = scanner.nextLine().toUpperCase();

        CountryHelper countryHelper = new CountryHelper();
        String[] adjacentCountries = countryHelper.getAdjacentCountries(countryCode);

        if (adjacentCountries.length > 0) {
            System.out.println("Adjacent countries to " + countryCode + ":");
            for (String adjacentCountry : adjacentCountries) {
                System.out.println("- " + adjacentCountry);
            }
        } else {
            System.out.println("No data available for the provided country code or the country has no adjacent countries.");
        }

        scanner.close();
    }
}