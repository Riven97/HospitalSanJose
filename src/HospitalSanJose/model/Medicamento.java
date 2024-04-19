package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public abstract class Medicamento {

    protected Enfermedad enfermedadAlivia;
    /**
     * Id del medicamento
     */
    private int id;

    /**
     * Nomrbe del medicamento
     */
    protected String nombre;

    /**
     * descripcion del medicamento
     */
    private String descripcion;

    /**
     * costo neto del medicamento
     */
    private double costo;

    /*
    *Precio de venta al publico del medicamento
     */
    private double precioVenta;

    /**
     * Metodo constructor para inicializar atributos
     */
    public Medicamento() {
        this.enfermedadAlivia = new Enfermedad();
        this.id = 0;
        this.nombre = "";
        this.descripcion = "";
        this.costo = 0;
        this.precioVenta = 0;
    }

    public Medicamento(Enfermedad enfermedadAlivia, int id, String nombre, String descripcion, double costo, double precioVenta) {
        this.enfermedadAlivia = enfermedadAlivia;
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = precioVenta;
    }
    ///////////////////////////////////////////////////////////////////////////
    //Metodos de acceso

    public Enfermedad getEnfermedadAlivia() {
        return enfermedadAlivia;
    }

    public void setEnfermedadAlivia(Enfermedad enfermedadAlivia) {
        this.enfermedadAlivia = enfermedadAlivia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /////////////////////////////////////////////////////////////////////////////
    //Metodos
}
