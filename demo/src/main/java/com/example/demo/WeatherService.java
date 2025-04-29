@Service
public class WeatherService {
    private final String API_KEY = "your_openweather_api_key";

    public String getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + API_KEY;
        return restTemplate.getForObject(url, String.class);
    }
}
