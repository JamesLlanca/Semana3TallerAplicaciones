import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Usa Locale.US para forzar el punto como separador decimal

        try {
            System.out.println("Ingrese su nombre completo");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese su edad:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpia la entrada después de un número

            System.out.println("Ingrese la marca del vehículo:");
            String marca = scanner.nextLine();

            System.out.println("Ingrese el modelo del vehículo:");
            String modelo = scanner.nextLine();

            System.out.println("Ingrese la cilindrada del vehículo:");
            double cilindrada = scanner.nextDouble();
            scanner.nextLine(); // Limpia la entrada después de un número

            System.out.println("Ingrese el tipo de combustible:");
            String tipoCombustible = scanner.nextLine();

            System.out.println("Ingrese la capacidad en pasajeros:");
            int capacidadPasajeros = scanner.nextInt();
            scanner.nextLine(); // Limpia la entrada después de un número

            System.out.println("El nombre que ha ingresado es: " + nombre);
            System.out.println("La edad que ha ingresado es: " + edad);
            System.out.println("La marca que ha ingresado es: " + marca);
            System.out.println("El modelo que ha ingresado es: " + modelo);
            System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
            System.out.println("El tipo de combustible es: " + tipoCombustible);
            System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        } catch (InputMismatchException e) {
            System.out.println("Ha introducido un tipo de dato incorrecto.");
        } finally {
            scanner.close();
        }
    }
}

