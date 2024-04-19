package HospitalSanJose.main;

import HospitalSanJose.model.AdministradorGerente;
import HospitalSanJose.model.AdministradorArchivos;
import HospitalSanJose.model.Empleado;
import HospitalSanJose.model.EmpleadOperativo;
import HospitalSanJose.model.EmpleadoSalud;
import HospitalSanJose.model.Hospital;
import HospitalSanJose.model.Nomina;
import HospitalSanJose.model.UsuarioAdministrador;
import java.util.ArrayList;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class DemoHospital {

    public static void main(String[] args) {
        // UsuarioAdministrador u1 = new UsuarioAdministrador();

       Nomina n1 = new Nomina();
        Hospital h1 = new Hospital();
       // AdministradorGerente ag = new AdministradorGerente();

        
        //double salarioTotal = n1.calcularTotalSalarios();
        //boolean estadoHospital = n1.presupuestoHospital();

       // System.out.println("total: " + salarioTotal + " \n estado hospital: " + estadoHospital);
        //System.out.println("Metodo del hospital: ");
        h1.generarNomina();
        //String pathArchivo = "F:/Descargas/POO/NuevoPOO/HospitalSanJose/HospitalSanJose";

        //Hospital hospital = new Hospital();
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
