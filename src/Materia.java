import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas;
    private ArrayList<Curso> cursos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void agregarCorrelativas(Materia materia){

    }

    public void agregarCurso(Curso curso){
        
    }
}
