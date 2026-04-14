package com.analisis.estructuras;

/**
 * COLAS (QUEUE)
 * 
 * Definición: FIFO (First In, First Out)
 * El primer elemento en entrar es el primero en salir.
 * 
 * Operaciones:
 * - enqueue(): Agrega elemento al final
 * - dequeue(): Elimina y retorna elemento del inicio
 * - peek(): Obtiene elemento del inicio sin eliminar
 * - isEmpty(): Verifica si está vacía
 * 
 * Complejidad: O(1) para todas las operaciones
 * 
 * Casos de uso:
 * - Sistemas de turnos y esperas
 * - Impresoras
 * - Procesamiento de tareas
 * - Búsqueda en amplitud (BFS)
 */
public class Cola<T> {
    private NodoLista<T> inicio;
    private NodoLista<T> fin;
    private int tamaño;

    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.tamaño = 0;
    }

    /**
     * Agrega un elemento al final de la cola
     */
    public void enqueue(T dato) {
        NodoLista<T> nuevoNodo = new NodoLista<>(dato);

        if (fin == null) {
            inicio = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
        }

        fin = nuevoNodo;
        tamaño++;
    }

    /**
     * Retira y retorna el elemento del inicio
     */
    public T dequeue() {
        if (estaVacia()) {
            throw new IllegalStateException("Cola vacía");
        }

        T dato = inicio.dato;
        inicio = inicio.siguiente;

        if (inicio == null) {
            fin = null;
        }

        tamaño--;
        return dato;
    }

    /**
     * Obtiene el elemento del inicio sin eliminar
     */
    public T peek() {
        if (estaVacia()) {
            throw new IllegalStateException("Cola vacía");
        }
        return inicio.dato;
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
     * Imprime la cola
     */
    public void imprimir() {
        System.out.print("Cola [inicio -> fin]: ");
        NodoLista<T> actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // ============== EJEMPLO DE USO ==============
    public static void main(String[] args) {
        System.out.println("=== COLAS ===\n");

        Cola<String> colaTicket = new Cola<>();

        System.out.println("Clientes en la fila:");
        String[] clientes = {"Juan", "María", "Pedro", "Ana", "Luis"};

        for (String cliente : clientes) {
            colaTicket.enqueue(cliente);
            System.out.println(cliente + " se coloca en la fila");
        }

        colaTicket.imprimir();
        System.out.println("Total en cola: " + colaTicket.tamaño());
        System.out.println("Atendiendo a: " + colaTicket.peek() + "\n");

        System.out.println("Atendiendo clientes:");
        while (!colaTicket.estaVacia()) {
            System.out.println("Atendiendo a: " + colaTicket.dequeue());
        }

        System.out.println("\n=== COLA DE NÚMEROS ===\n");

        Cola<Integer> colaNumerica = new Cola<>();

        System.out.println("Encolando: 10, 20, 30, 40");
        colaNumerica.enqueue(10);
        colaNumerica.enqueue(20);
        colaNumerica.enqueue(30);
        colaNumerica.enqueue(40);

        colaNumerica.imprimir();

        System.out.println("\nDescolando: ");
        while (!colaNumerica.estaVacia()) {
            System.out.println("Dequeue: " + colaNumerica.dequeue());
        }
    }
}
