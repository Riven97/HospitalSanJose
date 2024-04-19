package HospitalSanJose.model;

import HospitalSanJose.exceptions.DenegarProcesoNominaException;
import HospitalSanJose.exceptions.PresupuestoNegativoException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class Hospital {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    private ArrayList<Medicamento> listaMedicamentos;

    Nomina nomina;

    /**
     * deuda generada por que la nomina rebaso el presupuesto
     */
    private double deuda;
    /**
     * para escribir el archivo
     */
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
    private String estadoFinanciero;

    /**
     * Localizacion del hospital (longitud - latitud)
     */
    private Localizacion localizacion;

    private double nominaCalculada;

    /**
     * Gerente del hospital
     */
    private Gerente gerente;

    // Metodo constructor
    /**
     * Inicializo cada uno de los atributos anteriores
     */
    public Hospital() {
        this.nomina = new Nomina();
        this.deuda = 0;
        this.nombre = "Hospital San Jose St. Bonaventure";
        this.direccion = "2425 Samaritan Dr, San Jose, CA 95124,\n"
                + "Estados Unidos";
        this.telefono = "+1 408-559-2011";
        this.logo = "F:\\Descargas\\POO\\NuevoPOO\\HospitalSanJose\\HospitalSanJose\\logo.png";
        this.presupuesto = 1000000;
        this.metaVentasAnual = 0;
        this.fechaFundacion = "1965";
        this.estadoFinanciero = "ACTIVO";
        this.localizacion = new Localizacion();
        this.gerente = new Gerente();

        /**
         * archivador = new AdministradorArchivos();
         * archivador.crearArchivo("F:/Descargas/POO/NuevoPOO/HospitalSanJose/HospitalSanJose",
         * "datosHospital.txt");
         * archivador.escribirArchivoTexto(this.getNombre() + "," +
         * this.getDireccion() + "," + this.getTelefono() + "," + this.getLogo()
         * + "," + this.getPresupuesto() + "," + this.getMetaVentasAnual() + ","
         * + this.getFechaFundacion() + "," + localizacion.getLatitud() + "," +
         * localizacion.getLongitud());
         */
    }

    public void actualizaDatosHospital(double deuda, String nombre, String direccion, String telefono, String logo,
            double presupuesto, double metaVentasAnual, String fechaFundacion,
            String estado, Localizacion localizacion, Gerente gerente, Nomina nomina) {
        this.deuda = deuda;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estadoFinanciero = estado;
        this.localizacion = localizacion;
        this.gerente = gerente;
        this.nomina = nomina;

    }

    //////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public ArrayList<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setListaMedicamentos(ArrayList<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public AdministradorArchivos getArchivador() {
        return archivador;
    }

    public void setArchivador(AdministradorArchivos archivador) {
        this.archivador = archivador;
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

    public String getEstado() {
        return estadoFinanciero;
    }

    public void setEstadoFinanciero(String estadoFinanciero) {
        this.estadoFinanciero = estadoFinanciero;
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

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public double getNominaCalculada() {
        return nominaCalculada;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos   
    /**
     * Metodo para controlar la exception de presupuesto negativo
     *
     * @return
     */
    public String calcularPresupuesto() {
        try {

        } catch (PresupuestoNegativoException e) {
            return e.getMessage();
        }
        return "El hospital está activo";
    }

    /**
     * Metodo para cambiar el estadoFinanciero del hospital de ser necesario
     */
    public void generarNomina() throws DenegarProcesoNominaException, PresupuestoNegativoException {

        this.nominaCalculada = 0;
        if ("EN_QUIEBRA".equals(this.estadoFinanciero)) {
            throw new DenegarProcesoNominaException();
        } else {
            nominaCalculada = this.nomina.calcularTotalSalarios();
            this.presupuesto = this.presupuesto - nominaCalculada;

            if (presupuesto <= 0) {
                this.setDeuda(presupuesto);
                this.setEstadoFinanciero("EN_QUIEBRA");
                throw new PresupuestoNegativoException(this.getDeuda());

            }
        }
    }

    /**
     * Registrar patrocina para intentar saldar deuda
     *
     * @param valorPatrocinio monto de patrocinio que le ingresa al hospital
     */
    public void registrarPatrocinio(double valorPatrocinio) {

        if (valorPatrocinio > this.deuda) {
            this.estadoFinanciero = "ACTIVO";
            this.deuda = 0;
            System.out.println("el valor del patrocinio que es: " + valorPatrocinio
                    + "por lo tanto saldo la deuda de: " + this.deuda + " y el hospital vuelve a"
                    + "estar activo ");
        } else {
            System.out.println("El valor de patrocinio ingresado es: " + valorPatrocinio
                    + " y no es suficientepara cubrir la deuda de: " + this.deuda
                    + "por lo cual el hospital sigue en quiebra");
        }

    }
}
