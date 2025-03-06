package maarzano.obtenhacachorrofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import maarzano.obtenhacachorrofx.Models.ApiConection;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView dogImage;

    @FXML
    private ProgressIndicator loadingIndicator;

    @FXML
    private StackPane imageContainer;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Buscando imagem...");
        loadingIndicator.setVisible(true);

        new Thread(() -> {
            String imageUrl = ApiConection.getRandomDogImage();

            javafx.application.Platform.runLater(() -> {
                loadingIndicator.setVisible(false);

                if (imageUrl != null) {
                    Image image = new Image(imageUrl, true);

                    dogImage.setImage(image);
                    welcomeText.setText("Aqui está um cachorro fofo!");
                } else {
                    welcomeText.setText("Erro ao carregar imagem.");
                }
            });
        }).start();
    }
}
