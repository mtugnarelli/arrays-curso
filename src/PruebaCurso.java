import org.junit.Assert;
import org.junit.Test;


public class PruebaCurso {

    @Test
    public void crearCursoCon29Alumnos() {
        
        Curso matematica = new Curso(29);
        
        Assert.assertEquals("cantidad de alumnos", 29, matematica.contarAlumnos());
    }
    
    @Test
    public void crearCursoCon10Alumnos() {
       
        Curso fisica = new Curso(10);
        
        Assert.assertEquals("cantidad de alumnos", 10, fisica.contarAlumnos());
    }
    
    @Test(expected = Error.class)
    public void noSePuedeCrearUnCursoSinAlumnos() {
        
        new Curso(0);
    }
    
    @Test
    public void calificarAlPrimerAlumnoConUn9() {
        
        Curso fisica = new Curso(23);
        
        fisica.calificarAlumno(1, 9);
        
        Assert.assertEquals("calificación del primer alumno", 9, fisica.obtenerNotaDelAlumno(1));
    }
    
    @Test
    public void calificarAlTercerAlumnoConUn6() {
        
        Curso ingles = new Curso(5);
        
        ingles.calificarAlumno(3, 6);
        
        Assert.assertEquals("calificación del tercer alumno", 6, ingles.obtenerNotaDelAlumno(3));
    }
    
    @Test
    public void calificarUltimoAlumnoConUn7() {
        
        Curso fisica = new Curso(24);
        
        fisica.calificarAlumno(24, 7);
        
        Assert.assertEquals("calificación del último alumno", 7, fisica.obtenerNotaDelAlumno(24));
    }
    
    @Test(expected = Error.class)
    public void lanzaUnaExcepcionAlIntentarCalificarUnNumeroDeAlumnoSuperiorALaCantidadDeAlumnos() {
        
        Curso ingles = new Curso(10);
        
        ingles.calificarAlumno(11, 7);
    }
    
    @Test(expected = Error.class)
    public void lanzaUnaExcepcionAlIntentarCalificarUnNumeroDeAlumnoInferiorAlPrimero() {
        
        Curso ingles = new Curso(10);
        
        ingles.calificarAlumno(0, 7);
    }
    
    @Test(expected = Error.class)
    public void lanzaUnaExcepcionAlIntentarCalificarConNotaMayorA10() {
        
        Curso frances = new Curso(15);
        
        frances.calificarAlumno(2, 11);
    }

    @Test(expected = Error.class)
    public void lanzaUnaExcepcionAlIntentarCalificarConNotaMenorA1() {
        
        Curso frances = new Curso(15);
        
        frances.calificarAlumno(2, 0);
    }
    
    @Test
    public void calcularNotaPromedioDe5AlumnosCalificadosEnUnCursoDe12() {
        
        Curso ayp1 = new Curso(12);
        
        ayp1.calificarAlumno(1, 7);
        ayp1.calificarAlumno(4, 9);
        ayp1.calificarAlumno(2, 3);
        ayp1.calificarAlumno(12, 6);
        ayp1.calificarAlumno(7, 3);
        
        Assert.assertEquals("nota promedio", 5.6, ayp1.calcularNotaPromedio(), 0.001);
    }
    
    @Test
    public void calcularNotaPromedioSinNingunAlumnoCalificado() {
        
        Curso ayp1 = new Curso(12);
        
        Assert.assertEquals("nota promedio", 0, ayp1.calcularNotaPromedio(), 0.001);
    }
    
    
    @Test
    public void calcularNotaPromedioDe6AlumnosCalificadosEnUnCursoDe6() {
        
        Curso ayp1 = new Curso(6);
        
        ayp1.calificarAlumno(1, 7);
        ayp1.calificarAlumno(2, 10);
        ayp1.calificarAlumno(3, 1);
        ayp1.calificarAlumno(4, 7);
        ayp1.calificarAlumno(5, 5);
        ayp1.calificarAlumno(6, 3);
        
        Assert.assertEquals("nota promedio", 5.5, ayp1.calcularNotaPromedio(), 0.001);
    }
    
    @Test
    public void buscarNotaMaximaCuandoTodosLosAlumnosDelCursoDe4EstanCalificados() {
        
        Curso matematica = new Curso(4);
        
        matematica.calificarAlumno(1, 5);
        matematica.calificarAlumno(4, 9);
        matematica.calificarAlumno(2, 2);
        matematica.calificarAlumno(3, 5);
        
        Assert.assertEquals("nota máxima", 9, matematica.buscarNotaMaxima());
    }
    
    @Test
    public void buscarNotaMaximaCuando3LosAlumnosDelCursoDe10EstanCalificados() {
        
        Curso matematica = new Curso(10);
        
        matematica.calificarAlumno(9, 5);
        matematica.calificarAlumno(4, 8);
        matematica.calificarAlumno(6, 2);
        
        Assert.assertEquals("nota máxima", 8, matematica.buscarNotaMaxima());
    }
    

    @Test
    public void buscarNotaMinimaCuandoTodosLosAlumnosDelCursoDe4EstanCalificados() {
        
        Curso matematica = new Curso(4);
        
        matematica.calificarAlumno(1, 5);
        matematica.calificarAlumno(4, 9);
        matematica.calificarAlumno(2, 2);
        matematica.calificarAlumno(3, 5);
        
        Assert.assertEquals("nota mínima", 2, matematica.buscarNotaMinima());
    }

    @Test
    public void contarAlumnosConNota4EnUnCursoDe10Alumnos() {
        
        Curso fisica = new Curso(10);
        
        fisica.calificarAlumno(2, 4);
        fisica.calificarAlumno(1, 3);
        fisica.calificarAlumno(9, 9);
        fisica.calificarAlumno(7, 4);
        fisica.calificarAlumno(4, 6);
        fisica.calificarAlumno(8, 4);
        
        Assert.assertEquals("cantidad de alumnos con nota 4", 3, fisica.contarAlumnosConNota(4));
    }
    
    @Test
    public void contarAlumnosConNota9EnUnCursoQueNoTiene9() {
        
        Curso quimica = new Curso(10);
        
        quimica.calificarAlumno(2, 4);
        quimica.calificarAlumno(1, 3);
        quimica.calificarAlumno(9, 8);
        quimica.calificarAlumno(7, 4);
        quimica.calificarAlumno(4, 6);
        quimica.calificarAlumno(8, 4);
        
        Assert.assertEquals("cantidad de alumnos con nota 9", 0, quimica.contarAlumnosConNota(9));
    }
}
