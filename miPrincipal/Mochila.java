package miPrincipal;
public class Mochila{
    //atributos
    String color;
    String tamaño;
    int bolsas;


    //constructores

    public Mochila(){

    }

    public Mochila (String color, String tamaño, int bolsas){
        
        this.color = color;
        this.tamaño = tamaño;
        this.bolsas = bolsas;
    }

    public void abrir(){
        System.out.println("Estoy abriendo la mochila");
    }

    public boolean meterCosas(){
        return true;
    }
    public void cerrar(){
        System.out.println("Estoy cerrando la mochila");
    }
    public void lanzar(){
        System.out.println("Estoy lanzando la mochila");
    }
}