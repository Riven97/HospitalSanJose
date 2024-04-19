package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class Enfermedad {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * Nombre de la enfermedad
     */
    private String nombre;

    /**
     * Descripcion de la enfermedad
     */
    private String descripcion;

    /**
     * Receta para la cura de la enferdad
     */
    private String receta;

    /**
     * Metodos constructorres
     */
    public Enfermedad() {
        this.nombre = "";
        this.descripcion = "";
        this.receta = "";
    }

    public Enfermedad(String nombre, String descripcion, String receta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.receta = receta;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos
 

}
