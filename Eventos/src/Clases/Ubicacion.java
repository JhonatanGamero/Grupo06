package Clases;

public class Ubicacion {
    private String direccion; 
    private String ciudad; 
    private String pais;

    public Ubicacion() {
    }

    public Ubicacion(String direccion, String ciudad, String pais) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "direccion=" + direccion + ", ciudad=" + ciudad + ", pais=" + pais + '}';
    }
    
    public void asignarUbicacion() {
    }
    
}
