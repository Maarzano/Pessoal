package maarzano.obtenhacachorrofx.Models;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiConection {
    private static final String API_URL = "https://dog.ceo/api/breeds/image/random";

    public static String getRandomDogImage(){
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(API_URL).openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            JsonObject jsonResponse = JsonParser.parseReader(reader).getAsJsonObject();
            String imageUrl = jsonResponse.get("message").getAsString();

            reader.close();
            connection.disconnect();

            return imageUrl;

        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
