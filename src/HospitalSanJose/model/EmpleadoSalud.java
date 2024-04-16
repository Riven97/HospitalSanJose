package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class EmpleadoSalud extends Empleado {

    private String especialidad;
    private double horasTrabajadas;

    public EmpleadoSalud() {
        this.especialidad = "";
        this.horasTrabajadas = 0;
    }

    public EmpleadoSalud(String especialidad, double horasTrabajadas) {
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

}
