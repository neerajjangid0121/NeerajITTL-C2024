import java.util.Scanner;

public class GeoAppRunner {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Place Name: ");
        String placeName = scanner.nextLine();

        GeoService geoService = new GoogleGeocodingAdapter();

        try {
            GeoCoordinates coordinates = geoService.getCoordinates(placeName);
            System.out.println("Latitude: " + coordinates.getLatitude());
            System.out.println("Longitude: " + coordinates.getLongitude());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
