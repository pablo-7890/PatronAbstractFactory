package Celular;

public class CelularApple implements ICelular {
    @Override
    public String getMarca() {
        return "Apple";
    }

    @Override
    public int memoria() {
        return 64;
    }

    @Override
    public String getColor() {
        return "negro";
    }

    @Override
    public String toString() {
        return "Marca: [ ".concat(getMarca()).concat(" ] - Memoria: [ ")
                .concat(String.valueOf(memoria())).concat(" ] - Color: [ ").concat(getColor()).concat(" ]");
    }
}
