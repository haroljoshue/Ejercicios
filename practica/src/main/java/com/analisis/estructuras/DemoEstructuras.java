package com.analisis.estructuras;

import java.util.Scanner;

/**
 * Programa principal para ejecutar y probar todas las estructuras de datos
 */
public class DemoEstructuras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    demoArrays.ejecutar();
                    break;
                case 2:
                    demoListaEnlazada();
                    break;
                case 3:
                    demoPila();
                    break;
                case 4:
                    demoCola();
                    break;
                case 5:
                    demoArbol();
                    break;
                case 6:
                    mostrarTablaComparativa();
                    break;
                case 7:
                    continuar = false;
                    System.out.println("\n¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            
            if (continuar) {
                System.out.println("\nPresiona Enter para continuar...");
                scanner.nextLine();
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n================================");
        System.out.println("  ESTRUCTURAS DE DATOS EN JAVA");
        System.out.println("================================");
        System.out.println("1. Arrays (Unidimensionales y Bidimensionales)");
        System.out.println("2. Listas Enlazadas");
        System.out.println("3. Pilas (Stack)");
        System.out.println("4. Colas (Queue)");
        System.out.println("5. Árboles Binarios de Búsqueda");
        System.out.println("6. Tabla Comparativa de Complejidades");
        System.out.println("7. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static void demoArrays() {
        System.out.println("\n=== ARRAYS ===");
        Arrays.main(new String[]{});
    }

    private static void demoListaEnlazada() {
        System.out.println("\n=== LISTAS ENLAZADAS ===");
        ListaEnlazada.main(new String[]{});
    }

    private static void demoPila() {
        System.out.println("\n=== PILAS ===");
        Pila.main(new String[]{});
    }

    private static void demoCola() {
        System.out.println("\n=== COLAS ===");
        Cola.main(new String[]{});
    }

    private static void demoArbol() {
        System.out.println("\n=== ÁRBOLES BINARIOS ===");
        ArbolBinarioBusqueda.main(new String[]{});
    }

    private static void mostrarTablaComparativa() {
        System.out.println("\n╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("║           TABLA COMPARATIVA DE ESTRUCTURAS DE DATOS                   ║");
        System.out.println("╠════════════════════╦═══════════╦═══════════╦═════════════╦═══════════╣");
        System.out.println("║ Estructura         ║ Inserción ║ Búsqueda  ║ Eliminación ║ Tamaño    ║");
        System.out.println("╠════════════════════╬═══════════╬═══════════╬═════════════╬═══════════╣");
        System.out.println("║ Array              ║   O(n)    ║O(log n)*  ║    O(n)     ║   FIJO    ║");
        System.out.println("║ Lista Enlazada     ║   O(n)    ║   O(n)    ║    O(n)     ║ DINÁMICO  ║");
        System.out.println("║ Pila (LIFO)        ║   O(1)    ║   N/A     ║    O(1)     ║ DINÁMICO  ║");
        System.out.println("║ Cola (FIFO)        ║   O(1)    ║   N/A     ║    O(1)     ║ DINÁMICO  ║");
        System.out.println("║ ABB (Balanceado)   ║ O(log n)* ║ O(log n)* ║  O(log n)*  ║ DINÁMICO  ║");
        System.out.println("╠════════════════════╬═══════════╬═══════════╬═════════════╬═══════════╣");
        System.out.println("║ * Con búsqueda binaria o árbol equilibrado                            ║");
        System.out.println("╚════════════════════╩═══════════╩═══════════╩═════════════╩═══════════╝");

        System.out.println("\n╔════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                     CUÁNDO USAR CADA ESTRUCTURA                        ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ ARRAY:                                                                 ║");
        System.out.println("║   ✓ Cuando necesitas acceso rápido por índice                          ║");
        System.out.println("║   ✓ El tamaño es conocido y fijo                                       ║");
        System.out.println("║   ✗ Inserción/eliminación frecuente                                    ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ LISTA ENLAZADA:                                                        ║");
        System.out.println("║   ✓ Inserción/eliminación frecuente                                    ║");
        System.out.println("║   ✓ Tamaño variable (crece/decrece)                                    ║");
        System.out.println("║   ✗ Necesitas acceso directo por índice                               ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ PILA:                                                                  ║");
        System.out.println("║   ✓ Deshacer/Rehacer                                                   ║");
        System.out.println("║   ✓ Validación de paréntesis                                           ║");
        System.out.println("║   ✓ Navegación en navegadores                                         ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ COLA:                                                                  ║");
        System.out.println("║   ✓ Sistemas de turnos/esperas                                         ║");
        System.out.println("║   ✓ Procesamiento de tareas (FIFO)                                     ║");
        System.out.println("║   ✓ Búsqueda en amplitud (BFS)                                         ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ ÁRBOL BINARIO:                                                         ║");
        System.out.println("║   ✓ Datos ordenados/jerárquicos                                        ║");
        System.out.println("║   ✓ Búsqueda rápida                                                    ║");
        System.out.println("║   ✓ Inserción/eliminación eficiente                                    ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════╝");
    }
}
