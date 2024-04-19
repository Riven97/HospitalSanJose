package HospitalSanJose.model;

import HospitalSanJose.exceptions.DenegarProcesoNominaException;
import HospitalSanJose.exceptions.PresupuestoNegativoException;
import HospitalSanJose.model.AdministradorGerente;
import HospitalSanJose.model.AdministradorArchivos;
import HospitalSanJose.model.Hospital;
import HospitalSanJose.respuesta.ResultadoOperacion;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class UsuarioAdministrador {

    ///////////////////////////////////////////////////////////////////////////
    //Atrbibutos
    AdministradorArchivos archivador;
    AdministradorGerente administradorGerente;
    Hospital hospital;
    AdministradorArchivos administradorArchivos;
 
    /**
     * Metodo constructor
     */
    public UsuarioAdministrador() {
      
        this.administradorGerente = new AdministradorGerente();
        this.hospital = new Hospital();
        this.administradorArchivos = new AdministradorArchivos();
        archivador = new AdministradorArchivos();
        this.actualizarDatos(administradorGerente, hospital);
        archivador.leerArchivo(archivador.getArchivo());

    }

    public UsuarioAdministrador(AdministradorGerente administradorGerente, Hospital hospital) {
       
        this.administradorGerente = administradorGerente;
        this.hospital = hospital;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public AdministradorGerente getAdministradorGerente() {
        return administradorGerente;
    }

    public void setAdministradorGerente(AdministradorGerente administradorGerente) {
        this.administradorGerente = administradorGerente;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public AdministradorArchivos getAdministradorArchivos() {
        return administradorArchivos;
    }

    public void setAdministradorArchivos(AdministradorArchivos administradorArchivos) {
        this.administradorArchivos = administradorArchivos;
    }



    ///////////////////////////////////////////////////////////////////////////
    //Metodos
    /**
     * Metodo para actualizar datos del gerente
     *
     * @param nombre
     * @param numeroDocumento
     * @param edad
     * @param carrera
     */
    public void actualizarGerente(String nombre, String numeroDocumento, String edad, String carrera) {

        this.administradorGerente.actualizarGerente(nombre, numeroDocumento, edad, carrera);
        this.actualizarDatos(administradorGerente, hospital);
    }

    /**
     * Metodo para actulizar los datos en el txt
     *
     * @param adminGerente
     * @param adminHospital
     */
    private void actualizarDatos(AdministradorGerente adminGerente, Hospital adminHospital) {

        archivador.crearArchivo("F:/Descargas/POO/NuevoPOO/HospitalSanJose/HospitalSanJose", "DatosHospital.txt");
        archivador.escribirArchivoTexto(adminHospital.getNombre() + ","
                + adminHospital.getDireccion() + "," + adminHospital.getTelefono() + "," + adminHospital.getLogo()
                + "," + adminHospital.getPresupuesto() + "," + adminHospital.getMetaVentasAnual() + ","
                + adminHospital.getFechaFundacion() + "," + adminHospital.getLocalizacion().getLatitud() + ","
                + adminHospital.getLocalizacion().getLongitud() + "," + adminGerente.getGerente().getNombre()
                + "," + adminGerente.getGerente().getNumeroDocumento() + "," + adminGerente.getGerente().getEdad() + "," + adminGerente.getGerente().getCarrera());
    }
    
    public ResultadoOperacion generarNominaHospital(){

        try{
         this.hospital.generarNomina();
        }catch(DenegarProcesoNominaException |PresupuestoNegativoException e)  {
             return new ResultadoOperacion(false,this.hospital.getNominaCalculada()+"" ,e.getMessage());
        }
        return new ResultadoOperacion(true, this.hospital.getNominaCalculada()+"","");
    } 
    
    
   public void registrarPatrocinio(double valorPatrocinio) {
       this.hospital.registrarPatrocinio(valorPatrocinio);
    }

}
