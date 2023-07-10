package impactoecologico;

public class Auto {

    private String marca;//Marca del auto
    private String modelo;//Modelo del auto
    private int anio;//Año de fabricacion del auto
    private String tipoCombustible;//Tipo de combustible del auto
    private double kmRecorridos;//Kilometros que el auto ha recorrido
    private final double emisionC02Diesel = 0.184;//Valor promedio(kg) de emision de CO2 por km de un auto a dieael
    private final double emisionC02Gasolina = 0.216;//Valor promedio(kg) de emision de CO2 por km de un auto a gasolina

    public Auto(String marca, String modelo, int anio, String tipoCombustible, double kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipoCombustible = tipoCombustible;
        this.kmRecorridos = kmRecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tipoCombustible=" + tipoCombustible + ", kmRecorridos=" + kmRecorridos + '}';
    }
}
