package HospitalSanJose.main;

import HospitalSanJose.model.AdministradorGerente;
import HospitalSanJose.model.AdministradorArchivos;

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
        
        //ag.actualizarGerente("1","2","2","2");
        
        /**
         * ag.eliminarArchivo(pathArchivo); ag.crearArchivo(pathArchivo,
         * "administradorGerenteDatos.txt"); ag.escribirArchivoTexto("N,123,");
         * String[] infoArchivo = {"Sanjose,VillaCafe,5555", "gerente,13,asd"};
         *
         * for (String info : infoArchivo) {
         * System.out.println("informacionArreglo: " + info); } String
         * informacionHospital = infoArchivo[0]; System.out.println("info
         * seleccionada: " + informacionHospital);
         *
         * String[] infoSeparada = informacionHospital.split(",");
         *
         * for (String separada : infoSeparada) {
         * System.out.println("informacionArreglo: " + separada); }
         * System.out.println("nombre " + infoSeparada[1]);
         */

    }

}
