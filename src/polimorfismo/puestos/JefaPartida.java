package polimorfismo.puestos;

public class JefaPartida extends Puesto {

    public JefaPartida() {
        super("Jefa de Partida");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocino como una puta maquina");
    }

}
