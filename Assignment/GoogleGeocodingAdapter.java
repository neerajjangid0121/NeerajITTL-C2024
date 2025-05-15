import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class GoogleGeocodingAdapter implements GeoService {

    public GeoCoordinates getCoordinates(String placeName) throws Exception {
        String jsonResponse = HttpClientHelper.sendGet(Constants.url);

        JSONObject json = new JSONObject(jsonResponse);
        JSONArray results = json.getJSONArray("results");

        if (results.length() == 0) {
            throw new Exception("No results found for the place.");
        }

        JSONObject location = results.getJSONObject(0)
                .getJSONObject("geometry")
                .getJSONObject("location");

        double latitude = location.getDouble("lat");
        double longitude = location.getDouble("lng");

        return new GeoCoordinates(latitude, longitude);
    }
}
