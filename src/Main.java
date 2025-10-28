public class Main {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Fernando", "Rosales", 45, "10223344", "Matemática", 20);
        Profesor prof2 = new Profesor("Walter", "Magallanes", 50, "11222333", "Programación", 25);

        Materia[] materias1 = {
            new Materia("Matemática I", 7.5, prof1),
            new Materia("Programación", 9.0, prof2)
        };
        Materia[] materias2 = {
            new Materia("Matemática II", 8.5, prof1),
            new Materia("Programación Avanzada", 9.5, prof2)
        };

        Estudiante e1 = new Estudiante("Guillermina", "Hernandez", 20, "45111222", "Ingeniería", materias1);
        Estudiante e2 = new Estudiante("Juan", "Garetto", 21, "44954668", "Sistemas", materias2);

        Personal p1 = new Personal("Antonella", "Martínez", 38, "33111444", "Administración", "Secretaria", "2010-03-12");

        Universidad u = new Universidad();
        u.agregarMiembro(e1);
        u.agregarMiembro(e2);
        u.agregarMiembro(prof1);
        u.agregarMiembro(prof2);
        u.agregarMiembro(p1);

        System.out.println("=== Listado de Miembros ===");
        u.listarMiembros();

        System.out.println("\n=== Ordenamiento por Apellido ===");
        Estudiante[] lista = {e1, e2};
        Universidad.ordenarEstudiantesPorApellido(lista);
        for (Estudiante e : lista) System.out.println(e);

        System.out.println("\n=== Búsqueda Binaria (Apellido = 'Garetto') ===");
        int pos = Universidad.busquedaBinariaEstudiantes(lista, "Garetto");
        System.out.println(pos >= 0 ? "Encontrado: " + lista[pos] : "No encontrado");
    }
}
