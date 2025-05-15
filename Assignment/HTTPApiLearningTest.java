public class HTTPApiLearningTest {
    public void testSendGetWithValidPlaceName() throws Exception {
        String placeName = "Jaipur";
        String url = Constants.buildGeocodeUrl(placeName);
        String response = HttpApiUtility.sendGet(url);
        assertNotNull(response);
        assertTrue(response.contains("Jaipur"), "Response should contain 'Jaipur'");
        System.out.println("Response: " + response);
    }
}
