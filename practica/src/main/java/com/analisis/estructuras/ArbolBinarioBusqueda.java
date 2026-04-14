package com.analisis.estructuras;

/**
 * ÁRBOLES BINARIOS DE BÚSQUEDA (ABB)
 * 
 * Definición: Un árbol es una estructura jerárquica donde cada nodo tiene:
 * - Un dato
 * - Un puntero a hijo izquierdo
 * - Un puntero a hijo derecho
 * 
 * En un Árbol Binario de Búsqueda (ABB):
 * - Valor izquierda < Nodo < Valor derecha
 * - Es ORDENADO y permiteSúsquedas eficientes
 * 
 * Complejidades (peor caso equilibrado):
 * - Búsqueda: O(log n)
 * - Inserción: O(log n)
 * - Eliminación: O(log n)
 * 
 * Complejidades (peor caso degenerado):
 * - Todos: O(n)
 */
public class ArbolBinarioBusqueda<T extends Comparable<T>> {
    private NodoArbol<T> raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    /**
     * Inserta un elemento en el árbol
     */
    public void insertar(T dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private NodoArbol<T> insertarRecursivo(NodoArbol<T> nodo, T dato) {
        if (nodo == null) {
            return new NodoArbol<>(dato);
        }

        int comparacion = dato.compareTo(nodo.dato);

        if (comparacion < 0) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, dato);
        } else if (comparacion > 0) {
            nodo.derecha = insertarRecursivo(nodo.derecha, dato);
        }

