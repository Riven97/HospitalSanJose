    package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public abstract class Empleado {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * Nombre del empleado
     */
    private String nombre;

    /**
     * Numero de identificacion del empleado
     */
    private String numeroDocumento;

    /**
     * Edad del empleado
     */
    private int edad;

    /**
     * Salario base del empleado
     */
    protected double salarioBase;

    /**
     * Metodo construtor para inicializar los atributos
     */
    public Empleado() {
        this.nombre = "";
        this.numeroDocumento = "";
        this.edad = 0;
        this.salarioBase = 500000;
    }

    public Empleado(String nombre, String numeroDocumento, int edad, double salarioBase) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //////////////////////////////////////////////////////////////////////////
    //Metodo
    
       public abstract double calcularSalario();
       
    
}
