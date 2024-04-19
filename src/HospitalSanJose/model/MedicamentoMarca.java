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
        super(null, 0, "", "", 0, 0);
        this.fabricante = "";
    }

    public MedicamentoMarca(String fabricante) {
        this.fabricante = fabricante;
    }

    public MedicamentoMarca(String fabricante, Enfermedad enfermedadAlivia,
            int id, String nombre, String descripcion, double costo, double precioVenta) {
        super(enfermedadAlivia, id, nombre, descripcion, costo, precioVenta);
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
