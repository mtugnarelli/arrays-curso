
public class Curso {

    private int[] notas;
    
    /**
     * pre : cantidadDeAlumnos es mayor a 0.
     * post: inicializa el curso con la cantidad de alumnos
     *       indicados con todas sus notas en 0.
     *       
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
     
        return 0;
    }


    /**
     * pre : numeroDeAlumno est� entre 1 y contarAlumnos(),
     *       nota est� en el rango [0,10].
     * post: cambia el valor de la nota del alumno con el n�mero de alumno indicado. 
     */
    public void calificarAlumno(int numeroDeAlumno, int notaDelAlumno) {
        
    }
    
    /**
     * pre : numeroDeAlumno est� entre 1 y contarAlumnos()
     * post: devuelve la nota del alumno cuyo n�mero es el indicado.
     */
    public int obtenerNotaDelAlumno(int numeroDeAlumno) {
        
        return 0;
    }

    /**
     * post: devuelve el promedio de las notas del curso.
     *       Solo considera alumnos calificados, es decir con nota
     *       diferente de 0 (ausentes).
     */
    public double calcularNotaPromedio() {
        
        return 0;
    }
    
    /**
     * post: devuelve la m�xima calificaci�n que recibi� un alumno del curso.
     * 
     */
    public int buscarNotaMaxima() {
        
        return 0;
    }
    
    /**
     * post: devuelve la m�nima calificaci�n que recibi� un alumno del curso.
     *       
     */
    public int buscarNotaMinima() {
        
        return 0;
    }
    
    /**
     * post: devuelve la cantidad de alumnos que tienen la nota indicada.
     */
    public int contarAlumnosConNota(int nota) {
        
        return 0;
    }
}
