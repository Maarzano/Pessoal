package maarzano.obtenhacachorrofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import maarzano.obtenhacachorrofx.Models.ApiConection;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView dogImage;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Buscando imagem de cachorro...");
        new Thread(() -> {
            String imageUrl = ApiConection.getRandomDogImage();

            if (imageUrl != null) {
                javafx.application.Platform.runLater(() -> {
                    dogImage.setImage(new Image(imageUrl));
                    welcomeText.setText("Aqui está um cachorro!");
                });
            } else {
                javafx.application.Platform.runLater(() -> {
                    welcomeText.setText("Erro ao carregar imagem.");
                });
            }
        }).start();
    }
}