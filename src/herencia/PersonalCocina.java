package herencia;

import polimorfismo.puestos.Puesto;

public class PersonalCocina extends Empleada {

    // Propiedades
    private Partidas partida;
    private int numeroCuchillos;

    // CONSTANTES
    // MINIMO CUCHILLOS
    private static final int MIN_CUCHILLOS = 3;

    // DEFINIR PARTIDAS
    static public enum Partidas {
        FRIO, PESCADOS, CARNES, ARROCES, FREIDORA, PASTELERIA
    }

    public PersonalCocina(
            Partidas partida,
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
        this.numeroCuchillos = validarNumeroCuchillos(numeroCuchillos);
    }

    // GETTERS
    public Partidas getPartida() {
        return this.partida;
    }

    public int getNumeroCuchillos() {
        return this.numeroCuchillos;
    }

    // SETTERS
    public void setPartida(Partidas partida) {
        this.partida = partida;
    }

    public void setNumeroCuchillos(int numeroCuchillos) {
        this.numeroCuchillos = validarNumeroCuchillos(numeroCuchillos);
    }

    @Override
    public String toString() {
        return "PersonalCocina{" + "partida=" + this.partida + ", numeroCuchillos=" + this.numeroCuchillos + '}';
    }

    // VALIDACIONES
    private int validarNumeroCuchillos(int numeroCuchillos) {
        return (numeroCuchillos <= 0) ? this.MIN_CUCHILLOS : numeroCuchillos;
    }
}
