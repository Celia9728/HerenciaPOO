package polimorfismo.puestos;

public class Cocinera extends Puesto {

    public Cocinera() {
        super("Cocinera");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocino a mi royo");
    }
@Override
    public void responsabilidad() {
        System.out.println("Hacer mis tareas diarias");
    }
}
