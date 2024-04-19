package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class MedicamentoMarca extends Medicamento {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    private String fabricante;

    /**
     * Metodo constrcutor del atributo propio
     */
    public MedicamentoMarca() {
        this.fabricante = "";
    }

    /**
     * Metodo constrcutor heredado
     *
     * @param id
     * @param nombre
     * @param descripcion
     * @param costo
     * @param precioVenta
     * @param fabricante
     */
    public MedicamentoMarca(int id, String nombre, String descripcion,
            double costo, double precioVenta, String fabricante) {
        super(id, nombre, descripcion, costo, precioVenta);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Meotods
}
