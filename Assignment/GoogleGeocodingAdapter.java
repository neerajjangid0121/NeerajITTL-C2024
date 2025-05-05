import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class GoogleGeocodingAdapter implements GeoService {

    private static final String API_KEY = "68189078480c9226966156rjf929fe9";

    @Override
    public GeoCoordinates getCoordinates(String placeName) throws Exception {
        String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + 
                      placeName.replace(" ", "%20") + "&key=" + API_KEY;

        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
        );

        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        JSONObject json = new JSONObject(response.toString());
        JSONArray results = json.getJSONArray("results");

        if (results.length() == 0) {
            throw new Exception("No results found for the place.");
        }

        JSONObject location = results.getJSONObject(0)
                .getJSONObject("geometry")
                .getJSONObject("location");

        double lat = location.getDouble("lat");
        double lng = location.getDouble("lng");

        return new GeoCoordinates(lat, lng);
    }
}
