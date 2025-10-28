import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<MiembroUniversidad> miembros;

    public Universidad() {
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(MiembroUniversidad miembro) {
        miembros.add(miembro);
    }

    public void listarMiembros() {
        for (MiembroUniversidad m : miembros) {
            System.out.println(m.obtenerInformacionCompleta());
        }
    }

    public static int contarEstudiantesRecursivo(Estudiante[] estudiantes, String carrera, int indice) {
        if (indice >= estudiantes.length) return 0;
        int contador = estudiantes[indice].obtenerRol().equals("Estudiante") && 
                       estudiantes[indice].toString().contains(carrera) ? 1 : 0;
        return contador + contarEstudiantesRecursivo(estudiantes, carrera, indice + 1);
    }

    public static Estudiante[] ordenarEstudiantesPorApellido(Estudiante[] estudiantes) {
        int n = estudiantes.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (estudiantes[j].getApellido().compareTo(estudiantes[indiceMinimo].getApellido()) < 0) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo != i) {
                Estudiante temp = estudiantes[i];
                estudiantes[i] = estudiantes[indiceMinimo];
                estudiantes[indiceMinimo] = temp;
            }
        }
        return estudiantes;
    }

    public static int busquedaBinariaEstudiantes(Estudiante[] estudiantes, String apellido) {
        int izquierda = 0;
        int derecha = estudiantes.length - 1;
        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            int comparacion = estudiantes[medio].getApellido().compareToIgnoreCase(apellido);
            if (comparacion == 0) return medio;
            else if (comparacion < 0) izquierda = medio + 1;
            else derecha = medio - 1;
        }
        return -1;
    }
}
