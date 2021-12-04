import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ControllerCalculator {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Cant;

    @FXML
    private TextField Result;

    @FXML
    private ChoiceBox<String> Combo;

    @FXML
    void btnCalcular(ActionEvent event) {
        //int op1 = Integer.parseInt(Cant.getText());
        String op1 = Cant.getText();
        Result.setText(op1);
    }

    @FXML
    void btnLimpiar(ActionEvent event) {
        Cant.setText("");
        Result.setText("");
        Cant.requestFocus();
        //Combo.
    }

    @FXML
    void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("1. Binario a octal","2. Binario a decimal","3. Binario a hexadecimal","4. Octal a binario","5. Octal a decimal","6. Octal a hexadecimal","7. Decimal a binario","8. Decimal a octal","9. Decimal a hexadecimal","10. Hexadecimal a binario","11. Hexadecimal a octal","12. Hexadecimal a decimal");
        Combo.setItems(list);
    }
}