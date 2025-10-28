public class Estudiante extends Persona implements MiembroUniversidad {
    private String carrera;
    private double promedio;
    private Materia[] materias;

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera, Materia[] materias) {
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.materias = materias;
        this.promedio = calcularPromedioIterativo();
    }

    public static double calcularPromedioRecursivo(Materia[] materias, int indice) {
        if (materias == null || materias.length == 0) return 0;
        if (indice == materias.length - 1) return materias[indice].getNota();
        return materias[indice].getNota() + calcularPromedioRecursivo(materias, indice + 1);
    }

    public double calcularPromedioIterativo() {
        if (materias == null || materias.length == 0) return 0;
        double suma = 0;
        for (Materia m : materias) suma += m.getNota();
        return suma / materias.length;
    }

    @Override
    public String obtenerRol() {
        return "Estudiante";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return toString();
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + ", Carrera: " + carrera + ", Promedio: " + promedio;
    }
}
