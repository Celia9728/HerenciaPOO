package herencia;

import polimorfismo.puestos.Puesto;
import polimorfismo.puestos.JefaCocina;
import polimorfismo.puestos.JefaPartida;
import polimorfismo.puestos.Cocinera;
import polimorfismo.puestos.AyudanteCocina;

public class Herencia {

    public static void main(String[] args) {

        Puesto jefaCocina = new JefaCocina();
        Puesto ayudanteCocina = new AyudanteCocina();
        Puesto jefaPartida = new JefaPartida();
        Puesto cocinera = new Cocinera();
        

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
                ayudanteCocina
        );

        // Tenemos que acceder primero a la clase puesto y luego ya al metodo cocinar.
        empleada1.getPuesto().cocinar();
        empleada1.getPuesto().responsabilidad();

    }
}
