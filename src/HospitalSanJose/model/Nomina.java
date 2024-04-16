package HospitalSanJose.model;

import java.util.Date;

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
     * Contructor para inicializar los atributos
     */
    public Nomina() {
        this.id = 0;
        this.fecha = new Date();
        this.totalNomina = 0;
    }

    public Nomina(double id, Date fecha, double totalNomina) {
        this.id = id;
        this.fecha = fecha;
        this.totalNomina = totalNomina;
    }

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

    
    
}
