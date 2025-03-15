package herencia;

import herencia.puestos.Puesto;

public abstract class Empleada {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private double sueldo;
    private String turno;
    private String estado;
    protected Puesto puesto;

    private enum Estados {
        ACTIVO, VACACIONES, BAJA, INACTIVO
    }

    public Empleada(String dni, String nombre, String apellidos, int edad, double sueldo, String turno, String estado, Puesto puesto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = verificarEdad(edad);
        this.sueldo = sueldo;
        this.turno = turno;
        this.estado = estado;
        this.puesto = puesto;
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

    public String getTurno() {
        return turno;
    }

    public String getEstado() {
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
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = verificarEdad(edad);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Metodos de validación
    private int verificarEdad(int edad) {
        if (edad < 18) {
            this.edad = 18;
        } else if (edad > 67) {
            this.edad = 67;
        } else {
            this.edad = edad;
        }

        return this.edad;
    }

}
