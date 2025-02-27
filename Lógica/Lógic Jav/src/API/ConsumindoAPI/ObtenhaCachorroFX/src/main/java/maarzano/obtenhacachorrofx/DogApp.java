package maarzano.obtenhacachorrofx;

import com.google.gson.Gson;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DogApp extends Application {

    private static final String API_URL = "https://dog.ceo/api/breeds/image/random";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(20);
        Button fetchDogButton = new Button("Obter Imagem do Cachorro");
        ImageView imageView = new ImageView();
        root.getChildren().addAll(fetchDogButton, imageView);

        fetchDogButton.setOnAction(e -> {
            fetchRandomDogImage(imageView);
        });

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("API de Imagens de Cães");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void fetchRandomDogImage(ImageView imageView) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(API_URL).openConnection();
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStreamReader reader = new InputStreamReader(connection.getInputStream());
                Gson gson = new Gson();
                DogApiResponse response = gson.fromJson(reader, DogApiResponse.class);

                String imageUrl = response.getMessage();
                Image image = new Image(imageUrl);
                imageView.setImage(image);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class DogApiResponse {
        private String message;
        private String status;

        public String getMessage() {
            return message;
        }
    }
}
