package Clases;

public class Eventos {
    private int codigoEvento;
    private String nombreEvento;
    private String fechaInicio;
    private String fechaFin;
    private char capacidad;

    public Eventos() {
    }

    public Eventos(int codigoEvento, String nombreEvento, String fechaInicio, String fechaFin, char capacidad) {
        this.codigoEvento = codigoEvento;
        this.nombreEvento = nombreEvento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.capacidad = capacidad;
    }

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public char getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(char capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Eventos{" + "codigoEvento=" + codigoEvento + ", nombreEvento=" + nombreEvento + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", capacidad=" + capacidad + '}';
    }
    
    public void crearEvento() {
    }
    
    public void editarEvento() {
    }
    
    public void cancelarEvento() {
    }
}
