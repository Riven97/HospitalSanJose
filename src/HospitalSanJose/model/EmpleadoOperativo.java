package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class EmpleadoOperativo extends Empleado {

    ///////////////////////////////////////////////////////////////////////////
    //Atributo
    /**
     * nombre del area de trabajo
     */
    private String areaTrabajo;

    /**
     * Constructor para inicializar atributo
     */
    public EmpleadoOperativo() {
        this.areaTrabajo = "";

    }

    public EmpleadoOperativo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;

    }

    //////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

}
