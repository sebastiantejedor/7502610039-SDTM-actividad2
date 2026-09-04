package Ejercicio3;

public class Bicicleta extends Vehiculo {
    @Override
    public void moverse() { // misma firma exacta que el padre: sin parámetros
        System.out.println("La bicicleta avanza gracias al pedaleo.");
    }
}


/*
public class Bicicleta extends Vehiculo {
    public void Moverse() {
        System.out.println("La bicicleta avanza gracias al pedaleo.");
    }
}

public class Bicicleta extends Vehiculo {
    @Override
    public void Moverse() { // ahora SÍ da error de compilación
        System.out.println("La bicicleta avanza gracias al pedaleo.");
    }
}
 */