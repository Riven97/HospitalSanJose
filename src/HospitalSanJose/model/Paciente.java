package HospitalSanJose.model;

import java.util.ArrayList;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class Paciente {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    private ArrayList<Enfermedad> enfermedades;

    /**
     * Nombre del paciente
     */
    private String nombre;

    /**
     * Numero del documentode identidad del paciente
     */
    private String numeroDocumento;

    /**
     * Edad del paciente
     */
    private String edad;

    /**
     * Correco electronico de contacto del paciente
     */
    private String correoElectronico;

    /**
     * telefono de contacto del cliente
     */
    private String telefono;

    /**
     * Estado del paciente saludable, critico
     */
    private String estadoPaciente;

    /**
     * Metodos contructores
     *
     */
    public Paciente() {
        this.enfermedades = new ArrayList<>();
        this.nombre = "";
        this.numeroDocumento = "";
        this.edad = "";
        this.correoElectronico = "";
        this.telefono = "";
        this.estadoPaciente = "SALUDABLE";
    }

    /**
     * Metodos contructores
     *
     * @param enfermedades
     * @param nombre
     * @param numeroDocumento
     * @param edad
     * @param correoElectronico
     * @param telefono
     * @param estadoPaciente
     */
    public Paciente(ArrayList<Enfermedad> enfermedades, String nombre, String numeroDocumento, String edad, String correoElectronico, String telefono, String estadoPaciente) {
        this.enfermedades = enfermedades;
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.estadoPaciente = estadoPaciente;
    }

    //////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos
    /**
     * Metodos para administrar medicamento
     */
    public void administrarMedicamento() {

    }

    /**
     *
     * @param medicamento
     * @param enfermedadACurar
     */
    public void curarEnfermedad(Medicamento medicamento, Enfermedad enfermedadACurar) {

        if (enfermedades.contains(enfermedadACurar)) {

            this.administrarMedicamento(this, enfermedadACurar);

            enfermedades.remove(enfermedadACurar);
            System.out.println("El paciente " + nombre + " ha sido curado de la enfermedad: " + enfermedadACurar.getNombre());
        } else {
            System.out.println("El paciente " + nombre + " no tiene la enfermedad: " + enfermedadACurar.getNombre() + " y no puede ser curado.");
        }
    }

}
