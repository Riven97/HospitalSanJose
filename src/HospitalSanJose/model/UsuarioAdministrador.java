package HospitalSanJose.model;

import HospitalSanJose.model.AdministradorGerente;
import HospitalSanJose.model.AdministradorArchivos;
import HospitalSanJose.model.Hospital;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class Usuario {

    ///////////////////////////////////////////////////////////////////////////
    //Atrbibutos
    Gerente gerente;
    AdministradorArchivos archivador;
    AdministradorGerente administradorGerente;
    Hospital hospital;
    AdministradorArchivos administradorArchivos;

    /**
     * Metodo constructor
     */
    public Usuario() {
        this.gerente = new Gerente();
        this.administradorGerente = new AdministradorGerente();
        this.hospital = new Hospital();
        this.administradorArchivos = new AdministradorArchivos();
        archivador = new AdministradorArchivos();
        archivador.crearArchivo("F:/Descargas/POO/NuevoPOO/HospitalSanJose/HospitalSanJose", "DatosHospital.txt");
        archivador.escribirArchivoTexto(this.hospital.getNombre() + ","
                + this.hospital.getDireccion() + "," + this.hospital.getTelefono() + "," + this.hospital.getLogo()
                + "," + this.hospital.getPresupuesto() + "," + this.hospital.getMetaVentasAnual() + ","
                + this.hospital.getFechaFundacion() + "," + hospital.localizacion.getLatitud() + ","
                + hospital.localizacion.getLongitud() + "," + this.gerente.getNombre()
                + "," + this.gerente.getNumeroDocumento() + "," + this.gerente.getEdad() + "," + this.gerente.getCarrera());

    }

    public Usuario(Gerente gerente, AdministradorArchivos archivador, AdministradorGerente administradorGerente, Hospital hospital, AdministradorArchivos administradorArchivos) {
        this.gerente = gerente;
        this.archivador = archivador;
        this.administradorGerente = administradorGerente;
        this.hospital = hospital;
        this.administradorArchivos = administradorArchivos;
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

}
