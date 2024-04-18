package HospitalSanJose.model;

import java.io.*;
import java.util.ArrayList;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class AdministradorGerente {

    AdministradorArchivos archivador;

    /**
     * Atributo tipo gerente
     */
    private Gerente gerente;

    /**
     * constructor del mismo
     */
    public AdministradorGerente() {
        this.gerente = new Gerente();
        archivador = new AdministradorArchivos();
        archivador.crearArchivo("F:/Descargas/POO/NuevoPOO/HospitalSanJose/HospitalSanJose", "datosGerente.txt");
        archivador.escribirArchivoTexto(this.gerente.getNombre()
                + "," + this.gerente.getNumeroDocumento() + "," + this.gerente.getEdad() + "," + this.gerente.getCarrera());
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos
    /**
     * recibe un gerente como parametro y lo agrega
     *
     * @param gerente
     */
    public void agregarGerente(Gerente gerente) {

        this.gerente = gerente;
    }

    public void actualizarGerente(String nombre, String numeroDocumento, String edad, String carrera) {

        gerente.setNombre(nombre);
        gerente.setNumeroDocumento(numeroDocumento);
        gerente.setEdad(edad);
        gerente.setCarrera(carrera);
        String infoGerente = gerente.getNombre() + "," + gerente.getNumeroDocumento()
                + "," + gerente.getEdad() + "," + gerente.getCarrera();
        archivador.escribirArchivoTexto(infoGerente);

        System.out.println("se actualizaron los datos");

    }

    public void eliminarGerente() {
        if (gerente != null) {
            gerente = null;
            System.out.println(" Gerente eliminado ");
        } else {
            System.out.println("No se pudo eliminar, no hay gerente para eliminar");
        }

    }
}
