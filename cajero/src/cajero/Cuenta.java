package cajero;

public class Cuenta {

    private String ubicacion;
    private Double saldo;

    // Constructor
    public Cuenta(String ubicacion, Double saldo) {
        this.ubicacion = ubicacion;
        this.saldo = saldo;
    }


    // Métodos getter y setter para ubicación
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Métodos getter y setter para saldo
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
