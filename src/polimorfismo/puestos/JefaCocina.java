package polimorfismo.puestos;

public class JefaCocina extends Puesto {

    public JefaCocina(String nombre) {
        super("Jefa de cocina");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocino como un pro de pros");
    }

    @Override
    public void responsabilidad() {
        System.out.println("Organizar la cocina entera y hacer pedidos");
    }

}
