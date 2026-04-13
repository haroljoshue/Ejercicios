import java.util.Scanner;
import java.util.Random;

public class Ejercicio2 {
    
    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Ingresar dimensiones de la matriz
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();
        
        // Crear la matriz de tamaño m x n
        int[][] matriz = new int[m][n];
        
        // Llenar la matriz con números aleatorios
        System.out.println("\nMatriz generada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatorios entre 0 y 99
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Contar los números primos en la matriz
        int cantidadPrimos = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (esPrimo(matriz[i][j])) {
                    cantidadPrimos++;
                }
            }
        }
        
        // Almacenar la cantidad en un arreglo
        int[] arregloPrimos = new int[1];
        arregloPrimos[0] = cantidadPrimos;
        
        // Mostrar resultados
        System.out.println("\nCantidad de números primos en la matriz: " + arregloPrimos[0]);
        System.out.println("Valor almacenado en el arreglo: " + arregloPrimos[0]);
        
        scanner.close();
    }
}