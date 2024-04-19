package HospitalSanJose.exceptions;

import HospitalSanJose.model.Hospital;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class PresupuestoNegativoException extends RuntimeException {

    private static String mensaje = " El estado del hospital paso a ser en quiebra ya que se supero el presupuesto establecido y la deuda es de: ";

    public PresupuestoNegativoException() {
        super(PresupuestoNegativoException.mensaje);
    }

}
