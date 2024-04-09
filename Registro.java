import java.util.InputMismatchException; // Importa la clase InputMismatchException para manejar errores de entrada.import java.util.Locale;
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario.
public class Registro { // Declara una clase pública llamada Registro.    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Usa Locale.US para forzar el punto como separador decimal

// Inicia un bloque try-catch para manejar posibles excepciones.
    try { 
            System.out.println("Ingrese su nombre completo"); // Imprime una instrucción para el usuario.           
            String nombre = scanner.nextLine(); // Lee una línea completa de texto como el nombre del usuario.
            System.out.println("Ingrese su edad:"); // Pide al usuario su edad.           
            int edad = scanner.nextInt(); // Lee la edad del usuario como un entero.            
            scanner.nextLine(); // Limpia la entrada después de un número

            System.out.println("Ingrese la marca del vehículo:"); // Pide la marca del vehículo.            
            String marca = scanner.nextLine(); //Lee la marca del vehículo.
            System.out.println("Ingrese el modelo del vehículo:"); // Pide el modelo del vehículo.            
            String modelo = scanner.nextLine(); // Lee el modelo del vehículo.
            System.out.println("Ingrese la cilindrada del vehículo:"); // Pide la cilindrada del vehículo.           
            double cilindrada = scanner.nextDouble(); // Lee la cilindrada del vehículo como un número decimal.            
            scanner.nextLine(); // Limpia la entrada después de un número

            System.out.println("Ingrese el tipo de combustible:"); // Pide el tipo de combustible del vehículo.            
            String tipoCombustible = scanner.nextLine(); // Lee el tipo de combustible.
            System.out.println("Ingrese la capacidad en pasajeros:"); // Pide la capacidad en pasajeros del vehículo.            
            int capacidadPasajeros = scanner.nextInt(); // Lee la capacidad en pasajeros como un entero.            
            scanner.nextLine(); // Limpia la entrada después de un número

            // Imprime todas las entradas recogidas del usuario.            
            System.out.println("El nombre que ha ingresado es: " + nombre);
            System.out.println("La edad que ha ingresado es: " + edad);
            System.out.println("La marca que ha ingresado es: " + marca);
            System.out.println("El modelo que ha ingresado es: " + modelo);
            System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
            System.out.println("El tipo de combustible es: " + tipoCombustible);
            System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // Atrapa la excepción InputMismatchException si ocurre.        
   } catch (InputMismatchException e) {
            System.out.println("Ha introducido un tipo de dato incorrecto."); // Informa al usuario sobre el error de entrada.       
       } finally {
            scanner.close(); // Cierra el objeto Scanner para liberar recursos.
}
    }
}

