package utils;

import java.util.function.Function;

public class Validador {

    // Función Pipe: acepta un dato y una lista de funciones para validarlo
    public static <T> T pipe(T dato, Function<T, T>...funciones) {
        for (Function<T, T> funcion : funciones) {
            dato = funcion.apply(dato); // Aplicamos cada función
        }
        return dato; // Retornamos el dato final
    }
    
    
    
}
