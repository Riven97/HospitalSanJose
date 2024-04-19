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

    EmpleadoSalud empleadoSalud;
    EmpleadOperativo empleadOperativo;
    ///////////////////////////////////////////////////////////////////////////
    //Atributos
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
    public double calcularTotalSalarios() throws PresupuestoNegativoException {
        double totalSalarios = this.empleadoSalud.calcularSalario() + this.empleadOperativo.calcularSalario();
        if (totalSalarios <= 0) {
            throw new PresupuestoNegativoException();
        }
        System.out.println("calculo de los dos salarios de los empleados: " + totalSalarios);
        return totalSalarios;
    }

    public boolean presupuestoHospital() {
        Hospital hospital = new Hospital();
        double presupuesto = hospital.getPresupuesto() - calcularTotalSalarios();
        if (presupuesto <= 0) {
            System.out.println("estado del hospitlan es: false ");
            return false;
        } else {
            System.out.println("estado del hospitlan es: true ");
            
            return true;
        }
    }

}
