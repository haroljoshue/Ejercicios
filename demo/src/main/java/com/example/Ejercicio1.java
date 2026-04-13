import java.util.Scanner;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Solicitar longitud del arreglo
        System.out.print("Ingrese la longitud del arreglo (n): ");
        int n = scanner.nextInt();
        
        // Crear arreglo de valores aleatorios
        int[] arreglo = new int[n];
        
        // Generar valores aleatorios (entre 1 y 100)
        System.out.println("\nArreglo original:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(100) + 1;
            System.out.print(arreglo[i] + " ");
        }
        
        // Crear arreglo para almacenar suma de dígitos
        int[] sumaDigitos = new int[n];
        
        // Calcular suma de dígitos de cada elemento
        System.out.println("\n\nSuma de dígitos:");
        for (int i = 0; i < n; i++) {
            sumaDigitos[i] = sumarDigitos(arreglo[i]);
            System.out.println(arreglo[i] + " -> " + sumaDigitos[i]);
        }
        
        scanner.close();
    }
    
    // Método para sumar los dígitos de un número
    public static int sumarDigitos(int numero) {
        int suma = 0;
        int temp = Math.abs(numero);
        
        if (temp == 0) {
            return 0;
        }
        
        while (temp > 0) {
            suma += temp % 10;
            temp /= 10;
        }
        
        return suma;
    }
}