package HospitalSanJose.exceptions;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class EnfermedadInexistenteException extends RuntimeException {

    private static String mensaje = " El paciente no posee esta enfermedad para curarla ";

    public EnfermedadInexistenteException() {
        super(EnfermedadInexistenteException.mensaje);
    }
}
