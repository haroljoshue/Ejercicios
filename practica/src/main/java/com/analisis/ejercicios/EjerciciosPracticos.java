package com.analisis.ejercicios;

import com.analisis.estructuras.ArbolBinarioBusqueda;
import com.analisis.estructuras.ListaEnlazada;

/**
 * EJERCICIOS PRÁCTICOS PARA PRACTICAR
 *
 * Resuelve cada uno de estos ejercicios para dominar las estructuras de datos.
 * Las soluciones están comentadas abajo de cada ejercicio.
 */
public class EjerciciosPracticos {

    // ============== EJERCICIOS DE ARRAYS ==============
    /**
     * EJERCICIO 1: Encontrar el segundo número mayor en un arreglo Ejemplo: [3,
     * 5, 1, 8, 2] -> 5
     */
    public static int segundoNumeroMayor(int[] arr) {
        // TODO: Implementa la solución
        return -1;
    }

    /**
     * EJERCICIO 2: Contar cuántas veces aparece un número en un arreglo
     * Ejemplo: [1, 2, 3, 2, 2, 1] y buscar 2 -> 3
     */
    public static int contarOcurrencias(int[] arr, int numero) {
        // TODO: Implementa la solución
        return 0;
    }

    /**
     * EJERCICIO 3: Rotar un arreglo k posiciones Ejemplo: [1, 2, 3, 4, 5] rotar
     * 2 -> [4, 5, 1, 2, 3]
     */
    public static int[] rotarArreglo(int[] arr, int k) {
        // TODO: Implementa la solución
        return arr;
    }

    /**
     * EJERCICIO 4: Encontrar pares que sumen un objetivo Ejemplo: [1, 5, 7, -1,
     * 5] con suma 6 -> [[1, 5], [7, -1]]
     */
    public static void encontrarPares(int[] arr, int objetivo) {
        // TODO: Implementa la solución
    }

    /**
     * EJERCICIO 5: Revertir un arreglo sin usar métodos auxiliares Ejemplo: [1,
     * 2, 3, 4, 5] -> [5, 4, 3, 2, 1]
     */
    public static void revertirArreglo(int[] arr) {
        // TODO: Implementa la solución
    }

    // ============== EJERCICIOS DE MATRICES ==============
    /**
     * EJERCICIO 6: Sumar la diagonal principal de una matriz Ejemplo: [[1,2,3],
     * [4,5,6], [7,8,9]] -> 1+5+9 = 15
     */
    public static int sumaDiagonalPrincipal(int[][] matriz) {
        // TODO: Implementa la solución
        return 0;
    }

    /**
     * EJERCICIO 7: Encontrar el elemento máximo en una matriz Ejemplo:
     * [[1,2,3], [4,5,6], [7,8,9]] -> 9
     */
    public static int maximoEnMatriz(int[][] matriz) {
        // TODO: Implementa la solución
        return -1;
    }

    /**
     * EJERCICIO 8: Espiral - Recorrer matriz en espiral Ejemplo: [[1,2,3],
     * [4,5,6], [7,8,9]] -> [1,2,3,6,9,8,7,4,5]
     */
    public static void recorridoEspiral(int[][] matriz) {
        // TODO: Implementa la solución
    }

    // ============== EJERCICIOS DE LISTAS ENLAZADAS ==============
    /**
     * EJERCICIO 9: Detectar ciclo en una lista enlazada Ejemplo: 1 -> 2 -> 3 ->
     * 2 (forma ciclo) -> true
     */
    public static <T> boolean detectarCiclo(ListaEnlazada<T> lista) {
        // TODO: Implementa la solución
        return false;
    }

    /**
     * EJERCICIO 10: Encontrar la mitad de una lista enlazada Ejemplo: 1 -> 2 ->
     * 3 -> 4 -> 5 -> retorna nodo con valor 3
     */
    public static <T> T encontrarMitad(ListaEnlazada<T> lista) {
        // TODO: Implementa la solución
        return null;
    }

    /**
     * EJERCICIO 11: Eliminar duplicados de una lista Ejemplo: 1 -> 2 -> 2 -> 3
     * -> 3 -> 3 -> queda: 1 -> 2 -> 3
     */
    public static <T> void eliminarDuplicados(ListaEnlazada<T> lista) {
        // TODO: Implementa la solución
    }

    // ============== EJERCICIOS DE PILAS ==============
    /**
     * EJERCICIO 12: Convertir número decimal a binario usando pila Ejemplo: 10
     * -> "1010"
     */
    public static String decimalABinario(int decimal) {
        // TODO: Implementa la solución
        return "";
    }

    /**
     * EJERCICIO 13: Validar que las llaves {} [] () estén balanceadas Ejemplo:
     * "{[()]}" -> true, "{[(])}" -> false
     */
    public static boolean validarLlaves(String expresion) {
        // TODO: Implementa la solución
        return false;
    }

