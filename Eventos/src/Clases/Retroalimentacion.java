package Clases;

public class Retroalimentacion {
    private int codigoRetroalimentacion;
    private int calificacion;
    private String comentario;
    private String fecha;

    public Retroalimentacion() {
    }

    public Retroalimentacion(int codigoRetroalimentacion, int calificacion, String comentario, String fecha) {
        this.codigoRetroalimentacion = codigoRetroalimentacion;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public int getCodigoRetroalimentacion() {
        return codigoRetroalimentacion;
    }

    public void setCodigoRetroalimentacion(int codigoRetroalimentacion) {
        this.codigoRetroalimentacion = codigoRetroalimentacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Retroalimentacion{" + "codigoRetroalimentacion=" + codigoRetroalimentacion + ", calificacion=" + calificacion + ", comentario=" + comentario + ", fecha=" + fecha + '}';
    }
    
    public void enviarRetroalimentacion() {
    }
    
    public void consultarRetroalimentacion() {
    }
    
}
