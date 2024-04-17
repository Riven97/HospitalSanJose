package HospitalSanJose.model;

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
     * Identificador de la nomina
     */
    private double id;

    /**
     * Fecha de ingreso nomina
     */
    private Date fecha;

    /**
     * Total de la nomina
     */
    private double totalNomina;

    /**
     * Atributo para llamar la lista de empleados
     */
    private List<Empleado> empleados;

    /**
     * Contructor para inicializar los atributos
     */
    public Nomina(double id, Date fecha, double totalNomina, List<Empleado> empleados) {
        this.id = id;
        this.fecha = fecha;
        this.totalNomina = totalNomina;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotalNomina() {
        return totalNomina;
    }

    public void setTotalNomina(double totalNomina) {
        this.totalNomina = totalNomina;
    }

    public void setEmpleados(List<Empleado> empleados) {
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
        double totalSalarios = 0;
        for (Empleado empleado : empleados) {
            totalSalarios += empleado.calcularSalario();
        }
        return totalSalarios;
    }
}
