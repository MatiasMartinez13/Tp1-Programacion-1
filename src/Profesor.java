import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona implements MiembroUniversidad {
    private String especialidad;
    private int aniosExperiencia;
    private List<Materia> materiasAsignadas;

    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad, int aniosExperiencia) {
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.materiasAsignadas = new ArrayList<>();
    }

    public void asignarMateria(Materia materia) {
        materiasAsignadas.add(materia);
    }

    @Override
    public String obtenerRol() {
        return "Profesor";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return toString();
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString() + ", Especialidad: " + especialidad + ", Experiencia: " + aniosExperiencia + " años";
    }
}
