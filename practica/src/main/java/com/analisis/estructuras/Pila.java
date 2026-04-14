package com.analisis.estructuras;

/**
 * PILAS (STACK)
 * 
 * Definición: LIFO (Last In, First Out)
 * El último elemento en entrar es el primero en salir.
 * 
 * Operaciones:
 * - push(dato): Agrega elemento en la cima
 * - pop(): Elimina y retorna el elemento de la cima
 * - peek(): Obtiene elemento de la cima sin eliminar
 * - isEmpty(): Verifica si está vacía
 * 
 * Complejidad: O(1) para todas las operaciones
 * 
 * Casos de uso:
 * - Deshacer/Rehacer en editores
 * - Validación de paréntesis
 * - Retroceso en navegadores
 * - Evaluación de expresiones
 */
public class Pila<T> {
    private NodoLista<T> cima;
    private int tamaño;

    public Pila() {
        this.cima = null;
        this.tamaño = 0;
    }

    /**
     * Agrega un elemento a la cima
     */
    public void push(T dato) {
        NodoLista<T> nuevoNodo = new NodoLista<>(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        tamaño++;
    }

    /**
     * Retira y retorna el elemento de la cima
     */
    public T pop() {
        if (estaVacia()) {
            throw new IllegalStateException("Pila vacía");
        }
        T dato = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return dato;
    }

    /**
     * Obtiene el elemento de la cima sin eliminar
     */
    public T peek() {
        if (estaVacia()) {
            throw new IllegalStateException("Pila vacía");
        }
        return cima.dato;
    }

    /**
     * Retorna el tamaño
     */
    public int tamaño() {
        return tamaño;
    }

    /**
     * Verifica si está vacía
     */
    public boolean estaVacia() {
        return tamaño == 0;
    }

    /**
     * Imprime la pila
     */
    public void imprimir() {
        System.out.print("Pila [de cima a base]: ");
        NodoLista<T> actual = cima;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // ============== EJEMPLO: VALIDAR PARÉNTESIS ==============

    /**
     * Valida si los paréntesis en una expresión están balanceados
     */
    public static boolean validarParentesis(String expresion) {
        Pila<Character> pila = new Pila<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.estaVacia()) return false;

                char apertura = pila.pop();
                if (!sonParejados(apertura, c)) {
                    return false;
                }
            }
        }

        return pila.estaVacia();
    }

    private static boolean sonParejados(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '[' && cierre == ']') ||
               (apertura == '{' && cierre == '}');
    }

    // ============== EJEMPLO DE USO ==============
    public static void main(String[] args) {
        System.out.println("=== PILAS ===\n");

        Pila<Integer> pila = new Pila<>();

        System.out.println("Insertar: 10, 20, 30, 40, 50");
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);

        pila.imprimir();
        System.out.println("Tamaño: " + pila.tamaño());
        System.out.println("Cima: " + pila.peek() + "\n");

        System.out.println("Sacando elementos:");
        while (!pila.estaVacia()) {
            System.out.println("Pop: " + pila.pop());
        }

        System.out.println("\n=== VALIDACIÓN DE PARÉNTESIS ===\n");

        String[] expresiones = {
            "((a + b) * (c - d))",
            "([{}])",
            "({[}])",
            "[(])",
            "(((",
            ")))"
        };

        for (String expr : expresiones) {
            System.out.println(expr + " -> " + (validarParentesis(expr) ? "VÁLIDO" : "INVÁLIDO"));
        }
    }
}
