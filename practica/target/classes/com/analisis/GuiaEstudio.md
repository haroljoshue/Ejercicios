# GUÍA COMPLETA DE ESTRUCTURAS DE DATOS

## 📚 Índice
1. [Arreglos Unidimensionales](#arreglos-unidimensionales)
2. [Arreglos Bidimensionales](#arreglos-bidimensionales)
3. [Listas Enlazadas](#listas-enlazadas)
4. [Pilas](#pilas)
5. [Colas](#colas)
6. [Árboles Binarios](#árboles-binarios)

---

## Arreglos Unidimensionales

### ¿Qué son?
Los arreglos son estructuras de datos lineales que almacenan múltiples elementos del mismo tipo en posiciones continuas de memoria.

### Características
- **Acceso:** O(1) - Acceso directo por índice
- **Búsqueda:** O(n) búsqueda lineal, O(log n) búsqueda binaria
- **Inserción/Eliminación:** O(n) - Requiere desplazar elementos
- **Tamaño:** FIJO - Se define al crear

### Operaciones principales
```java
int[] arr = new int[5];           // Crear arreglo
arr[0] = 10;                      // Asignar valor
int valor = arr[0];               // Leer valor
int tamaño = arr.length;          // Obtener tamaño
```

### Algoritmos comunes
1. **Búsqueda Lineal:** Recorre elemento por elemento
2. **Búsqueda Binaria:** Requiere orden, muy eficiente
3. **Ordenamiento:** Burbuja, Quicksort, Mergesort
4. **Suma de elementos:** Recorridolineal
5. **Máximo/Mínimo:** Recorrido con comparación

---

## Arreglos Bidimensionales

### ¿Qué son?
Arreglos de arreglos. Se usan para representar matrices.

### Estructura
```
      Col 0  Col 1  Col 2
Fila 0  1      2      3
Fila 1  4      5      6
Fila 2  7      8      9
```

### Declaración y uso
```java
int[][] matriz = new int[3][3];           // 3x3
matriz[0][0] = 1;                         // Fila 0, Columna 0
for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

### Operaciones
- **Suma de matrices**
- **Multiplicación de matrices**
- **Transpuesta**
- **Elementos en diagonal principal**
- **Suma de filas/columnas**

---

## Listas Enlazadas

### ¿Qué son?
Estructura dinámica donde cada nodo contiene un dato y una referencia al siguiente nodo.

### Ventajas vs Arreglos
✓ Tamaño dinámico
✓ Inserción/eliminación eficiente: O(1)
✗ No hay acceso directo: O(n)
✗ Usa más memoria (punteros)

### Estructura del nodo
```java
class Nodo {
    int dato;
    Nodo siguiente;
}
```

### Visualización
```
[10]→[20]→[30]→[40]→null
```

### Operaciones principales
- **Insertar al inicio:** O(1)
- **Insertar al final:** O(n)
- **Insertar en posición:** O(n)
- **Eliminar:** O(n)
- **Búsqueda:** O(n)

---

## Pilas (STACK)

### ¿Qué es?
LIFO (Last In, First Out) - Último en entrar, primero en salir.

### Analogía
Como un stack de platos: el último que pones, es el primero que sacas.

### Operaciones
- **push():** Agregar en la cima - O(1)
- **pop():** Sacar de la cima - O(1)
- **peek():** Ver la cima - O(1)
- **isEmpty():** ¿Está vacía? - O(1)

### Visualización
```
    | 50 |  <- Cima (push/pop aquí)
    | 40 |
    | 30 |
    | 20 |
    | 10 |  <- Base
```

### Casos de uso
- Deshacer/Rehacer (Ctrl+Z)
- Validar paréntesis
- Evaluar expresiones
- Navegación (atrás en navegadores)

---

## Colas (QUEUE)

### ¿Qué es?
FIFO (First In, First Out) - Primero en entrar, primero en salir.

### Analogía
Como una fila de banco: quien llega primero, se atiende primero.

### Operaciones
- **enqueue():** Agregar al final - O(1)
- **dequeue():** Sacar del inicio - O(1)
- **peek():** Ver el primero - O(1)
- **isEmpty():** ¿Está vacía? - O(1)

### Visualización
```
Entrada → | 10 | 20 | 30 | 40 | → Salida
           inicio                  fin
```

### Casos de uso
- Sistemas de turnos
- Colas de impresoras
- Procesamiento de tareas
- Búsqueda en amplitud (BFS)

---

## Árboles Binarios

### ¿Qué es?
Estructura no-lineal jerárquica con raíz y hasta 2 hijos por nodo.

### Estructura
```
         50        <- Raíz
        /  \
      30   70
     / \   / \
   20  40 60 80
```

### Tipos
1. **Árbol Binario General:** Cualquier forma
2. **Árbol Binario Completo:** Todos los niveles llenos
3. **Árbol Binario de Búsqueda (ABB):** Izq < Padre < Der

### Terminología
- **Raíz:** Nodo sin padre
- **Hoja:** Nodo sin hijos
- **Altura:** Distancia de la raíz a la hoja más lejana
- **Nivel:** Distancia del nodo a la raíz
- **Profundidad:** Número de nodos en ruta raíz→nodo

### Recorridos

#### 1. INORDEN (Izq - Raíz - Der)
Produce valores en orden ASCENDENTE en un ABB.
```
20 30 40 50 60 70 80
```

#### 2. PREORDEN (Raíz - Izq - Der)
Útil para copiar el árbol.
```
50 30 20 40 70 60 80
```

#### 3. POSTORDEN (Izq - Der - Raíz)
Útil para eliminar el árbol.
```
20 40 30 60 80 70 50
```

### Operaciones en ABB
- **Búsqueda:** O(log n) promedio
- **Inserción:** O(log n) promedio
- **Eliminación:** O(log n) promedio
- **En peor caso:** O(n) si el árbol está degenerado

### Eliminación de nodos

**Caso 1: Sin hijos (Hoja)**
```
Simplemente eliminar
```

**Caso 2: Un hijo**
```
Conectar el padre del nodo con el hijo del nodo
```

**Caso 3: Dos hijos**
```
1. Buscar el sucesor (mínimo del subárbol derecho)
2. Reemplazar el nodo con el sucesor
3. Eliminar el sucesor de su nueva posición
```

---

## Tabla Comparativa

| Estructura | Inserción | Búsqueda | Eliminación | Tamaño | Acceso |
|-----------|-----------|----------|------------|--------|--------|
| Array | O(n) | O(log n)* | O(n) | Fijo | O(1) |
| Lista Enlazada | O(n) | O(n) | O(n) | Dinámico | O(n) |
| Pila | O(1) | - | O(1) | Dinámico | Cima |
| Cola | O(1) | - | O(1) | Dinámico | Inicio/Fin |
| ABB | O(log n)* | O(log n)* | O(log n)* | Dinámico | O(log n)* |

*Con búsqueda binaria o árbol balanceado

---

## Complejidad de Tiempo

### O(1) - Constante
```
Acceder a elemento por índice
Push/Pop en pila
```

### O(log n) - Logarítmica
```
Búsqueda binaria
Árbol binario balanceado
```

### O(n) - Lineal
```
Búsqueda lineal
Recorrer lista enlazada
```

### O(n log n) - Lineal logarítmica
```
Mergesort
Quicksort (promedio)
```

### O(n²) - Cuadrática
```
Burbuja
Inserción
Selección
```

---

## Consejos para Estudiar

1. **Implementa cada estructura** - No solo leas
2. **Dibuja diagramas** - Visualiza la estructura
3. **Analiza complejidad** - Entiende por qué es O(n)
4. **Practica recorridos** - Especialmente para árboles
5. **Resuelve problemas** - Los entienden mejor haciéndolo

## Archivos incluidos

Run cualquiera de estos archivos para ver ejemplos:
```
- Ejercicios.Arrays
- Ejercicios.ListaEnlazada
- Ejercicios.Pila
- Ejercicios.Cola
- Ejercicios.ArbolBinarioBusqueda
```

---

¡Éxito en tu estudio!
