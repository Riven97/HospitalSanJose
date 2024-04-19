package HospitalSanJose.model;

import HospitalSanJose.exceptions.PresupuestoNegativoException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class Nomina {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * Añadimos los tipos de empleados
     */
    EmpleadoSalud empleadoSalud;
    EmpleadOperativo empleadOperativo;

    /**
     * contador unico de nominas
     */
    private static int contadorNomina = 1;

    /**
     * Identificador de la nomina
     */
    private double id;

    /**
     * Fecha de ingreso nomina
     */
    private String fecha;

    /**
     * Total de la nomina
     */
    private double totalNomina;

    /**
     * Atributo para llamar la lista de empleados
     */
    private ArrayList<Empleado> empleados;

    /**
     * Contructor para inicializar los atributos
     */
    public Nomina() {
        this.id = id;
        this.fecha = fecha;
        this.totalNomina = totalNomina;
        this.empleados = empleados;
        this.empleadOperativo = new EmpleadOperativo();
        this.empleadoSalud = new EmpleadoSalud();
    }

    public Nomina(double id, String fecha, double totalNomina, ArrayList<Empleado> empleados) {
        this.id = id;
        this.fecha = fecha;
        this.totalNomina = totalNomina;
        this.empleados = empleados;
        this.empleadOperativo = new EmpleadOperativo();
        this.empleadoSalud = new EmpleadoSalud();
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotalNomina() {
        return totalNomina;
    }

    public void setTotalNomina(double totalNomina) {
        this.totalNomina = totalNomina;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos
    /**
     * Metodo para calcular todos lo salarios
     *
     * @return
     */
    public double calcularTotalSalarios() {
        double totalSalarios = this.empleadoSalud.calcularSalario() + this.empleadOperativo.calcularSalario();
        if (totalSalarios <= 0) {

        }
        System.out.println("calculo de los dos salarios de los empleados: " + totalSalarios);
        return totalSalarios;
    }

}
