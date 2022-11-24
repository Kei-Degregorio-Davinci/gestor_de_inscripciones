import java.util.ArrayList;

public class Estudiante extends Persona {
    private ArrayList<Materia> materias;
    private ArrayList<Curso> cursos;

    Estudiante(int dni, String nombre) {
        super(dni,nombre);
        setMaterias(new ArrayList<Materia>());
        setCursos(new ArrayList<Curso>());

    }

    public void inscribirMateria(Materia materia){

    }

    public void inscribirCurso(Curso curso){
        
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
