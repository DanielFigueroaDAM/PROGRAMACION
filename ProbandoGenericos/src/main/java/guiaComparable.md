Aquí tienes una guía con **ejemplos prácticos y concisos** de cómo usar `Comparable` en diferentes escenarios:

---

### **1. Ordenar por un solo campo (numérico)**
```java
public class Producto implements Comparable<Producto> {
    private double precio;

    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio); // Orden ascendente
    }
}
```

---

### **2. Ordenar por un campo String (alfabético)**
```java
public class Libro implements Comparable<Libro> {
    private String titulo;

    @Override
    public int compareTo(Libro otro) {
        return this.titulo.compareTo(otro.titulo); // A-Z
    }
}
```

---

### **3. Ordenar en orden inverso**
```java
public class Estudiante implements Comparable<Estudiante> {
    private int nota;

    @Override
    public int compareTo(Estudiante otro) {
        return Integer.compare(otro.nota, this.nota); // Notas más altas primero
    }
}
```

---

### **4. Ordenar por múltiples campos (prioridad: edad -> nombre)**
```java
public class Empleado implements Comparable<Empleado> {
    private int edad;
    private String nombre;

    @Override
    public int compareTo(Empleado otro) {
        int cmpEdad = Integer.compare(this.edad, otro.edad);
        return (cmpEdad != 0) ? cmpEdad : this.nombre.compareTo(otro.nombre);
    }
}
```

---

### **5. Ordenar usando un enum como criterio**
```java
public class Tarea implements Comparable<Tarea> {
    public enum Prioridad { ALTA, MEDIA, BAJA }
    private Prioridad prioridad;

    @Override
    public int compareTo(Tarea otra) {
        return this.prioridad.compareTo(otra.prioridad); // ALTA < MEDIA < BAJA
    }
}
```

---

### **6. Ordenar objetos personalizados con lógica compleja**
```java
public class Punto implements Comparable<Punto> {
    private int x;
    private int y;

    @Override
    public int compareTo(Punto otro) {
        // Compara por distancia al origen (0,0)
        double distThis = Math.sqrt(x * x + y * y);
        double distOtro = Math.sqrt(otro.x * otro.x + otro.y * otro.y);
        return Double.compare(distThis, distOtro);
    }
}
```

---

### **7. Ordenar ignorando mayúsculas/minúsculas**
```java
public class Ciudad implements Comparable<Ciudad> {
    private String nombre;

    @Override
    public int compareTo(Ciudad otra) {
        return this.nombre.compareToIgnoreCase(otra.nombre);
    }
}
```

---

### **8. Ordenar por fecha (usando `LocalDate`)**
```java
public class Evento implements Comparable<Evento> {
    private LocalDate fecha;

    @Override
    public int compareTo(Evento otro) {
        return this.fecha.compareTo(otro.fecha); // Cronológico
    }
}
```

---

### **9. Combinar múltiples comparaciones (3 campos)**
```java
public class Jugador implements Comparable<Jugador> {
    private int goles;
    private int asistencias;
    private String nombre;

    @Override
    public int compareTo(Jugador otro) {
        int cmpGoles = Integer.compare(otro.goles, this.goles); // Más goles primero
        if (cmpGoles != 0) return cmpGoles;

        int cmpAsistencias = Integer.compare(otro.asistencias, this.asistencias);
        if (cmpAsistencias != 0) return cmpAsistencias;

        return this.nombre.compareTo(otro.nombre);
    }
}
```

---

### **10. Manejo de `null` en comparaciones**
```java
public class Cliente implements Comparable<Cliente> {
    private String dni;

    @Override
    public int compareTo(Cliente otro) {
        if (otro == null) throw new NullPointerException();
        return this.dni.compareTo(otro.dni);
    }
}
```

---

### **Errores comunes & Tips**
1. **No usar resta para comparar enteros**:
   ```java
   // ❌ Peligro de overflow
   return this.edad - otro.edad;
   
   // ✅ Correcto
   return Integer.compare(this.edad, otro.edad);
   ```

2. **Inconsistencia con `equals()`**:
   ```java
   // Si dos objetos son iguales para compareTo(),
   // deberían serlo para equals() (y viceversa)
   ```

3. **Ordenar listas mixtas**:
   ```java
   List<Number> numeros = Arrays.asList(5, 2.3, 1L);
   // No se puede ordenar si los elementos no implementan Comparable
   ```

---

