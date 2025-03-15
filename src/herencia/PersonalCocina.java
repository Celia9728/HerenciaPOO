package herencia;

import herencia.puestos.Puesto;

public class PersonalCocina extends Empleada {

    // Propiedades
    private String partida;
    private int numeroCuchillos;

    public PersonalCocina(
            String partida, 
            int numeroCuchillos, String dni,
            String nombre, 
            String apellidos, 
            int edad, 
            double sueldo, 
            Turnos turno, 
            Estados estado, 
            Puesto puesto) {
        super(dni, nombre, apellidos, edad, sueldo, turno, estado, puesto);
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

    @Override
    public String toString() {
        return "PersonalCocina{" + "partida=" + partida + ", numeroCuchillos=" + numeroCuchillos + '}';
    }

}
