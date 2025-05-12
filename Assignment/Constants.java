public class Constants {
    private static final String API_KEY = "68189078480c9226966156rjf929fe9";

    public static String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" +
            placeName.replace(" ", "%20") + "&key=" + API_KEY;
}