        return nodo;
    }

    /**
     * Busca un elemento en el árbol
     */
    public boolean buscar(T dato) {
        return buscarRecursivo(raiz, dato);
    }

    private boolean buscarRecursivo(NodoArbol<T> nodo, T dato) {
        if (nodo == null) {
            return false;
        }

        int comparacion = dato.compareTo(nodo.dato);

        if (comparacion == 0) {
            return true;
        } else if (comparacion < 0) {
            return buscarRecursivo(nodo.izquierda, dato);
        } else {
            return buscarRecursivo(nodo.derecha, dato);
        }
    }

    /**
     * Encuentre el valor mínimo
     */
    public T encontrarMinimo() {
        if (raiz == null) {
            throw new IllegalStateException("Árbol vacío");
        }
        return encontrarMinimoRecursivo(raiz).dato;
    }

    private NodoArbol<T> encontrarMinimoRecursivo(NodoArbol<T> nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }

    /**
     * Encuentra el valor máximo
     */
    public T encontrarMaximo() {
        if (raiz == null) {
            throw new IllegalStateException("Árbol vacío");
        }
        return encontrarMaximoRecursivo(raiz).dato;
    }

    private NodoArbol<T> encontrarMaximoRecursivo(NodoArbol<T> nodo) {
        while (nodo.derecha != null) {
            nodo = nodo.derecha;
        }
        return nodo;
    }

    /**
     * Elimina un elemento del árbol
     */
    public void eliminar(T dato) {
        raiz = eliminarRecursivo(raiz, dato);
    }

    private NodoArbol<T> eliminarRecursivo(NodoArbol<T> nodo, T dato) {
        if (nodo == null) {
            return null;
        }

        int comparacion = dato.compareTo(nodo.dato);

        if (comparacion < 0) {
            nodo.izquierda = eliminarRecursivo(nodo.izquierda, dato);
        } else if (comparacion > 0) {
            nodo.derecha = eliminarRecursivo(nodo.derecha, dato);
        } else {
            // Nodo encontrado

            // Caso 1: Sin hijos (hoja)
            if (nodo.izquierda == null && nodo.derecha == null) {
                return null;
            }

            // Caso 2: Un hijo
            if (nodo.izquierda == null) {
                return nodo.derecha;
            }
            if (nodo.derecha == null) {
                return nodo.izquierda;
            }

            // Caso 3: Dos hijos
            // Encuentra el mínimo en el subárbol derecho (sucesor)
            T minDerecha = encontrarMinimoRecursivo(nodo.derecha).dato;
            nodo.dato = minDerecha;
            nodo.derecha = eliminarRecursivo(nodo.derecha, minDerecha);
        }

        return nodo;
    }

    /**
     * Recorrido INORDEN (Izquierda - Raíz - Derecha)
     * Produce valores en orden ASCENDENTE
     */
    public void recorridoInorden() {
        System.out.print("Inorden: ");
        recorridoInordenRecursivo(raiz);
        System.out.println();
    }

    private void recorridoInordenRecursivo(NodoArbol<T> nodo) {
        if (nodo != null) {
            recorridoInordenRecursivo(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            recorridoInordenRecursivo(nodo.derecha);
        }
    }

    /**
     * Recorrido PREORDEN (Raíz - Izquierda - Derecha)
     */
    public void recorridoPreorden() {
        System.out.print("Preorden: ");
        recorridoPreordenRecursivo(raiz);
        System.out.println();
    }

    private void recorridoPreordenRecursivo(NodoArbol<T> nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            recorridoPreordenRecursivo(nodo.izquierda);
            recorridoPreordenRecursivo(nodo.derecha);
        }
    }

    /**
     * Recorrido POSTORDEN (Izquierda - Derecha - Raíz)
     */
    public void recorridoPostorden() {
        System.out.print("Postorden: ");
        recorridoPostordenRecursivo(raiz);
        System.out.println();
    }

    private void recorridoPostordenRecursivo(NodoArbol<T> nodo) {
        if (nodo != null) {
            recorridoPostordenRecursivo(nodo.izquierda);
            recorridoPostordenRecursivo(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }

    /**
     * Calcula la altura del árbol
     */
    public int altura() {
        return alturaRecursiva(raiz);
    }

    private int alturaRecursiva(NodoArbol<T> nodo) {
        if (nodo == null) {
            return -1;
        }
        return 1 + Math.max(alturaRecursiva(nodo.izquierda), alturaRecursiva(nodo.derecha));
    }

    /**
     * Cuenta el número total de nodos
     */
    public int contarNodos() {
        return contarNodosRecursivo(raiz);
    }

    private int contarNodosRecursivo(NodoArbol<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + contarNodosRecursivo(nodo.izquierda) + contarNodosRecursivo(nodo.derecha);
    }

    /**
     * Verifica si el árbol está vacío
     */
    public boolean estaVacio() {
        return raiz == null;
    }

    // ============== EJEMPLO DE USO ==============
    public static void main(String[] args) {
        System.out.println("=== ÁRBOLES BINARIOS DE BÚSQUEDA ===\n");

        ArbolBinarioBusqueda<Integer> arbol = new ArbolBinarioBusqueda<>();

        System.out.println("Insertando: 50, 30, 70, 20, 40, 60, 80");
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("\nRecorridos del árbol:");
        arbol.recorridoInorden();     // 20 30 40 50 60 70 80
        arbol.recorridoPreorden();    // 50 30 20 40 70 60 80
        arbol.recorridoPostorden();   // 20 40 30 60 80 70 50

        System.out.println("\nPropiedades:");
        System.out.println("Total de nodos: " + arbol.contarNodos());
        System.out.println("Altura: " + arbol.altura());
        System.out.println("Mínimo: " + arbol.encontrarMinimo());
        System.out.println("Máximo: " + arbol.encontrarMaximo());

        System.out.println("\nBúsquedas:");
        System.out.println("¿Contiene 40? " + arbol.buscar(40));
        System.out.println("¿Contiene 100? " + arbol.buscar(100));

        System.out.println("\nEliminando 20 (hoja)");
        arbol.eliminar(20);
        arbol.recorridoInorden();

        System.out.println("\nEliminando 30 (un hijo)");
        arbol.eliminar(30);
        arbol.recorridoInorden();

        System.out.println("\nEliminando 50 (dos hijos - raíz)");
        arbol.eliminar(50);
        arbol.recorridoInorden();
    }
}
