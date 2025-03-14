package herenciapoo;

public class Camarera extends Empleada {

    int numeroMesas;
    String[] idiomas;
    String seccionRestaurante;

    public Camarera(int numeroMesas, String[] idiomas, String seccionRestaurante, String dni, String nombre, String apellidos, int edad, double sueldo, String turno, String puesto) {
        super(dni, nombre, apellidos, edad, sueldo, turno, puesto);
        this.numeroMesas = numeroMesas;
        this.idiomas = idiomas;
        this.seccionRestaurante = seccionRestaurante;
    }

    // GETTERS
    public int getNumeroMesas() {
        return numeroMesas;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public String getSeccionRestaurante() {
        return seccionRestaurante;
    }

    //SETTERS
    public void setNumeroMesas(int numeroMesas) {
        this.numeroMesas = numeroMesas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public void setSeccionRestaurante(String seccionRestaurante) {
        this.seccionRestaurante = seccionRestaurante;
    }

}
