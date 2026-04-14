# 📚 GUÍA COMPLETA DE ESTRUCTURAS DE DATOS EN JAVA

¡Bienvenido! Esta es una **guía de estudio interactiva** sobre estructuras de datos. Contiene teoría, implementaciones, ejemplos y ejercicios prácticos.

## 📁 Estructura del Proyecto

```
practica/
├── src/main/java/com/analisis/
│   ├── Main.java                              # Programa original
│   ├── Ejercicios.java                        # Archivo de ejercicios
│   ├── GuiaEstudio.md                         # GUÍA TEÓRICA (LEE ESTO PRIMERO)
│   │
│   ├── estructuras/                           # Implementaciones de estructuras
│   │   ├── Arrays.java                        # Arreglos uni y bidimensionales
│   │   ├── ListaEnlazada.java                # Listas enlazadas
│   │   ├── NodoLista.java                    # Nodo para listas
│   │   ├── Pila.java                         # Pilas (LIFO)
│   │   ├── Cola.java                         # Colas (FIFO)
│   │   ├── ArbolBinarioBusqueda.java          # Árboles binarios
│   │   ├── NodoArbol.java                    # Nodo para árboles
│   │   └── DemoEstructuras.java               # PROGRAMA INTERACTIVO
│   │
│   └── ejercicios/
│       └── EjerciciosPracticos.java           # EJERCICIOS PARA PRACTICAR
│
├── pom.xml                                    # Configuración Maven
└── README.md                                  # Este archivo

```

## 🚀 Cómo Empezar

### OPCIÓN 1: Leer la teoría primero
1. Ve a `src/main/java/com/analisis/GuiaEstudio.md`
2. Lee toda la documentación teórica
3. Entiende cada estructura antes de ver código

### OPCIÓN 2: Ejecutar los programas

#### Programa Interactivo (RECOMENDADO)
```bash
# En VS Code:
# 1. Abre DemoEstructuras.java
# 2. Click derecho > Run o presiona Ctrl+Shift+F10
# 3. Sigue el menú interactivo

# Desde terminal:
java -cp target/classes com.analisis.estructuras.DemoEstructuras
```

#### Ver ejemplos individuales
```bash
# Arrays
java -cp target/classes com.analisis.estructuras.Arrays

# Listas Enlazadas
java -cp target/classes com.analisis.estructuras.ListaEnlazada

# Pilas
java -cp target/classes com.analisis.estructuras.Pila

# Colas
java -cp target/classes com.analisis.estructuras.Cola

# Árboles Binarios
java -cp target/classes com.analisis.estructuras.ArbolBinarioBusqueda
```

#### Ejercicios
```bash
java -cp target/classes com.analisis.ejercicios.EjerciciosPracticos
```

## 📖 Contenido

### 1. **Arreglos (Arrays)**
- ✅ Búsqueda lineal y binaria
- ✅ Ordenamiento (bubble sort)
- ✅ Suma, máximo, mínimo
- ✅ Inversión de arreglos
- ✅ Matriz: suma, multiplicación, transpuesta
- 📚 Complejidad: Acceso O(1), búsqueda O(log n), inserción O(n)

### 2. **Listas Enlazadas**
- ✅ Inserción al inicio/final/en posición
- ✅ Eliminación
- ✅ Búsqueda
- ✅ Inversión de lista
- ✅ Genérico (puede almacenar cualquier tipo)
- 📚 Complejidad: O(1) inserción/eliminación en inicio, O(n) en otros casos

### 3. **Pilas (Stack)**
- ✅ Push/Pop/Peek
- ✅ Validación de paréntesis
- ✅ LIFO (Last In, First Out)
- 📚 Complejidad: O(1) todas las operaciones
- 💡 Casos: Deshacer/Rehacer, navegación, expresiones

### 4. **Colas (Queue)**
- ✅ Enqueue/Dequeue
- ✅ FIFO (First In, First Out)
- ✅ Ejemplo: Sistema de turnos
- 📚 Complejidad: O(1) todas las operaciones
- 💡 Casos: Colas de espera, BFS

### 5. **Árboles Binarios de Búsqueda (ABB)**
- ✅ Inserción manteniendo orden
- ✅ Búsqueda eficiente
- ✅ Eliminación (3 casos)
- ✅ Tres tipos de recorrido:
  - **Inorden**: Orden ascendente
  - **Preorden**: Para copiar el árbol
  - **Postorden**: Para eliminar el árbol
- 📚 Complejidad: O(log n) promedio, O(n) peor caso
- 💡 Casos: Sistemas de archivos, búsquedas, bases de datos

## 🎯 Plan de Estudio Recomendado

### Semana 1: Conceptos Básicos
1. Lee `GuiaEstudio.md` completamente
2. Ejecuta `DemoEstructuras.java` y explora cada estructura
3. Entiendo ejemplos de `Arrays.java`

### Semana 2: Estructuras Dinámicas
1. Estudia `ListaEnlazada.java`
2. Entiende la diferencia con arrays
3. Practica ejercicio 9-11

