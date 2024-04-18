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

    /**
     * Metodo constrcutor de los atributos propios
     */
    public EmpleadoSalud() {
        this.especialidad = "";
        this.horasTrabajadas = 3;
    }

    /**
     * Metodo constrcutor heredado
     *
     * @param especialidad
     * @param horasTrabajadas
     * @param nombre
     * @param numeroDocumento
     * @param edad
     * @param salarioBase
     */
    public EmpleadoSalud(String especialidad, double horasTrabajadas,
            String nombre, String numeroDocumento, int edad, double salarioBase) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

    ///////////////////////////////////////////////////////////////////////////
    //metodos
    /**
     * Metodo para calcular salario
     *
     * @return
     */
    @Override
    public double calcularSalario() {
        // Calcula el 1.2% del salario base
        double porcentajeSalarioBase = salarioBase * 0.012;
        // Calcula el salario multiplicando el 1.2% del salario base por el número de horas trabajadas
        double salarioPorHoras = porcentajeSalarioBase * horasTrabajadas;
        // Retorna el salario total sumando el salario por horas al salario base
        double totalSalarioSalud = salarioBase + salarioPorHoras;
        return totalSalarioSalud;
    }

}
