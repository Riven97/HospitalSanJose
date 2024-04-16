package HospitalSanJose.model;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class Localizacion {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * dato para la longitud de la localizacion del hospital
     */
    private double longitud;

    /**
     * dato para la latitud de la localizacion del hospital
     */
    private double latitud;

    /**
     * Contructor para inicializar los atributos
     */
    public Localizacion() {
        this.longitud = 0;
        this.latitud = 0;
    }

    public Localizacion(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos de acceso

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////
    //Metodos
    
}
