package HospitalSanJose.exceptions;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class DenegarProcesoNominaException extends RuntimeException {

    private static String mensaje = " Proceso de nomina denegado ya que el presupeusto fue excedido ";

    public DenegarProcesoNominaException() {
        super(DenegarProcesoNominaException.mensaje);
    }

}
