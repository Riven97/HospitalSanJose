/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.respuesta;

/**
 *
 * @author BmXLO
 */
public class ResultadoOperacion {

    boolean exitoso;
    
    String respuestaMensaje;
    
    String mensajeError;

    public boolean isExitoso() {
        return exitoso;
    }

    public void setExitoso(boolean exitoso) {
        this.exitoso = exitoso;
    }

    public String getRespuestaMensaje() {
        return respuestaMensaje;
    }

    public void setRespuestaMensaje(String respuestaMensaje) {
        this.respuestaMensaje = respuestaMensaje;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
    
    

    public ResultadoOperacion(boolean exitoso, String valor, String mensajeError) {
        this.exitoso = exitoso;
        this.respuestaMensaje = valor;
        this.mensajeError = mensajeError;
    }
    
    
}
