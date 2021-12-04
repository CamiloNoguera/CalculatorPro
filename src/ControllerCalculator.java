import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    private Button btn;
    ObservableList<String> list = FXCollections.observableArrayList("1. Binario a octal","2. Binario a decimal","3. Binario a hexadecimal","4. Octal a binario","5. Octal a decimal","6. Octal a hexadecimal","7. Decimal a binario","8. Decimal a octal","9. Decimal a hexadecimal","10. Hexadecimal a binario","11. Hexadecimal a octal","12. Hexadecimal a decimal");

    @FXML
    void btnCalcular(ActionEvent event) {
        int cantConvetir = Integer.parseInt(Cant.getText());
        String selectionCombo = Combo.getValue();
        // Operaciones operacion = new Operaciones(cantConvetir);

        if(selectionCombo == "1. Binario a octal"){
            int decimal = binarioADecimal(cantConvetir);
            Result.setText(decimalAOctal(decimal));
        }
        
        
    }

        // Validadores
        public static boolean validarDecimal(int decimal) {
            // Decimal pasa la validación con el hecho de que sea entero
            return true;
        }
    
        public static boolean validarBinario(int binario) {
            // Comprobar si solo se compone de unos y ceros
            String binarioComoCadena = String.valueOf(binario);
            for (int i = 0; i < binarioComoCadena.length(); i++) {
                char caracter = binarioComoCadena.charAt(i);
                if (caracter != '0' && caracter != '1') {
                    return false;
                }
            }
            return true;
        }
    
        public static boolean validarOctal(int octal) {
            // comprobar si solo tiene números del 0 al 7
            String octalComoCadena = String.valueOf(octal);
            String caracteresOctales = "01234567";
            for (int i = 0; i < octalComoCadena.length(); i++) {
                char caracter = octalComoCadena.charAt(i);
                // Si no se encuentra dentro de los caracteres válidos, regresamos false
                if (caracteresOctales.indexOf(caracter) == -1) {
                    return false;
                }
            }
            return true;
        }
    
        // Nota: se debe enviar la cadena hexadecimal convertida a mayúsculas
        public static boolean validarHexadecimal(String hexadecimal) {
            // Comprobar si solo tiene números del 0 al 9 y letras de la A a la F
            String caracteresHexadecimales = "0123456789ABCDEF";
            for (int i = 0; i < hexadecimal.length(); i++) {
                char caracter = hexadecimal.charAt(i);
                // Si no se encuentra dentro de los caracteres válidos, regresamos false
                if (caracteresHexadecimales.indexOf(caracter) == -1) {
                    return false;
                }
            }
            return true;
        }
    
        //De Decimal a otras bases
        public static String decimalABinario(int decimal) {
            String binario = "";
            while (decimal > 0) {
                binario = decimal % 2 + binario;
                decimal = decimal / 2;
            }
            return binario;
        }
    
        public static String decimalAOctal(int decimal) {
            int residuo;
            String octal = "";
            char[] caracteresOctales = {'0', '1', '2', '3', '4', '5', '6', '7'};
            while (decimal > 0) {
                residuo = decimal % 8;
                char caracter = caracteresOctales[residuo];
                octal = caracter + octal;
                decimal = decimal / 8;
            }
            return octal;
        }
    
        public static String decimalAHexadecimal(int decimal) {
            int residuo;
            String hexadecimal = "";
            char[] caracteresHexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            while (decimal > 0) {
                residuo = decimal % 16;
                char caracterHexadecimal = caracteresHexadecimales[residuo];
                hexadecimal = caracterHexadecimal + hexadecimal;
                decimal = decimal / 16;
            }
            return hexadecimal;
        }
    
        // Conversiones de otras bases a decimal
        public static int binarioADecimal(int binario) {
            int decimal = 0;
            int potencia = 0;
            // Ciclo infinito hasta que binario sea 0
            while (true) {
                if (binario == 0) {
                    break;
                } else {
                    int temp = binario % 10;
                    decimal += temp * Math.pow(2, potencia);
                    binario = binario / 10;
                    potencia++;
                }
            }
            return decimal;
        }
    
        public static int octalADecimal(int octal) {
            int decimal = 0;
            int potencia = 0;
            // Ciclo infinito que se rompe cuando octal es 0
            while (true) {
                if (octal == 0) {
                    break;
                } else {
                    int temp = octal % 10;
                    decimal += temp * Math.pow(8, potencia);
                    octal = octal / 10;
                    potencia++;
                }
            }
            return decimal;
        }
    
        public static int hexadecimalADecimal(String hexadecimal) {
            String caracteresHexadecimales = "0123456789ABCDEF";
            hexadecimal = hexadecimal.toUpperCase();
            int decimal = 0;
            for (int i = 0; i < hexadecimal.length(); i++) {
                char caracter = hexadecimal.charAt(i);
                int posicionEnCaracteres = caracteresHexadecimales.indexOf(caracter);
                decimal = 16 * decimal + posicionEnCaracteres;
            }
            return decimal;
        }

    @FXML
    void btnLimpiar(ActionEvent event) {
        Cant.setText("");
        Result.setText("");
        Cant.requestFocus(); 
        this.Combo.getSelectionModel().clearSelection();
        this.Combo.setValue(null);
    }

    @FXML
    void initialize() {
        Combo.setItems(list);
        
    }
}