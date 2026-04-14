package com.analisis.estructuras;

/**
 * LISTAS ENLAZADAS
 * 
 * Definición: Una lista enlazada es una estructura de datos dinámica donde cada
 * nodo contiene un dato y una referencia (puntero) al siguiente nodo.
 * 
 * Ventajas:
 * - Tamaño dinámico (crece/decrece según necesidad)
 * - Inserción/eliminación eficiente en posiciones específicas: O(1)
 * 
 * Desventajas:
 * - No hay acceso directo a elementos (necesita iterar)
 * - Usa más memoria (cada nodo necesita puntero)
 * - Búsqueda: O(n)
 */
public class ListaEnlazada<T> {
    private NodoLista<T> cabeza;
    private int tamaño;

    public ListaEnlazada() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    /**
     * Inserta un elemento al inicio de la lista
     * Complejidad: O(1)
     */
    public void insertarAlInicio(T dato) {
        NodoLista<T> nuevoNodo = new NodoLista<>(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        tamaño++;
    }

    /**
     * Inserta un elemento al final de la lista
     * Complejidad: O(n)
     */
    public void insertarAlFinal(T dato) {
        NodoLista<T> nuevoNodo = new NodoLista<>(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoLista<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        tamaño++;
    }

    /**
     * Inserta un elemento en una posición específica
     * Complejidad: O(n)
     */
    public void insertarEnPosicion(int posicion, T dato) {
        if (posicion < 0 || posicion > tamaño) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }

        if (posicion == 0) {
            insertarAlInicio(dato);
            return;
        }

        NodoLista<T> nuevoNodo = new NodoLista<>(dato);
        NodoLista<T> actual = cabeza;

        for (int i = 0; i < posicion - 1; i++) {
            actual = actual.siguiente;
        }

        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
        tamaño++;
    }

    /**
     * Elimina el primer elemento
     * Complejidad: O(1)
     */
    public T eliminarAlInicio() {
        if (cabeza == null) {
            throw new IllegalStateException("Lista vacía");
        }

        T dato = cabeza.dato;
        cabeza = cabeza.siguiente;
        tamaño--;
        return dato;
    }

    /**
     * Elimina el último elemento
     * Complejidad: O(n)
     */
    public T eliminarAlFinal() {
        if (cabeza == null) {
            throw new IllegalStateException("Lista vacía");
        }

        if (cabeza.siguiente == null) {
            T dato = cabeza.dato;
            cabeza = null;
            tamaño--;
            return dato;
        }

        NodoLista<T> actual = cabeza;
        while (actual.siguiente.siguiente != null) {
            actual = actual.siguiente;
        }

        T dato = actual.siguiente.dato;
        actual.siguiente = null;
        tamaño--;
        return dato;
    }

    /**
     * Busca un elemento en la lista
     * Complejidad: O(n)
     */
    public boolean contiene(T dato) {
        NodoLista<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /**
     * Obtiene un elemento por índice
     * Complejidad: O(n)
     */
    public T obtener(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        NodoLista<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    /**
     * Obtiene el tamaño de la lista
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Verifica si la lista está vacía
     */
    public boolean estaVacia() {
        return tamaño == 0;
    }

    /**
     * Imprime todos los elementos de la lista
     */
    public void imprimir() {
        System.out.print("[");
        NodoLista<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println("]");
    }

    /**
     * Invierte la lista
     * Complejidad: O(n)
     */
    public void invertir() {
        NodoLista<T> anterior = null;
        NodoLista<T> actual = cabeza;
        NodoLista<T> siguiente;

        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }

        cabeza = anterior;
    }

    /**
     * Limpia la lista
     */
    public void limpiar() {
        cabeza = null;
        tamaño = 0;
    }

    // ============== EJEMPLO DE USO ==============
    public static void main(String[] args) {
        System.out.println("=== LISTAS ENLAZADAS ===\n");

        ListaEnlazada<Integer> lista = new ListaEnlazada<>();

        System.out.println("Insertando elementos: 10, 20, 30, 40, 50");
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        lista.insertarAlFinal(40);
        lista.insertarAlFinal(50);

        System.out.print("Lista: ");
        lista.imprimir();
        System.out.println("Tamaño: " + lista.getTamaño() + "\n");

        System.out.println("Insertando 5 al inicio:");
        lista.insertarAlInicio(5);
        lista.imprimir();

        System.out.println("\nInsertando 25 en posición 3:");
        lista.insertarEnPosicion(3, 25);
        lista.imprimir();

        System.out.println("\nObtener elemento en índice 2: " + lista.obtener(2));

        System.out.println("\n¿Contiene 30? " + lista.contiene(30));
        System.out.println("¿Contiene 100? " + lista.contiene(100) + "\n");

        System.out.println("Eliminando primer elemento: " + lista.eliminarAlInicio());
        lista.imprimir();

        System.out.println("\nEliminando último elemento: " + lista.eliminarAlFinal());
        lista.imprimir();

        System.out.println("\nInvirtiendo lista:");
        lista.invertir();
        lista.imprimir();

        System.out.println("\nLista con Strings:");
        ListaEnlazada<String> palabras = new ListaEnlazada<>();
        palabras.insertarAlFinal("Hola");
        palabras.insertarAlFinal("Mundo");
        palabras.insertarAlFinal("Java");
        palabras.imprimir();
    }
}
