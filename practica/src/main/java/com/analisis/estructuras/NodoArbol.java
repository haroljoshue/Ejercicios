package com.analisis.estructuras;

/**
 * Clase que representa un nodo en un árbol binario
 */
public class NodoArbol<T extends Comparable<T>> {
    public T dato;
    public NodoArbol<T> izquierda;
    public NodoArbol<T> derecha;

    public NodoArbol(T dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}
