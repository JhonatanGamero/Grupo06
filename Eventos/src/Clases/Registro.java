package Clases;

public class Registro {
    private int codigoRegistro; 
    private String fechaRegistro;
    private int codigoParticipante;
    private int codigoEvento;
    private String estado;

    public Registro() {
    }

    public Registro(int codigoRegistro, String fechaRegistro, int codigoParticipante, int codigoEvento, String estado) {
        this.codigoRegistro = codigoRegistro;
        this.fechaRegistro = fechaRegistro;
        this.codigoParticipante = codigoParticipante;
        this.codigoEvento = codigoEvento;
        this.estado = estado;
    }

    public int getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(int codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCodigoParticipante() {
        return codigoParticipante;
    }

    public void setCodigoParticipante(int codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
    }

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Registro{" + "codigoRegistro=" + codigoRegistro + ", fechaRegistro=" + fechaRegistro + ", codigoParticipante=" + codigoParticipante + ", codigoEvento=" + codigoEvento + ", estado=" + estado + '}';
    }
    
    
    public void validarRegistro() {
    }
    
    public void confirmarAsistencia() {
    }
    
}
