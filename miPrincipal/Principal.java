package miPrincipal;

import miTest.Alumno;

public class Principal {
   

    public static void main(String[] args) {

     Alumno alumno1 = new Alumno();
     Alumno alumno2 = new Alumno("Juan", 24170650, 95, "Sistemas");


     
     alumno1.cargarMaterias();

     alumno2.cargarMaterias();

     double prom = alumno2.obtenerPromedio(95);

     System.out.println("El promedio = "+prom);
    }
}