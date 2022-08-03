package Celular;

public class CelularSamsung implements ICelular {
    @Override
    public String getMarca() {
        return "Samsung";
    }

    @Override
    public int memoria() {
        return 128;
    }

    @Override
    public String getColor() {
        return "Azul";
    }

    @Override
    public String toString() {
        return "Marca: [ ".concat(getMarca()).concat(" ] - Memoria: [ ")
                .concat(String.valueOf(memoria())).concat(" ] - Color: [ ").concat(getColor()).concat(" ]");
    }
}

