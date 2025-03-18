package polimorfismo.puestos;

public class AyudanteCocina extends Puesto {

    public AyudanteCocina(String nombre) {
        super("Ayudante de cocina");
    }

    @Override
    public void cocinar() {
        System.out.println("¿Que dia es hoy?");
    }
    
    @Override
    public void responsabilidad() {
        System.out.println("Hacer lo que me digan");
    }
}
