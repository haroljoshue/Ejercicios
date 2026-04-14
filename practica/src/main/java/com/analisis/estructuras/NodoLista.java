package com.analisis.estructuras;

/**
 * Clase que representa un nodo en una lista enlazada
 */
public class NodoLista<T> {
    public T dato;
    public NodoLista<T> siguiente;

    public NodoLista(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
