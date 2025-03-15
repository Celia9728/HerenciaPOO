package herencia;

import herencia.puestos.Puesto;

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
    private static final int MAX_EDAD = 65;

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
        this.dni = dni;
        this.nombre = validarNombreApellido(nombre);
        this.apellidos = validarNombreApellido(apellidos);
        this.edad = validarEdad(edad);
        this.sueldo = validarSueldo(sueldo);
        this.turno = turno;
        this.estado = estado;
        this.puesto = puesto;
    }

// Separar la cadena cada vez que encuentre un espacio, y ahi que recorrer la cadena en un bucle. y poner la primera en mayuscula y luego unir la cadena.
    private String arreglarCadena() {
        return "";
    }

    // GETTERS
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Turnos getTurno() {
        return turno;
    }

    public Estados getEstado() {
        return estado;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    // SETTERS
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = validarNombreApellido(nombre);
    }

    public void setApellidos(String apellidos) {
        this.apellidos = validarNombreApellido(apellidos);
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
        if (edad < 18) {
            this.edad = Empleada.MIN_EDAD;
        } else if (edad > 67) {
            this.edad = Empleada.MAX_EDAD;
        } else {
            this.edad = edad;
        }
        return this.edad;
    }

    private double validarSueldo(double sueldo) {
        return (sueldo <= 0) ? Empleada.MIN_SALARIO : sueldo;
    }

}
