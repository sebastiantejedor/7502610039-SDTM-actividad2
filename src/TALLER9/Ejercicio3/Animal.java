package TALLER9.Ejercicio3;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }
}

class Pez extends Animal {
    public Pez(String especie) {
        super(especie);
    }

    public void mostrarEspecie() {
        System.out.println(super.especie);
    }

    public void metodoNoEstatico() {
        super.toString();
    }
}


/*

codigo errado

public class Animal {
    private String especie; // privado a propósito

    public Animal(String especie) {
        this.especie = especie;
    }
}

class Pez extends Animal {
    public Pez(String especie) {
        super(especie);
    }

    public void mostrarEspecie() {
        System.out.println(super.especie); ERROR: especie has private access in Animal
    }

    public static void metodoEstatico() {
        super.toString(); ERROR: non-static variable super cannot be referenced from a static context
    }
}

 */