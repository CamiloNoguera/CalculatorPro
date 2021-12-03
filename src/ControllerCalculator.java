import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
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
    private RadioButton Decimal1;

    @FXML
    private RadioButton Bin1;

    @FXML
    private RadioButton Octal1;

    @FXML
    private RadioButton Hexa1;

    @FXML
    private RadioButton Decimal2;

    @FXML
    private RadioButton Bin2;

    @FXML
    private RadioButton Octal2;

    @FXML
    private RadioButton Hexa2;

    @FXML
    void btnCalcular(ActionEvent event) {

    }

    @FXML
    void btnLimpiar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Cant != null : "fx:id=\"Cant\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";
        assert Result != null : "fx:id=\"Result\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";
        assert Decimal1 != null : "fx:id=\"Decimal1\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";
        assert Bin1 != null : "fx:id=\"Bin1\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";
        assert Octal1 != null : "fx:id=\"Octal1\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";
        assert Hexa1 != null : "fx:id=\"Hexa1\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";
        assert Decimal2 != null : "fx:id=\"Decimal2\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";
        assert Bin2 != null : "fx:id=\"Bin2\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";
        assert Octal2 != null : "fx:id=\"Octal2\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";
        assert Hexa2 != null : "fx:id=\"Hexa2\" was not injected: check your FXML file 'Interfaz_calculator.fxml'.";

    }
}

