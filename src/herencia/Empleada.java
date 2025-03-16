package herencia;

import polimorfismo.puestos.Puesto;

public abstract class Empleada {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private double sueldo;
    private Turnos turno;
    private Estados estado;
    protected Puesto puesto;

    // CONSTANTES
    // EDAD
    private static final int MIN_EDAD = 18;
    private static final int MAX_EDAD = 67;

    // DINERO
    private static final double MIN_SALARIO = 250.24;

    // ESTADO
    static public enum Estados {
        ACTIVO, VACACIONES, BAJA, INACTIVO
    }

    // TURNO
    static public enum Turnos {
        MANIANA, TARDE, PARTIDO, ROTATIVO
    }

    public Empleada(String dni, String nombre, String apellidos, int edad, double sueldo, Turnos turno,
            Estados estado, Puesto puesto) {
        this.dni = dni; // INVESTIGAR REGEX
        this.nombre = arreglarCadena(validarNombreApellido(nombre)); // INVESTIGAR PIPE
        this.apellidos = arreglarCadena(validarNombreApellido(apellidos));
        this.edad = validarEdad(edad);
        this.sueldo = validarSueldo(sueldo);
        this.turno = turno;
        this.estado = estado;
        this.puesto = puesto;
    }

    // GETTERS
    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public Turnos getTurno() {
        return this.turno;
    }

    public Estados getEstado() {
        return this.estado;
    }

    public Puesto getPuesto() {
        return this.puesto;
    }

    // SETTERS
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = arreglarCadena(validarNombreApellido(nombre));
    }

    public void setApellidos(String apellidos) {
        this.apellidos = arreglarCadena(validarNombreApellido(apellidos));
    }

    public void setEdad(int edad) {
        this.edad = validarEdad(edad);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = validarSueldo(sueldo);
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    // Metodos de validación
    private String validarNombreApellido(String cadena) {
        return (!cadena.isEmpty()) ? cadena.trim() : "RELLENAR";
    }

    private int validarEdad(int edad) {
        if (edad < Empleada.MIN_EDAD) {
            edad = Empleada.MIN_EDAD;
        } else if (edad > Empleada.MAX_EDAD) {
            edad = Empleada.MAX_EDAD;
        }
        return edad;
    }

    private double validarSueldo(double sueldo) {
        return (sueldo <= 0) ? Empleada.MIN_SALARIO : sueldo;
    }

    // ARREGLOS
    private String arreglarCadena(String cadena) {
        String[] partes = cadena.split(" ");
        String resultado = "";

        for (String parte : partes) {
            parte = parte.substring(0, 1).toUpperCase() + parte.substring(1).toLowerCase();
            resultado = resultado + parte + " ";
        }

        return resultado;
    }

}
