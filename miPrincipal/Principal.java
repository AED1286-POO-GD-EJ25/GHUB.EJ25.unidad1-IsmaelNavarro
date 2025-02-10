package miPrincipal;

import miPrincipal.Alumno;

public class Principal {
   

    public static void main(String[] args) {

     Alumno alumno1 = new Alumno();
     Alumno alumno2 = new Alumno("Juan", 24170650, 95, "Sistemas");

     Mochila mochila1 = new Mochila();
     Mochila mochila2 = new Mochila("Azul", "Mediana", 6 );

    

     
     alumno1.cargarMateria();

     alumno2.cargarMateria();


     double prom = alumno2.obtenerPromedio();

     mochila1.abrir();
     mochila2.cerrar();

     System.out.println("El promedio = "+prom);
    }
}