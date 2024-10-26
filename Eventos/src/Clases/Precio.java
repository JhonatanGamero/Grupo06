package Clases;

public class Precio {
    private String tipo;
    private float monto;
    private String fechaPago;

    public Precio() {
    }

    public Precio(String tipo, float monto, String fechaPago) {
        this.tipo = tipo;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Precio{" + "tipo=" + tipo + ", monto=" + monto + ", fechaPago=" + fechaPago + '}';
    }
    
    public void realizarPago() {
    }
    
    public void reembolsarPago() {
    }
    
}
