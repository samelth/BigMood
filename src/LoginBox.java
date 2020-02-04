import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class LoginBox {

    public static void display(String title){

        Stage window = new Stage();

        GradientPaint gp =
                new GradientPaint(0, 0, Color.MAGENTA,
                        0, 100, Color.YELLOW);

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);
        window.setMinHeight(200);
        window.resizableProperty().asObject().setValue(false);

        Label userLabel = new Label();
        userLabel.setText("Username");

        TextField userInput = new TextField();
        TextField passwordInput = new TextField();
        userInput.setMaxSize(200,5);

        Label passwordLabel = new Label();
        passwordLabel.setText("Password");
        passwordInput.setMaxSize(200,5);

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e->window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(userLabel,userInput,passwordLabel,passwordInput,loginButton);
        layout.setStyle("-fx-background-color: linear-gradient(#E4EAA2, #9CD672);");
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
}
