import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorld extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Label message = new Label("Hello, World!\n I'm a label!");
        message.setFont(new Font("Comic Sans", 100));
        message.setTextFill(Color.RED);

        Button button = new Button("Click me!");
        button.setOnAction((ActionEvent event) -> {
            message.setText("Goodbye, World!");
        });

        HBox root = new HBox();
        root.getChildren().addAll(message, button);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Hello, World!");
        stage.show();
    }
}
