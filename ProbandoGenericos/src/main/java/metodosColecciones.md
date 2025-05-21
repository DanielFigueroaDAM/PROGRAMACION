Aquí tienes una descripción de los **métodos más importantes** de las principales colecciones en Java, agrupados por tipo:

---

### **1. List (ArrayList, LinkedList)**
Métodos comunes de la interfaz `List`:

| **Método**                           | **Descripción**                                                                 |
|--------------------------------------|---------------------------------------------------------------------------------|
| `add(E element)`                     | Agrega un elemento al final de la lista.                                        |
| `add(int index, E element)`          | Inserta un elemento en la posición especificada.                                |
| `get(int index)`                     | Obtiene el elemento en la posición indicada.                                    |
| `remove(int index)`                  | Elimina el elemento en la posición especificada.                                |
| `remove(Object o)`                   | Elimina la primera ocurrencia del objeto.                                       |
| `size()`                             | Retorna el número de elementos.                                                 |
| `contains(Object o)`                 | Verifica si el elemento existe.                                                 |
| `set(int index, E element)`          | Reemplaza el elemento en la posición dada.                                      |
| `indexOf(Object o)`                  | Retorna la posición de la primera ocurrencia del elemento.                      |
| `subList(int from, int to)`          | Retorna una sublista entre las posiciones `from` (inclusive) y `to` (exclusive).|

**Ejemplo:**
```java
List<String> lista = new ArrayList<>();
lista.add("A");       // [A]
lista.add(0, "B");    // [B, A]
String elemento = lista.get(1); // "A"
lista.remove(0);      // [A]
```

---

### **2. Set (HashSet, TreeSet, LinkedHashSet)**
Métodos comunes de la interfaz `Set`:

| **Método**              | **Descripción**                                  |
|-------------------------|--------------------------------------------------|
| `add(E element)`        | Agrega el elemento si no existe. Retorna `boolean`. |
| `remove(Object o)`      | Elimina el elemento si está presente.            |
| `contains(Object o)`    | Verifica si el elemento existe.                  |
| `size()`                | Retorna el número de elementos.                  |
| `isEmpty()`             | Verifica si el conjunto está vacío.              |
| `iterator()`            | Retorna un iterador para recorrer elementos.     |

**Ejemplo:**
```java
Set<Integer> numeros = new HashSet<>();
numeros.add(5);     // true
numeros.add(5);     // false (duplicado)
numeros.contains(5); // true
```

---

### **3. Queue (LinkedList, PriorityQueue)**
Métodos comunes de la interfaz `Queue`:

| **Método**       | **Descripción**                                                                 |
|------------------|---------------------------------------------------------------------------------|
| `add(E element)` | Agrega un elemento. Lanza excepción si no hay espacio.                          |
| `offer(E e)`     | Agrega un elemento. Retorna `false` si no hay espacio.                          |
| `remove()`       | Elimina y retorna el primer elemento. Lanza excepción si está vacía.            |
| `poll()`         | Elimina y retorna el primer elemento. Retorna `null` si está vacía.             |
| `element()`      | Retorna el primer elemento (sin eliminarlo). Lanza excepción si está vacía.     |
| `peek()`         | Retorna el primer elemento (sin eliminarlo). Retorna `null` si está vacía.      |

**Ejemplo:**
```java
Queue<String> cola = new LinkedList<>();
cola.offer("A");       // [A]
cola.offer("B");       // [A, B]
String primero = cola.poll(); // "A" → [B]
```

---

### **4. Deque (ArrayDeque, LinkedList)**
Métodos adicionales de la interfaz `Deque` (cola doble):

| **Método**            | **Descripción**                                 |
|-----------------------|-------------------------------------------------|
| `addFirst(E e)`       | Agrega al inicio.                               |
| `addLast(E e)`        | Agrega al final.                                |
| `removeFirst()`       | Elimina y retorna el primer elemento.           |
| `removeLast()`        | Elimina y retorna el último elemento.           |
| `peekFirst()`         | Retorna el primer elemento (sin eliminar).      |
| `peekLast()`          | Retorna el último elemento (sin eliminar).      |

**Ejemplo:**
```java
Deque<Integer> deque = new ArrayDeque<>();
deque.addFirst(10);     // [10]
deque.addLast(20);      // [10, 20]
int ultimo = deque.removeLast(); // 20 → [10]
```

---

### **5. Map (HashMap, TreeMap, LinkedHashMap)**
Métodos comunes de la interfaz `Map`:

| **Método**                 | **Descripción**                                                                 |
|----------------------------|---------------------------------------------------------------------------------|
| `put(K key, V value)`      | Inserta un par clave-valor. Retorna el valor anterior (si la clave ya existía). |
| `get(Object key)`          | Retorna el valor asociado a la clave.                                           |
| `remove(Object key)`       | Elimina la clave y su valor. Retorna el valor eliminado.                        |
| `containsKey(Object key)`  | Verifica si existe la clave.                                                   |
| `containsValue(Object v)`  | Verifica si existe el valor.                                                   |
| `keySet()`                 | Retorna un `Set` con todas las claves.                                         |
| `values()`                 | Retorna un `Collection` con todos los valores.                                 |
| `entrySet()`               | Retorna un `Set` de pares `Map.Entry<K, V>`.                                   |
| `size()`                   | Retorna el número de pares clave-valor.                                        |

**Ejemplo:**
```java
Map<String, Integer> edades = new HashMap<>();
edades.put("Ana", 25);       // Ana=25
edades.get("Ana");           // 25
edades.containsKey("Luis");  // false
```

---

### **6. Métodos Específicos de Implementaciones**
#### **TreeSet y TreeMap** (ordenados):
- `first()`: Retorna el primer elemento (más pequeño en `TreeSet` o clave menor en `TreeMap`).
- `last()`: Retorna el último elemento (más grande en `TreeSet` o clave mayor en `TreeMap`).
- `ceiling(E e)`: Retorna el elemento menor o igual a `e`.
- `floor(E e)`: Retorna el elemento mayor o igual a `e`.

**Ejemplo:**
```java
TreeSet<Integer> numeros = new TreeSet<>(Set.of(5, 2, 8));
numeros.first(); // 2
numeros.ceiling(4); // 5
```

#### **PriorityQueue** (orden por prioridad):
- `comparator()`: Retorna el `Comparator` usado para ordenar (o `null` si es orden natural).

---

### **7. Métodos de Iteración**
Todas las colecciones (excepto `Map`) implementan `Iterable`, por lo que pueden usarse con:

```java
// Con for-each
for (String elemento : lista) {
    System.out.println(elemento);
}

// Con iterador
Iterator<String> it = lista.iterator();
while (it.hasNext()) {
    String elemento = it.next();
}
```

---

### **8. Métodos Útiles de Collections**
Clase utilitaria `Collections`:
- `sort(List<T> list)`: Ordena una lista usando el orden natural (`Comparable`).
- `reverse(List<?> list)`: Invierte el orden de la lista.
- `shuffle(List<?> list)`: Mezcla los elementos aleatoriamente.
- `binarySearch(List<T> list, T key)`: Búsqueda binaria (la lista debe estar ordenada).

---

Con estos métodos, podrás manipular eficientemente las colecciones en Java. 😊