## Entregables para la parte Algoritmos Recursivos y Ordenamiento/Búsqueda

### 1. Código fuente de los métodos

**Promedio de estudiante:**
```java
// Recursivo
public static double calcularPromedioRecursivo(Materia[] materias, int indice) {
    if (indice >= materias.length) return 0;
    return materias[indice].getNota() + calcularPromedioRecursivo(materias, indice + 1);
}

// Iterativo
public double calcularPromedioIterativo() {
    double suma = 0;
    for (Materia m : materias) suma += m.getNota();
    return suma / materias.length;
}
```

**Contar estudiantes por carrera:**
```java
// Recursivo
public static int contarEstudiantesRecursivo(Estudiante[] estudiantes, String carrera, int indice) {
    if (indice >= estudiantes.length) return 0;
    int c = estudiantes[indice].getCarrera().equals(carrera) ? 1 : 0;
    return c + contarEstudiantesRecursivo(estudiantes, carrera, indice + 1);
}

// Iterativo
public static int contarEstudiantesIterativo(Estudiante[] estudiantes, String carrera) {
    int c = 0;
    for (Estudiante e : estudiantes) {
        if (e.getCarrera().equals(carrera)) c++;
    }
    return c;
}
```

### 2. Ventajas y desventajas

- Recursivo: fácil y comodo para leer, se utiliza más memoria.
- Iterativo: más rápido y eficiente pero más largo de escribir.

### 3. Ordenamiento de estudiantes por apellido
```java
public static Estudiante[] ordenarEstudiantesPorApellido(Estudiante[] estudiantes) {
    for (int i = 0; i < estudiantes.length - 1; i++) {
        int min = i;
        for (int j = i + 1; j < estudiantes.length; j++) {
            if (estudiantes[j].getApellido().compareTo(estudiantes[min].getApellido()) < 0) {
                min = j;
            }
        }
        Estudiante temp = estudiantes[i];
        estudiantes[i] = estudiantes[min];
        estudiantes[min] = temp;
    }
    return estudiantes;
}
```

### 4. Búsqueda binaria por apellido
```java
public static int busquedaBinariaEstudiantes(Estudiante[] estudiantes, String apellido) {
    int izquierda = 0, derecha = estudiantes.length - 1;
    while (izquierda <= derecha) {
        int medio = (izquierda + derecha) / 2;
        if (estudiantes[medio].getApellido().equals(apellido)) return medio;
        else if (estudiantes[medio].getApellido().compareTo(apellido) < 0) izquierda = medio + 1;
        else derecha = medio - 1;
    }
    return -1;
}
```

