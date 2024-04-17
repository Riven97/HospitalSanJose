package HospitalSanJose.main;

import HospitalSanJose.model.AdministradorGerente;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class DemoHospital {

    public static void main(String[] args) {

        String pathArchivo = "F:/Descargas/POO/NuevoPOO/HospitalSanJose/HospitalSanJose";

        AdministradorGerente ag = new AdministradorGerente();
        ag.eliminarArchivo(pathArchivo);
        ag.crearArchivo(pathArchivo);
        ag.escribirArchivoTexto();

    }

}
