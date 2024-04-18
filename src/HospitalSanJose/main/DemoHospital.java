package HospitalSanJose.main;

import HospitalSanJose.model.AdministradorGerente;
import HospitalSanJose.model.AdministradorArchivos;
import HospitalSanJose.model.Empleado;
import HospitalSanJose.model.EmpleadoOperativo;
import HospitalSanJose.model.EmpleadoSalud;
import HospitalSanJose.model.Hospital;
import HospitalSanJose.model.Nomina;
import java.util.ArrayList;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class DemoHospital {

    public static void main(String[] args) {

        EmpleadoSalud salario = new EmpleadoSalud();
        EmpleadoOperativo salario2 = new EmpleadoOperativo();
        Nomina n1 = new Nomina();
        double salarioTotal = n1.calcularTotalSalarios(salario, salario2);

        System.out.println("total: " + salarioTotal);
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
