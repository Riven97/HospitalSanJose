package HospitalSanJose.model;

import java.util.ArrayList;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class AdministradorEmpleados {

    ///////////////////////////////////////////////////////////////////////////
    //Atributo
    EmpleadoSalud empleadoSalud1 = new EmpleadoSalud();
    EmpleadoOperativo empleadoOperativo1 = new EmpleadoOperativo();
    private ArrayList<Empleado> empleados;

    /**
     * constructor
     */
    public AdministradorEmpleados() {

        this.empleados = new ArrayList<>();
        empleados.add(empleadoOperativo1);
        empleados.add(empleadoSalud1);

    }

    /**
     * Metodo de acceso
     *
     * @return
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    // Metodos de gestion de productos o CRUD de productos 
    /**
     * recibe un Empleado como parametro y lo agrega y lo agrega a el ArrayList
     *
     * @param empleados
     */
    public boolean agregarEmpleado(Empleado empleados) {

        return this.empleados.add(empleados);
    }

    /**
     * Buscamos el empleado por medio del numero de documento
     */
    public Empleado buscarEmpleado(String numeroDocumento) {
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado p = this.empleados.get(i);
            if (p.getNumeroDocumento() == numeroDocumento) {
                return p;
            }
        }
        return null;
    }

    /**
     * Buscamos el empelado por medio de empleado
     */
    public Empleado buscarEmpleado(Empleado empleados) {
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado p = this.empleados.get(i);
            if (p.equals(empleados)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Con el numero de documento encontrado se accede a el empleado y se
     * actualizan los datos
     */
    public Empleado actualizarEmpleado(String numeroDocumento, Empleado empleados) {
        Empleado empleadoExistente = this.buscarEmpleado(numeroDocumento);
        if (empleadoExistente != null) {
            empleadoExistente.setNombre(empleados.getNombre());
            empleadoExistente.setEdad(empleados.getEdad());
            empleadoExistente.setNumeroDocumento(empleados.getNumeroDocumento());
            empleadoExistente.setSalarioBase(empleados.getSalarioBase());
            //FALTA SABER SI EL EMPLEADO QUE SE VA A ACTUALIZAR ES DE SALUD U OPERARIO
            return empleadoExistente;
        } else {
            return null;
        }
    }

    /**
     * Con el numero de documeto encontrado se accede a la lista y se elimina el
     * empleado
     */
    public boolean eliminarEmpleado(String numeroDocumento) {
        Empleado empleadoExistente = this.buscarEmpleado(numeroDocumento);
        if (empleadoExistente != null) {
            return this.empleados.remove(empleadoExistente);
        } else {
            return false;
        }
    }

    /**
     * mostrar empleados
     *
     * @return
     */
    public String mostrarLstaEmpleados() {
        String inventario = "";
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado p = this.empleados.get(i);
            inventario += p.toString() + "\n";
        }
        return inventario;
    }
}
