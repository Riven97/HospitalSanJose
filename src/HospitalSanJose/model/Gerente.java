package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class Gerente {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * Nombre del gerente
     */
    private String nombre;

    /**
     * Numero del documento de identidad
     */
    private String numeroDocumento;

    /**
     * Edad del gerente
     */
    private int edad;

    /**
     * Titulo de la carrera del gerente
     */
    private String carrera;

    /**
     * Contructor para inicializar los atributos
     */
    public Gerente() {
        this.nombre = "";
        this.numeroDocumento = "";
        this.edad = 0;
        this.carrera = "";
    }

    public Gerente(String nombre, String numeroDocumento, int edad, String carrera) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.carrera = carrera;
    }

    
    ///////////////////////////////////////////////////////////////////////////
    //Mertodos de acceso
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    
}
