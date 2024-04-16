package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class MedicamentoGenerico extends Farmacia{

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * Año de actualizacion del medicamento
     */
    private int añoActualizacion;

    /**
     * Codigo del medicamento
     */
    private int codigo;

    /**
     * Constructor para inicializar los atributos
     */
    public MedicamentoGenerico() {

        this.añoActualizacion = 0;
        this.codigo = 0;

    }

    public MedicamentoGenerico(int añoActualizacion, int codigo) {

        this.añoActualizacion = añoActualizacion;
        this.codigo = codigo;

    }

    //////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public int getAñoActualizacion() {
        return añoActualizacion;
    }

    public void setAñoActualizacion(int añoActualizacion) {
        this.añoActualizacion = añoActualizacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

////////////////////////////////////////////////////////////////////////////
//Metodos
}
