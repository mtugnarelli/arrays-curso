

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
     
        return notas.length;
    }


    /**
     * pre : numeroDeAlumno está entre 1 y contarAlumnos(),
     *       nota está en el rango [0,10].
     * post: cambia el valor de la nota del alumno con el número de alumno indicado. 
     */
    public void calificarAlumno(int numeroDeAlumno, int notaDelAlumno) {
        
        validarNumero(numeroDeAlumno);
        validarNota(notaDelAlumno);
        
        notas[numeroDeAlumno - 1] = notaDelAlumno;
    }
    
    /**
     * pre : numeroDeAlumno está entre 1 y contarAlumnos()
     * post: devuelve la nota del alumno cuyo número es el indicado.
     */
    public int obtenerNotaDelAlumno(int numeroDeAlumno) {
        
        validarNumero(numeroDeAlumno);
        
        return notas[numeroDeAlumno - 1];
    }

    /**
     * post: devuelve el promedio de las notas del curso.
     *       Solo considera alumnos calificados, es decir con nota
     *       diferente de 0 (ausentes).
     */
    public double calcularNotaPromedio() {
        
        double sumaDeNotas = 0;
        int alumnosCalificados = 0;
        
        for (int i = 0; i < notas.length; i++) {
            
            if (notas[i] > 0) {
                
                sumaDeNotas = sumaDeNotas + notas[i];
                alumnosCalificados++;
            }
        }
        
        double promedio = 0;
        
        if (alumnosCalificados > 0) {
            
            promedio = sumaDeNotas / alumnosCalificados;
        }
        
        return promedio;
    }
    
    /**
     * post: devuelve la máxima calificación que recibió un alumno del curso.
     * 
     */
    public int buscarNotaMaxima() {
        
        int notaMaxima = 0;
        
        for (int i = 0; i < notas.length; i++) {
            
            if (notas[i] > notaMaxima) {
                
                notaMaxima = notas[i];
            }
        }
        
        return notaMaxima;
    }
    
    /**
     * post: devuelve la mínima calificación que recibió un alumno del curso.
     *       
     */
    public int buscarNotaMinima() {
        
        int notaMinima = 0;
        
        for (int i = 0; i < notas.length; i++) {
            
            if ((notaMinima == 0) || ((notas[i] > 0) && (notas[i] < notaMinima))) {
                
                notaMinima = notas[i];
            }
        }
        
        return notaMinima;
    }
    
    /**
     * post: devuelve la cantidad de alumnos que tienen la nota indicada.
     */
    public int contarAlumnosConNota(int nota) {
        
        int alumnosConNota = 0;
        
        for (int i = 0; i < notas.length; i++) {
            
            if (notas[i] == nota) {

                alumnosConNota++;
            }
        }
        
        return alumnosConNota;
    }

    /**
     * post: lanza una excepción si 'numeroDeAlumno' no está en el rango 
     *       [1..contarAlumnos()]
     */
    private void validarNumero(int numeroDeAlumno) {
 
        if ((numeroDeAlumno < 1) || (numeroDeAlumno > contarAlumnos())) {
            
            Error numeroDeAlumnoInvalido = new Error("Número de alumno inválido");
            throw numeroDeAlumnoInvalido;
        }
    }
    
    /**
     * post: lanza una excepción si 'notaDelAlumno' no está en el rango 
     *       [1..10]
     */
    private void validarNota(int notaDelAlumno) {

        if ((notaDelAlumno < 1) || (notaDelAlumno > 10)) {
            
            Error notaInvalida = new Error("Nota del alumno invalida");
            throw notaInvalida;
        }
    }


}
