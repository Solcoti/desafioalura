import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    private static class ConversorMonedas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Definir factores de conversión
            double factorUSDToEUR = 0.82;
            double factorUSDtoGBP = 0.73;
            double factorEURtoGBP = 0.89;

            // Solicitar al usuario la cantidad y la moneda de origen
            System.out.println("Ingrese la cantidad a convertir:");
            double cantidad = scanner.nextDouble();

            System.out.println("Ingrese la moneda de origen (USD, EUR, GBP):");
            String monedaOrigen = scanner.next().toUpperCase();

            // Convertir la cantidad a la moneda deseada
            double resultado = 0;
            switch (monedaOrigen) {
                case "USD":
                    System.out.println("Ingrese la moneda de destino (EUR, GBP):");
                    String monedaDestino = scanner.next().toUpperCase();
                    if (monedaDestino.equals("EUR")) {
                        resultado = cantidad * factorUSDToEUR;
                    } else if (monedaDestino.equals("GBP")) {
                        resultado = cantidad * factorUSDtoGBP;
                    } else {
                        System.out.println("Moneda de destino no válida");
                        return;
                    }
                    break;
                case "EUR":
                    System.out.println("Ingrese la moneda de destino (USD, GBP):");
                    monedaDestino = scanner.next().toUpperCase();
                    if (monedaDestino.equals("USD")) {
                        resultado = cantidad / factorUSDToEUR;
                    } else if (monedaDestino.equals("GBP")) {
                        resultado = cantidad * factorEURtoGBP;
                    } else {
                        System.out.println("Moneda de destino no válida");
                        return;
                    }
                    break;
                case "GBP":
                    System.out.println("Ingrese la moneda de destino (USD, EUR):");
                    monedaDestino = scanner.next().toUpperCase();
                    if (monedaDestino.equals("USD")) {
                        resultado = cantidad / factorUSDtoGBP;
                    } else if (monedaDestino.equals("EUR")) {
                        resultado = cantidad / factorEURtoGBP;
                    } else {
                        System.out.println("Moneda de destino no válida");
                        return;
                    }
                    break;
                default:
                    System.out.println("Moneda de origen no válida");
                    return;
            }

          //   Mostrar el resultado de la conversión
            System.out.println("El resultado de la conversión es: " + resultado);

            scanner.close();
        }
    }
}