package HospitalSanJose.model;

import java.util.Date;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class Hospital {

    AdministradorArchivos archivador;

    /**
     * Nombre del hospital
     */
    private String nombre;

    /**
     * Direccion del hospital
     */
    private String direccion;

    /**
     * Telefono del hospital
     */
    private String telefono;

    /**
     * Logo del hospital
     */
    private String logo;

    /**
     * Presupuesto del hospital
     */
    private double presupuesto;

    /**
     * Meta de ventas anuales del hospital
     */
    private double metaVentasAnual;

    /**
     * Fecha de la fundacion del hospital
     */
    private String fechaFundacion;

    /**
     * Estado del hospital (True =activo o False = en quiebra)
     */
    private boolean estado;

    /**
     * Localizacion del hospital (longitud - latitud)
     */
    protected Localizacion localizacion;

    /**
     * Gerente del hospital
     */
    private Gerente gerente;

    // Metodo constructor
    /**
     * Inicializo cada uno de los atributos anteriores
     */
    public Hospital() {
        this.nombre = "Hospital San Jose St. Bonaventure";
        this.direccion = "2425 Samaritan Dr, San Jose, CA 95124,\n"
                + "\n"
                + "Estados Unidos";
        this.telefono = "+1 408-559-2011";
        this.logo = "F:\\Descargas\\POO\\NuevoPOO\\HospitalSanJose\\HospitalSanJose\\logo.png";
        this.presupuesto = 1000000;
        this.metaVentasAnual = 0;
        this.fechaFundacion = "1965";
        this.estado = true;
        this.localizacion = new Localizacion();
        this.gerente = new Gerente();

      /**
       *   archivador = new AdministradorArchivos();
        archivador.crearArchivo("F:/Descargas/POO/NuevoPOO/HospitalSanJose/HospitalSanJose",
                "datosHospital.txt");
        archivador.escribirArchivoTexto(this.getNombre() + ","
                + this.getDireccion() + "," + this.getTelefono() + "," + this.getLogo()
                + "," + this.getPresupuesto() + "," + this.getMetaVentasAnual() + ","
                + this.getFechaFundacion() + "," + localizacion.getLatitud() + ","
                + localizacion.getLongitud());
       */

    }

    public Hospital(String nombre, String direccion, String telefono, String logo,
            double presupuesto, double metaVentasAnual, String fechaFundacion,
            boolean estado, Localizacion localizacion, Gerente gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.localizacion = localizacion;
        this.gerente = gerente;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos    
    /**
     * Metodo para cambiar el estado del hospital de ser necesario
     */
    public void generarNomina() {
        Nomina nomina = new Nomina();
        if (nomina.presupuestoHospital() == false) {
            this.setEstado(false);
            System.out.println("Se cambio el estado a en quiebra: " + this.estado);
        } else {
            this.setEstado(true);
            System.out.println("El estado sigue siendo activo: " + this.estado);
        }
    }

}
