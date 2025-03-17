package herencia;

import polimorfismo.puestos.Puesto;
import polimorfismo.puestos.JefaPartida;

public class Herencia {

    public static void main(String[] args) {

        Puesto JefaPartida = new JefaPartida();

        PersonalCocina empleada1 = new PersonalCocina(
                PersonalCocina.Partidas.FRIO,
                8,
                "12345678C",
                "Celia",
                "molina leal",
                27,
                99999.99,
                Empleada.Turnos.MANIANA,
                Empleada.Estados.ACTIVO,
                JefaPartida
        );

        // Tenemos que acceder primero a la clase puesto y luego ya al metodo cocinar.
        empleada1.getPuesto().cocinar();
        empleada1.getPuesto().responsabilidad();

    }
}
