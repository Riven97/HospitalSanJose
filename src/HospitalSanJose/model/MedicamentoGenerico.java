package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class MedicamentoGenerico extends Medicamento {

    /**
     * Metodo constructor heredado
     * @param id
     * @param nombre
     * @param descripcion
     * @param costo
     * @param precioVenta 
     */
    public MedicamentoGenerico(int id, String nombre, String descripcion,
            double costo, double precioVenta) {
        super(id, nombre, descripcion, costo, precioVenta);
    }

    /////////////////////////////////////////////////////////////////////////
    //Metodos
}
