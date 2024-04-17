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
     * Metodo constructor del atributo
     */
    public EmpleadoOperativo() {
        this.areaTrabajo = "";
    }

    /**
     * Metodos constrcutor heredado
     * @param nombre
     * @param numeroDocumento
     * @param edad
     * @param salarioBase
     * @param areaTrabajo 
     */
    public EmpleadoOperativo(String nombre, String numeroDocumento,
            int edad, double salarioBase, String areaTrabajo) {
        super(nombre, numeroDocumento, edad, salarioBase);
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
    
    /**
     * Metodo para calcular el salario
     * @return 
     */
    @Override
   public double calcularSalario() {
        // Calcula el salario sumando el 20% al salario base
        return salarioBase * 1.20;
    }
}
