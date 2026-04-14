package com.analisis.estructuras;

/**
 * ARREGLOS UNIDIMENSIONALES Y BIDIMENSIONALES
 * 
 * Definición: Los arreglos son estructuras de datos lineales que almacenan
 * múltiples elementos del mismo tipo en posiciones de memoria contiguas.
 */
public class Arrays {

    // ============== ARREGLOS UNIDIMENSIONALES ==============

    /**
     * Recorre un arreglo e imprime sus elementos
     */
    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /**
     * Busca un elemento en un arreglo (Búsqueda Lineal)
     * Complejidad: O(n)
     */
    public static int busquedaLineal(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i; // Elemento encontrado
            }
        }
        return -1; // No encontrado
    }

    /**
     * Busca un elemento en un arreglo ORDENADO (Búsqueda Binaria)
     * Complejidad: O(log n) - Mucho más eficiente
     */
    public static int busquedaBinaria(int[] arr, int objetivo) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (arr[medio] == objetivo) {
                return medio;
            } else if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1;
    }

    /**
     * Ordena un arreglo (Burbuja)
     * Complejidad: O(n²)
     */
    public static void ordenarBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Calcula la suma de todos los elementos
     * Complejidad: O(n)
     */
    public static int suma(int[] arr) {
        int suma = 0;
        for (int valor : arr) {
            suma += valor;
        }
        return suma;
    }

    /**
     * Encuentra el valor máximo en un arreglo
     * Complejidad: O(n)
     */
    public static int encontrarMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Encuentra el valor mínimo en un arreglo
     * Complejidad: O(n)
     */
    public static int encontrarMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Invierte un arreglo
     * Complejidad: O(n)
     */
    public static void invertir(int[] arr) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio < fin) {
            // Intercambiar
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;

            inicio++;
            fin--;
        }
    }

    // ============== ARREGLOS BIDIMENSIONALES (MATRICES) ==============

    /**
     * Imprime una matriz
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Suma dos matrices
     * Complejidad: O(m*n) donde m=filas, n=columnas
     */
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int[][] resultado = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }

    /**
     * Multiplica dos matrices
     * Complejidad: O(m*n*p) donde m=filas de A, n=columnas de A (filas de B), p=columnas de B
     */
    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int m = a.length;
        int n = b[0].length;
        int p = b.length;
        int[][] resultado = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return resultado;
    }

    /**
     * Calcula la suma de todos los elementos en una matriz
     */
    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }

    /**
     * Transpone una matriz (intercambia filas y columnas)
     */
    public static int[][] transponerMatriz(int[][] matriz) {
        int m = matriz.length;
        int n = matriz[0].length;
        int[][] transpuesta = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    /**
     * Busca un elemento en una matriz
     */
    public static boolean existeEnMatriz(int[][] matriz, int objetivo) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor == objetivo) return true;
            }
        }
        return false;
    }

    /**
     * Calcula la diagonal principal de una matriz cuadrada
     */
    public static void imprimirDiagonalPrincipal(int[][] matriz) {
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    // ============== EJEMPLO DE USO ==============
    public static void main(String[] args) {
        System.out.println("=== ARRAYS UNIDIMENSIONALES ===\n");

        // Crear arreglo
        int[] arr = {5, 2, 8, 1, 9, 3};
        System.out.print("Arreglo original: ");
        imprimirArreglo(arr);

        // Operaciones
        System.out.println("Suma: " + suma(arr));
        System.out.println("Máximo: " + encontrarMax(arr));
        System.out.println("Mínimo: " + encontrarMin(arr));

        // Ordenar
        ordenarBurbuja(arr);
        System.out.print("Arreglo ordenado: ");
        imprimirArreglo(arr);

        // Búsqueda binaria (requiere arreglo ordenado)
        System.out.println("Búsqueda de 8: índice " + busquedaBinaria(arr, 8));

        // Invertir
        invertir(arr);
        System.out.print("Arreglo invertido: ");
        imprimirArreglo(arr);

        System.out.println("\n=== MATRICES (ARREGLOS BIDIMENSIONALES) ===\n");

        // Crear matrices
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matriz2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);

        System.out.println("\nMatriz 2:");
        imprimirMatriz(matriz2);

        System.out.println("\nSuma de matrices:");
        imprimirMatriz(sumarMatrices(matriz1, matriz2));

        System.out.println("Suma de elementos: " + sumaMatriz(matriz1));

        System.out.println("\nTranspuesta de Matriz 1:");
        imprimirMatriz(transponerMatriz(matriz1));

        System.out.println();
        imprimirDiagonalPrincipal(matriz1);

        System.out.println("\n¿Existe 5? " + existeEnMatriz(matriz1, 5));
    }
}