### **¿Cuándo usar `Comparable` vs `Comparator`?**
- Usa `Comparable` cuando:
    - Es el **orden natural** de los objetos (ej: fechas cronológicamente).
    - Controlas la clase del objeto.

- Usa `Comparator` cuando:
    - Necesitas **múltiples formas de ordenar** (ej: ordenar personas por nombre o edad).
    - No puedes modificar la clase original.

---

Con estos ejemplos, podrás implementar rápidamente la lógica de comparación que necesites en tus clases. 😊

Aquí tienes una guía paso a paso para usar la interfaz `Comparable` con colecciones en Java:

---

### **1. Introducción a la interfaz `Comparable`**
La interfaz `Comparable` permite definir un orden natural para los objetos de una clase. Se utiliza para ordenar colecciones (como `List`, `Set`, etc.) usando métodos como `Collections.sort()`.

---

### **2. Implementar `Comparable` en una clase**
Para que los objetos de una clase puedan ser ordenados, la clase debe implementar `Comparable<T>` y sobrescribir el método `compareTo(T o)`.

**Ejemplo: Clase `Persona`**
```java
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método compareTo: define el orden natural (por edad)
    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }

    // Getters y toString (opcional, para mostrar resultados)
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
```

---

### **3. Uso de `Collections.sort()`**
Una vez implementado `Comparable`, puedes ordenar listas de objetos usando `Collections.sort()`.

**Ejemplo de ordenación:**
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 30));
        personas.add(new Persona("Marta", 22));

        System.out.println("Antes de ordenar: " + personas); 
        // Salida: [Ana (25), Luis (30), Marta (22)]

        Collections.sort(personas); // Ordena usando compareTo

        System.out.println("Después de ordenar: " + personas); 
        // Salida: [Marta (22), Ana (25), Luis (30)]
    }
}
```

---

### **4. Reglas para implementar `compareTo`**
- **Retorno negativo**: Si `this` es menor que `otra`.
- **Retorno cero**: Si `this` es igual a `otra`.
- **Retorno positivo**: Si `this` es mayor que `otra`.

**Ejemplo de comparación por múltiples campos:**
```java
@Override
public int compareTo(Persona otra) {
    // Primero compara por edad
    int resultado = Integer.compare(this.edad, otra.edad);
    // Si las edades son iguales, compara por nombre
    if (resultado == 0) {
        resultado = this.nombre.compareTo(otra.nombre);
    }
    return resultado;
}
```

---

### **5. Diferencias entre `Comparable` y `Comparator`**
| **`Comparable`** | **`Comparator`** |
|-------------------|-------------------|
| Define el orden natural de la clase. | Define órdenes personalizados (ej: ordenar por nombre o edad). |
| Se implementa en la clase a ordenar. | Se crea en una clase separada o lambda. |
| Método: `compareTo(T o)` | Método: `compare(T o1, T o2)` |

---

### **6. Mejores prácticas**
- **Consistencia con `equals()`**: Si `a.compareTo(b) == 0`, debería cumplirse que `a.equals(b)` (recomendado para evitar comportamientos inesperados en colecciones ordenadas).
- **Manejo de `null`**: Lanza `NullPointerException` si se compara con `null` (comportamiento estándar).
- **Uso de métodos de comparación**: En lugar de restar valores (puede causar overflow), usa `Integer.compare()`, `Double.compare()`, etc.

---

### **7. Ejemplo completo**
```java
// Clase Persona implementando Comparable
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

// Clase Main
public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 30));
        personas.add(new Persona("Marta", 22));

        Collections.sort(personas);
        System.out.println("Ordenado por edad: " + personas);
    }
}
```

**Salida:**
```
Ordenado por edad: [Marta (22), Ana (25), Luis (30)]
```

---

### **8. Casos comunes de error**
- **No implementar `Comparable`**: Si intentas ordenar una lista de objetos que no implementan `Comparable`, `Collections.sort()` lanzará un error.
- **Inconsistencia con `equals()`**: Puede causar problemas en colecciones como `TreeSet`.

---

Con esta guía, podrás definir el orden natural de tus clases y trabajar con colecciones ordenadas en Java de manera eficiente.

Aquí tienes una explicación de cómo usar `Comparable` junto con otros métodos y clases en Java, con ejemplos prácticos:

---

### **1. Con `Collections.sort()`**
El método más común para ordenar listas usando el orden natural definido por `Comparable`.

```java
List<Persona> personas = new ArrayList<>();
// ... agregar personas
Collections.sort(personas); // Ordena usando compareTo
```

---

### **2. Con `TreeSet` y `TreeMap`**
Estas clases usan el orden natural (`Comparable`) automáticamente para mantener elementos ordenados.

```java
// TreeSet con Comparable
Set<Persona> setOrdenado = new TreeSet<>();
setOrdenado.add(new Persona("Ana", 25));
setOrdenado.add(new Persona("Luis", 30)); // Se ordenan al insertar

