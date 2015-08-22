
public class Curso {

    private int[] notas;
    
    /**
     * pre : cantidadDeAlumnos es mayor a 0.
     * post: inicializa el curso con la cantidad de alumnos
     *       indicados con todas sus notas en 0.
     *       
     * @param cantidadDeAlumnos
     */
    public Curso(int cantidadDeAlumnos) {
        
        if (cantidadDeAlumnos <= 0) {
            
            Error cantidadDeAlumnosIncorrecta = new Error("La cantidad de alumnos debe ser positiva");
        
            throw cantidadDeAlumnosIncorrecta;
        }
        
        this.notas = new int[cantidadDeAlumnos];
        
        for (int i = 0; i < this.notas.length; i++) {
            
            this.notas[i] = 0;
        }
    }
    
    /**
     * post: devuelve la cantidad de alumnos que tiene el curso.
     */
    public int contarAlumnos() {
        
    }
    
    /**
     * pre : numeroDeOrden está entre 1 y contarAlumnos()
     * post: devuelve la nota del alumno cuyo número de orden es el indicado.
     */
    public int obtenerNota(int numeroDeOrden) {
        
    }

    /**
     * pre : numeroDeOrden está entre 1 y contarAlumnos(),
     *       nota está en el rango [0,10].
     * post: cambia el valor de la nota del alumno con el número de orden indicado. 
     */
    public void cambiarNota(int numeroDeOrden, int nota) {
        
    }

    /**
     * post: devuelve el promedio de las notas del curso.
     */
    public double calcularPromedio() {
        
    }
    
    /**
     * post: devuelve la cantidad de alumnos que tienen la nota indicada.
     */
    public int contarAlumnosConNota(int nota) {
        
    }

    /**
     * pre : numeroDeOrden está entre 1 y contarAlumnos().
     * post: cambia el nombre del alumno que tiene el orden indicado.
     */
    public void cambiarNombreAlumno(int numeroDeOrden, String nombreAlumno) {
        
    }

    /**
     * post: devuelve el nombre del alumno que tiene el orden indicado.
     */
    public String obtenerNombreAlumno(int numeroDeOrden) {
        
    }

    /**
     * pre : numeroDeOrden está entre 1 y contarAlumnos()
     * post: cambiar el legajo del alumno que tiene el orden indicado.
     */
    public void cambiarLegajoAlumno(int numeroDeOrden, int legajo) {
        
    }

    /**
     * pre : numeroDeOrden está entre 1 y contarAlumnos()
     * post: devuelve el legajo del alumno que tiene el orden indicado.
     */
    public int obtenerLegajoAlumno(int numeroDeOrden) {
    
    }
}
