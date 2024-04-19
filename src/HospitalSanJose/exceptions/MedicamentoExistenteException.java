package HospitalSanJose.exceptions;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class MedicamentoExistenteException extends RuntimeException {

    private static String mensaje = " El medicamente recetado, ya se encuentra en la lista ";

    public MedicamentoExistenteException() {
        super(MedicamentoExistenteException.mensaje);
    }
}