// TreeMap con Comparable (claves)
Map<Persona, String> mapaOrdenado = new TreeMap<>();
mapaOrdenado.put(new Persona("Marta", 22), "CEO");
```

---

### **3. Con `Arrays.sort()`**
Funciona para ordenar arreglos de objetos que implementan `Comparable`.

```java
Persona[] personasArray = new Persona[3];
// ... llenar el arreglo
Arrays.sort(personasArray); // Ordena usando compareTo
```

---

### **4. Con `Collections.min()` y `Collections.max()`**
Encuentra el mínimo y máximo de una colección usando `compareTo`.

```java
Persona masJoven = Collections.min(personas); // Menor según compareTo
Persona mayor = Collections.max(personas); // Mayor según compareTo
```

---

### **5. Con `PriorityQueue`**
La cola de prioridad usa el orden natural (`Comparable`) para gestionar elementos.

```java
PriorityQueue<Persona> colaPrioridad = new PriorityQueue<>();
colaPrioridad.add(new Persona("Ana", 25)); // Se ordenan internamente
```

---

### **6. Con `Comparators.naturalOrder()` (Java 8+)**
Obtén un `Comparator` basado en el orden natural (`Comparable`).

```java
List<Persona> personas = new ArrayList<>();
// Ordenar usando el orden natural explícitamente
personas.sort(Comparator.naturalOrder());
```

---

### **7. En Streams (Java 8+)**
Ordena elementos en un stream usando el orden natural.

```java
List<Persona> personasOrdenadas = personas.stream()
    .sorted() // Usa compareTo
    .toList();
```

---

### **8. Con `List.sort()`**
Ordena una lista usando su propio método `sort` (equivalente a `Collections.sort()`).

```java
personas.sort(null); // El argumento 'null' indica orden natural
```

---

### **9. En Algoritmos Personalizados**
Implementa algoritmos que requieren comparaciones (ej: búsqueda binaria).

```java
Collections.sort(personas); // Primero ordenar
int index = Collections.binarySearch(personas, new Persona("Ana", 25)); // Busca usando compareTo
```

---

### **10. Con `Objects.compare()` (Java 7+)**
Compara objetos de forma segura usando `Comparable`.

```java
public class Util {
    public static <T extends Comparable<T>> int compararSeguro(T a, T b) {
        return Objects.compare(a, b, Comparator.naturalOrder());
    }
}
```

---

### **Ejemplo Integrado**
```java
public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
            new Producto("Laptop", 999.99),
            new Producto("Mouse", 19.99)
        );

        // Usando métodos con Comparable:
        Collections.sort(productos); // Ordena por precio
        Producto masBarato = Collections.min(productos);
        productos.forEach(System.out::println); // Imprime ordenados
    }
}
```

---

### **Mejores Prácticas**
1. **Consistencia con `equals()`**:
   ```java
   @Override
   public boolean equals(Object o) {
       // ... lógica que coincida con compareTo()
   }
   ```

2. **Manejo de `null`**:
    - `compareTo` debe lanzar `NullPointerException` si se compara con `null`.

3. **Documentar el orden natural**:
   ```java
   /**
    * Ordena por precio ascendente; para órdenes alternos, usar un Comparator.
    */
   @Override
   public int compareTo(Producto otro) { ... }
   ```

---

### **Errores Comunes**
- **Usar `Comparable` en clases que no lo implementan**:
  ```java
  List<Object> lista = Arrays.asList(5, "texto"); // Error al ordenar
  Collections.sort(lista); // ClassCastException
  ```

- **Invertir el orden en `compareTo`**:
  ```java
  // ❌ Para orden descendente, no uses "otro - this"
  return otro.precio - this.precio; // Peligroso con números no enteros
  // ✅ Correcto
  return Double.compare(otro.precio, this.precio);
  ```

---

Con estos ejemplos, entenderás cómo integrar `Comparable` con las principales APIs de Java para ordenar y gestionar colecciones eficientemente. 🚀