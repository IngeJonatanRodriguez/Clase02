import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        System.out.println("Hola Jonatan!"); // Imprimir datos en pantalla/ consola/ terminal con salto de linea

        System.out.print("Como van las cosas"); // Imprimir en la misma linea.
        System.out.print(10);
        System.out.print(10.5);
        System.out.print('A');
        System.out.println();

        System.out.printf("Aqui va una cadena: %s%n", "Jonatan");
        System.out.printf("Aqui va un numero entero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Jonatan Rodriguez", 32);

        var scanner = new Scanner(System.in);
        System.out.print("Ingrese su Nombre:");
        var entero = scanner.nextLine();

        System.out.println(entero);

        scanner.close();
    }
}