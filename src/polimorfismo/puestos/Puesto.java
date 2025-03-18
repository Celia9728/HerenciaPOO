package polimorfismo.puestos;

public abstract class Puesto {
    protected String nombre;

    public Puesto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract void cocinar();
    
    public abstract void responsabilidad();
}