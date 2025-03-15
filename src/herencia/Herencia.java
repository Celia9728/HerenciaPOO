package herencia;

import herencia.puestos.Puesto;
import herencia.puestos.JefaPartida;

public class Herencia {

    public static void main(String[] args) {

        Puesto JefaPartida = new JefaPartida();

        PersonalCocina empleada1 = new PersonalCocina(
                "frio",
                8,
                "12345678N",
                "Celia",
                "Molina Leal",
                27,
                99999.99,
                Empleada.Turnos.MANIANA,
                Empleada.Estados.ACTIVO,
                JefaPartida
        );

        // Tenemos que acceder primero a la clase puesto y luego ya al metodo cocinar.
        empleada1.getPuesto().cocinar();
    }
}
