package Clases;

public class Notificaciones {
    private int codigoNotificacion;
    private String mensaje;
    private String fechaEnvio;

    public Notificaciones() {
    }

    public Notificaciones(int codigoNotificacion, String mensaje, String fechaEnvio) {
        this.codigoNotificacion = codigoNotificacion;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
    }

    public int getCodigoNotificacion() {
        return codigoNotificacion;
    }

    public void setCodigoNotificacion(int codigoNotificacion) {
        this.codigoNotificacion = codigoNotificacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public String toString() {
        return "Notificaciones{" + "codigoNotificacion=" + codigoNotificacion + ", mensaje=" + mensaje + ", fechaEnvio=" + fechaEnvio + '}';
    }
    
    public void enviarNotificacion() {
    }
    
    public void programarNotificacion() {
    }
}
