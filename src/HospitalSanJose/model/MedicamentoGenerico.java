package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class MedicamentoGenerico extends Medicamento {

    public MedicamentoGenerico() {
        super(null, 0, "", "", 0, 0);
    }

    /**
     * Metodo constructor heredado
     *
     * @param id
     * @param nombre
     * @param descripcion
     * @param costo
     * @param precioVenta
     */
    public MedicamentoGenerico(Enfermedad enfermedadAlivia, int id, String nombre, String descripcion,
            double costo, double precioVenta) {
        super(enfermedadAlivia, id, nombre, descripcion, costo, precioVenta);
    }

    /////////////////////////////////////////////////////////////////////////
    //Metodos
}
