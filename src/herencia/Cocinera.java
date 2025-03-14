
package herenciapoo;

public class Cocinera extends Empleada {

    // Propiedades
    private String partida;
    private int numeroCuchillos;

    public Cocinera(String partida, int numeroCuchillos, String dni, String nombre, String apellidos, int edad, double sueldo, String turno, String puesto) {
        super(dni, nombre, apellidos, edad, sueldo, turno, puesto);
        this.partida = partida;
        this.numeroCuchillos = numeroCuchillos;
    }

    // GETTERS
    public String getPartida() {
        return partida;
    }

    public int getNumeroCuchillos() {
        return numeroCuchillos;
    }

    // SETTERS
    public void setPartida(String partida) {
        this.partida = partida;
    }

    public void setNumeroCuchillos(int numeroCuchillos) {
        this.numeroCuchillos = numeroCuchillos;
    }

}

