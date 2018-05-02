
class Persona {

    String nombre;
    Integer edad;
    String codigoADN;

    public Persona() {

    }

    public Persona(String codigoADNMadre, String codigoADNPadre) {
        this.codigoADN = codigoADNMadre + codigoADNPadre;
    }

    String cualEsMiNombre() {
        return this.nombre;
    }

    Integer cualEsMiEdad() {
        return this.edad;
    }

    String cualEsMiADN() {
        return this.codigoADN;
    }

}


public class E02 {
    
    public static void main (String args[]) {
        
        Persona personaA;
        Persona personaB;
        
    }
    
}