import java.util.Scanner;

public class Guia {
    public static void main(String[] args) throws Exception {
        System.out.println("1. Binario a octal\n" +
                "2. Binario a decimal\n" +
                "3. Binario a hexadecimal\n" +
                "4. Octal a binario\n" +
                "5. Octal a decimal\n" +
                "6. Octal a hexadecimal\n" +
                "7. Decimal a binario\n" +
                "8. Decimal a octal\n" +
                "9. Decimal a hexadecimal\n" +
                "10. Hexadecimal a binario\n" +
                "11. Hexadecimal a octal\n" +
                "12. Hexadecimal a decimal\n" +
                "Seleccione: ");
        try (Scanner sc = new Scanner(System.in)) {
            int eleccion = sc.nextInt();
            if (eleccion < 1 || eleccion > 12) {
                System.out.println("Elección no válida");
                return;
            }
            try (Scanner scanner = new Scanner(System.in)) {
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese número binario:");
                        int binario = scanner.nextInt();
                        if (!validarBinario(binario)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        int decimal = binarioADecimal(binario);
                        String octalResultante = decimalAOctal(decimal);
                        System.out.println("El octal es " + octalResultante);
                        break;
                    case 2:
                        System.out.println("Ingrese número binario:");
                        binario = scanner.nextInt();
                        if (!validarBinario(binario)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        decimal = binarioADecimal(binario);
                        System.out.println("El decimal es " + decimal);
                        break;

                    case 3:
                        System.out.println("Ingrese número binario:");
                        binario = scanner.nextInt();
                        if (!validarBinario(binario)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        decimal = binarioADecimal(binario);
                        String hexadecimal = decimalAHexadecimal(decimal);
                        System.out.println("El hexadecimal es " + hexadecimal);
                        break;
                    case 4:
                        System.out.println("Ingrese número octal:");
                        int octal = scanner.nextInt();
                        if (!validarOctal(octal)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        decimal = octalADecimal(octal);
                        String binarioResultante = decimalABinario(decimal);
                        System.out.println("El binario es " + binarioResultante);
                        break;
                    case 5:
                        System.out.println("Ingrese número octal:");
                        octal = scanner.nextInt();
                        if (!validarOctal(octal)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        decimal = octalADecimal(octal);
                        System.out.println("El decimal es " + decimal);
                        break;
                    case 6:
                        System.out.println("Ingrese número octal:");
                        octal = scanner.nextInt();
                        if (!validarOctal(octal)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        decimal = octalADecimal(octal);
                        String hexadecimalResultante = decimalAHexadecimal(decimal);
                        System.out.println("El hexadecimal es " + hexadecimalResultante);
                        break;
                    case 7:
                        System.out.println("Ingrese número decimal:");
                        decimal = scanner.nextInt();
                        if (!validarDecimal(decimal)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        binarioResultante = decimalABinario(decimal);
                        System.out.println("El binario es " + binarioResultante);
                        break;
                    case 8:
                        System.out.println("Ingrese número decimal:");
                        decimal = scanner.nextInt();
                        if (!validarDecimal(decimal)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        octalResultante = decimalAOctal(decimal);
                        System.out.println("El octal es " + octalResultante);
                        break;
                    case 9:
                        System.out.println("Ingrese número decimal:");
                        decimal = scanner.nextInt();
                        if (!validarDecimal(decimal)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        hexadecimalResultante = decimalAHexadecimal(decimal);
                        System.out.println("El hexadecimal es " + hexadecimalResultante);
                        break;
                    case 10:
                        System.out.println("Ingrese número hexadecimal:");
                        hexadecimal = scanner.nextLine().toUpperCase();
                        if (!validarHexadecimal(hexadecimal)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        decimal = hexadecimalADecimal(hexadecimal);
                        binarioResultante = decimalABinario(decimal);
                        System.out.println("El binario es " + binarioResultante);
                        break;
                    case 11:
                        System.out.println("Ingrese número hexadecimal:");
                        hexadecimal = scanner.nextLine().toUpperCase();
                        if (!validarHexadecimal(hexadecimal)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        decimal = hexadecimalADecimal(hexadecimal);
                        octalResultante = decimalAOctal(decimal);
                        System.out.println("El octal es " + octalResultante);
                        break;
                    case 12:
                        System.out.println("Ingrese número hexadecimal:");
                        hexadecimal = scanner.nextLine().toUpperCase();
                        if (!validarHexadecimal(hexadecimal)) {
                            System.out.println("Número no válido");
                            return;
                        }
                        decimal = hexadecimalADecimal(hexadecimal);
                        System.out.println("El decimal es " + decimal);
                        break;
                }
            }
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
}
