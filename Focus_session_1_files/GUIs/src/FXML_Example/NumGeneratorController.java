package FXML_Example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;


public class NumGeneratorController{
    @FXML
    private Label number;

    @FXML
    private Label winner;

    @FXML
    private Button button;

    @FXML
    private Label max;

    private int maxNum = 0;

    @FXML
    private void generateNumber(){
        int num = (int)(Math.random()*1000) + 1;
        String numStr = num + "";
        number.setText(numStr);
        if(num>500){
            winner.setText("   Winner!");
            winner.setTextFill(Color.GREEN);
        }else{
            winner.setTextFill(Color.RED);
            winner.setText("   Loser :(");
        }
        if(num > maxNum){
            maxNum = num;
            max.setText(num + "");
        }

    }

}

