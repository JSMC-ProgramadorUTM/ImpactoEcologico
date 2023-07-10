package impactoecologico;

public class Bicicleta {

    private String marca;
    private String tipo;
    private double kmRecorridos;
    private final double emisionC02 = 0.006;//CO2 emitido (kg) por una bicicleta electrica

    public Bicicleta(String marca, String tipo, double kmRecorridos) {
        this.marca = marca;
        this.tipo = tipo;
        this.kmRecorridos = kmRecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "marca=" + marca + ", tipo=" + tipo + ", kmRecorridos=" + kmRecorridos + '}';
    }

}