### Semana 3: Estructuras Abstractas
1. Domina `Pila.java` y `Cola.java`
2. Entiende LIFO vs FIFO
3. Practica ejercicio 12-17

### Semana 4: Árboles
1. Estudia `ArbolBinarioBusqueda.java`
2. Practica recorridos (inorden, preorden, postorden)
3. Practica ejercicio 18-20

### Semana 5: Integración
1. Resuelve todos los desafíos complejos
2. Implementa estructuras personalizadas
3. Optimiza complejidad

## 🔥 Ejercicios Prácticos

### Archivo: `EjerciciosPracticos.java`

Contiene 20 ejercicios + 3 desafíos:

**Fáciles (1-5):** Arrays y búsqueda
**Medios (6-14):** Matrices, listas, pilas
**Difíciles (15-20):** Colas, árboles, algoritmos avanzados
**Desafíos:** Problemas integrados

Cada ejercicio tiene:
- Descripción del problema
- Ejemplo de entrada/salida
- Plantilla de código
- Solución comentada (algunos)

## 📊 Tabla Rápida de Referencia

| Estructura | Inserción | Búsqueda | Eliminación | Cuándo usar |
|-----------|-----------|----------|------------|------------|
| **Array** | O(n) | O(log n)* | O(n) | Acceso rápido por índice |
| **Lista** | O(n) | O(n) | O(n) | Tamaño variable |
| **Pila** | O(1) | - | O(1) | LIFO (deshacer) |
| **Cola** | O(1) | - | O(1) | FIFO (turnos) |
| **ABB** | O(log n)* | O(log n)* | O(log n)* | Datos ordenados |

*Con búsqueda binaria o árbol balanceado

## 💻 Compilar y Ejecutar

### Compilación
```bash
# Con Maven
mvn clean compile

# Manual
javac src/main/java/com/analisis/estructuras/*.java
javac src/main/java/com/analisis/ejercicios/*.java
```

### Ejecución
```bash
# Programa principal interactivo
java -cp src/main/java com.analisis.estructuras.DemoEstructuras

# Cualquier clase con método main
java -cp src/main/java com.analisis.estructuras.Arrays
```

## 🎓 Conceptos Clave a Dominar

### Complejidad de Tiempo
- **O(1)**: Operación constante
- **O(log n)**: Búsqueda binaria
- **O(n)**: Recorrido completo
- **O(n log n)**: Merge sort, quick sort
- **O(n²)**: Bubble sort, bucles anidados

### Estructuras ADT (Abstract Data Types)
- **Array**: Conjunto contiguo de elementos
- **Lista**: Colección dinámica con acceso secuencial
- **Pila**: Estructura LIFO
- **Cola**: Estructura FIFO
- **Árbol**: Estructura jerárquica

### Recorridos de Árboles
```
        50
       /  \
      30  70
     / \  / \
   20 40 60 80

Inorden:    20 30 40 50 60 70 80    (Ascendente)
Preorden:   50 30 20 40 70 60 80    (Raíz primero)
Postorden:  20 40 30 60 80 70 50    (Raíz último)
```

## 🐛 Debugging Tips

Si un programa no funciona:

1. **Arrays**: Verificar índices (0 a length-1)
2. **Listas**: Revisar si es null antes de acceder
3. **Pilas/Colas**: Verificar estaVacia() antes de pop/dequeue
4. **Árboles**: Usar recorridos para verificar estructura
5. **Recursión**: Verificar caso base

## 📚 Recursos Adicionales

- Visualizar estructura online: www.visualgo.net
- Complexity cheat sheet: Dentro de `GuiaEstudio.md`
- Prueba los ejemplos: Todos tienen main() ejecutable

## ✅ Checklist de Aprendizaje

- [ ] Entiendo diferencia entre Array y Lista
- [ ] Puedo implementar Pila desde cero
- [ ] Puedo implementar Cola desde cero
- [ ] Comprendo los 3 recorridos de árboles
- [ ] Puedo eliminar nodo con 2 hijos de ABB
- [ ] Calculo complejidad de mis algoritmos
- [ ] He resuelto todos los 20 ejercicios
- [ ] He completado los 3 desafíos

## ❓ Preguntas Frecuentes

**P: ¿Por qué es O(log n) la búsqueda binaria?**
A: Divide el espacio de búsqueda por 2 cada vez. log₂(1000) ≈ 10

**P: ¿Cuándo usar Pila vs Cola?**
A: Pila = deshacer/rehacer. Cola = turnos/procesamiento

**P: ¿Cómo sé si un árbol está balanceado?**
A: Altura diferencia entre subárboles ≤ 1 en cada nodo

**P: ¿Por qué ArrayList es mejor que Array?**
A: ArrayList crece dinámicamente, Array es tamaño fijo

## 🎉 ¡Éxito en tu estudio!

Recuerda:
- **Practica** construcción de estructuras
- **Dibuja** diagramas para visualizar
- **Analiza** complejidad de tus soluciones
- **Resuelve** problemas variados

---

Hecho con ❤️ para aprender estructuras de datos