    /**
     * EJERCICIO 14: Evaluar expresión postfija Ejemplo: "5 3 +" -> 8, "5 3 * 2
     * +" -> 17
     */
    public static int evaluarPostfija(String[] tokens) {
        // TODO: Implementa la solución
        return 0;
    }

    // ============== EJERCICIOS DE COLAS ==============
    /**
     * EJERCICIO 15: Simular fila de atención al cliente Agregar clientes,
     * atender, mostrar siguiente
     */
    public static void simulaFilaBanco() {
        // TODO: Implementa la solución
    }

    /**
     * EJERCICIO 16: Generar números enteros para k niveles (BFS) Ejemplo: k=3
     * -> 1 -> 11 -> 12 -> 21 -> 22 -> 111 -> 112 -> ...
     */
    public static void generarNumerosKDigitos(int k) {
        // TODO: Implementa la solución
    }

    /**
     * EJERCICIO 17: Imprimir árbol por niveles (BFS)
     */
    public static void imprimirPorNiveles(ArbolBinarioBusqueda<Integer> arbol) {
        // TODO: Implementa la solución
    }

    // ============== EJERCICIOS DE ÁRBOLES ==============
    /**
     * EJERCICIO 18: Encontrar el camino de la raíz a una hoja Ejemplo:
     * Encontrar ruta: 50 -> 30 -> 20
     */
    public static void encontrarCamino(ArbolBinarioBusqueda<Integer> arbol, Integer objetivo) {
        // TODO: Implementa la solución
    }

    /**
     * EJERCICIO 19: Verificar si el árbol está balanceado Un árbol está
     * balanceado si la diferencia de altura entre subárboles es ≤ 1
     */
    public static boolean estaBalanceado(ArbolBinarioBusqueda<Integer> arbol) {
        // TODO: Implementa la solución
        return false;
    }

    /**
     * EJERCICIO 20: Encontrar Ancestro común más cercano (LCA) Ejemplo: En
     * árbol con valores 1,2,3 encontrar LCA(2,3) -> 1
     */
    public static Integer encontrarLCA(ArbolBinarioBusqueda<Integer> arbol,
            Integer valor1, Integer valor2) {
        // TODO: Implementa la solución
        return null;
    }

    // ============== DESAFÍOS COMPLEJOS ==============
    /**
     * DESAFÍO 1: Invertir los primeros K elementos de una lista usando Stack
     * Ejemplo: Lista [1,2,3,4,5] con K=3 -> [3,2,1,4,5]
     */
    public static <T> void invertirPrimerosK(ListaEnlazada<T> lista, int k) {
        // TODO: Implementa la solución
    }

    /**
     * DESAFÍO 2: Crear matriz en espiral desde números 1 a n² Ejemplo: n=3 -> 1
     * 2 3 8 9 4 7 6 5
     */
    public static int[][] crearMatrizEnEspiral(int n) {
        // TODO: Implementa la solución
        return new int[n][n];
    }

    /**
     * DESAFÍO 3: Implementar una estructura Deque (puede sacar de ambos
     * extremos)
     */
    public static class Deque<T> {
        // TODO: Implementa la solución
    }

    // ============== SOLUCIONES EJEMPLO ==============
    /**
     * Solución EJERCICIO 1: Segundo número mayor
     */
    public static int segundoNumeroMayorSolucion(int[] arr) {
        int max = Integer.MIN_VALUE;
        int segundo = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                segundo = max;
                max = num;
            } else if (num > segundo && num != max) {
                segundo = num;
            }
        }

        return segundo == Integer.MIN_VALUE ? -1 : segundo;
    }

    /**
     * Solución EJERCICIO 2: Contar ocurrencias
     */
    public static int contarOcurrenciasSolucion(int[] arr, int numero) {
        int contador = 0;
        for (int valor : arr) {
            if (valor == numero) {
                contador++;
            }
        }
        return contador;
    }

    // ============== MAIN PARA PROBAR ==============
    public static void main(String[] args) {
        System.out.println("=== EJERCICIOS PRÁCTICOS ===\n");

        // Prueba soluciones
        System.out.println("Solución Ejercicio 1:");
        int[] arr1 = {3, 5, 1, 8, 2};
        System.out.println("Segundo mayor en [3, 5, 1, 8, 2]: " + segundoNumeroMayorSolucion(arr1));

        System.out.println("\nSolución Ejercicio 2:");
        int[] arr2 = {1, 2, 3, 2, 2, 1};
        System.out.println("Ocurrencias de 2 en [1, 2, 3, 2, 2, 1]: "
                + contarOcurrenciasSolucion(arr2, 2));

        System.out.println("\n¡Ahora intenta resolver los demás ejercicios!");
        System.out.println("\nLeyes clave a recordar:");
        System.out.println("1. O(1): Operación instantánea (acceso a índice)");
        System.out.println("2. O(n): Recorrido completo");
        System.out.println("3. O(n²): Bucles anidados");
        System.out.println("4. O(log n): Divide y conquista");
    }
}
