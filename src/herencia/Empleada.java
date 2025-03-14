package herenciapoo;

public class Empleada {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private double sueldo;
    private String turno;
    private String puesto;

    public Empleada(String dni, String nombre, String apellidos, int edad, double sueldo, String turno, String puesto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sueldo = sueldo;
        this.turno = turno;
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

    public String getPuesto() {
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
        this.edad = edad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }    
    
}
