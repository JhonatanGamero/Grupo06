package Clases;

public class Organizacion {
    private int codigoOrganizacion;
    private String proveedor;
    private String recursos;
    private int cantidad;

    public Organizacion() {
    }

    public Organizacion(int codigoOrganizacion, String proveedor, String recursos, int cantidad) {
        this.codigoOrganizacion = codigoOrganizacion;
        this.proveedor = proveedor;
        this.recursos = recursos;
        this.cantidad = cantidad;
    }

    public int getCodigoOrganizacion() {
        return codigoOrganizacion;
    }

    public void setCodigoOrganizacion(int codigoOrganizacion) {
        this.codigoOrganizacion = codigoOrganizacion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Organizacion{" + "codigoOrganizacion=" + codigoOrganizacion + ", proveedor=" + proveedor + ", recursos=" + recursos + ", cantidad=" + cantidad + '}';
    }
    
    public void asignarRecursos() {
    }
    
    public void verificarRecursos() {
    }
}
