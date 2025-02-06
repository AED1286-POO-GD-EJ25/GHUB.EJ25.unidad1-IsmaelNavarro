package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hola Guapos, unas tortugas oq!";
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        String saludo = principal.getGreeting();
        System.out.println(new Principal().getGreeting());
    }
}