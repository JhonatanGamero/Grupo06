package Clases;

public class Agenda {
    private int codigoAgenda;
    private String nombreActividad;
    private String horaInicio;
    private String horaFin;
    private String tipoActividad;
    private String anfitrion;

    public Agenda() {
    }

    public Agenda(int codigoAgenda, String nombreActividad, String horaInicio, String horaFin, String tipoActividad, String anfitrion) {
        this.codigoAgenda = codigoAgenda;
        this.nombreActividad = nombreActividad;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoActividad = tipoActividad;
        this.anfitrion =anfitrion;
    }

    public int getCodigoAgenda() {
        return codigoAgenda;
    }

    public void setCodigoAgenda(int codigoAgenda) {
        this.codigoAgenda = codigoAgenda;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }

    @Override
    public String toString() {
        return "Agenda{" + "codigoAgenda=" + codigoAgenda + ", nombreActividad=" + nombreActividad + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", tipoActividad=" + tipoActividad + ", anfitrion=" + anfitrion + '}';
    }

    //Metodos Adicionales
    public void verificarDisponibilidad() {
    }

    public void agregarActividad() {
    }
        
    public void consultarActividades() {
    }
    
    public void modificarActividad() {
    }   
    
    public void eliminarActividad() {
    }
    
}
