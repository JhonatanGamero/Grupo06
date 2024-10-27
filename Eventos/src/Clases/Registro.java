package Clases;

public class Registro {
    private int codigoRegistro; 
    private String fechaRegistro;
    private int codigoParticipante;
    private int codigoEvento;

    public Registro() {
    }

    public Registro(int codigoRegistro, String fechaRegistro, int codigoParticipante, int codigoEvento) {
        this.codigoRegistro = codigoRegistro;
        this.fechaRegistro = fechaRegistro;
        this.codigoParticipante = codigoParticipante;
        this.codigoEvento = codigoEvento;
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

    @Override
    public String toString() {
        return "Registro{" + "codigoRegistro=" + codigoRegistro + ", fechaRegistro=" + fechaRegistro + ", codigoParticipante=" + codigoParticipante + ", codigoEvento=" + codigoEvento + '}';
    }

    public void validarRegistro() {
    }
    
    public void confirmarAsistencia() {
    }
}
