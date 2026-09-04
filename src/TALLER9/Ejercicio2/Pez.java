package TALLER9.Ejercicio2;

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // invoca el constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
