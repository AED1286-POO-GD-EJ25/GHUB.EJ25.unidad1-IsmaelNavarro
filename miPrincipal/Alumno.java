package miPrincipal;
public class Alumno {

    String nombre;
    int num_control;
    double promedio;
    String carrera;

    public Alumno(){
        

    }

    public Alumno(String nombre, int num_control, double promedio, String carrera){
        this.nombre = nombre;
        this.num_control = num_control;
        this.promedio = promedio;
        this.carrera = carrera;

    }
    public void cargarMateria(){
        System.out.println("Estoy cargando materias ");
    }

    public boolean modificarStatus(){
        return true;
    }
    
    public void revisarHistorial(){
        System.out.println("Estoy revisando mi historial ");
    }

    public double obtenerPromedio(){
        return this.promedio;
    }

}