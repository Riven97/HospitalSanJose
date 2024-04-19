package HospitalSanJose.model;

import java.util.ArrayList;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class Inventario {

    private ArrayList<Medicamento> medicamentos;

    public Inventario() {
        this.medicamentos = new ArrayList<>();
    }

    /**
     * Guarda y muestra informacion en cada una de la variables
     */
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    // Metodos de gestion de medicamentos o CRUD de medicamentos 
    /**
     * recibe un medicamento como parametro y lo agrega y lo agrega a el ArrayList
     */
    public boolean agregarMedicamento(Medicamento medicamentos) {
        return this.medicamentos.add(medicamentos);
    }

    /**
     * Buscamos el medicamento por medio del medicamento
     */
    public Medicamento buscarMedicamento(Medicamento medicamentos) {
        for (int i = 0; i < this.medicamentos.size(); i++) {
            Medicamento p = this.medicamentos.get(i);
            if (p.equals(medicamentos)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Buscamos el medicamento por medio de el id del medicamento
     */
    public Medicamento buscarMedicamento (long id) {
        for (int i = 0; i < this.medicamentos.size(); i++) {
            Medicamento p = this.medicamentos.get(i);
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    private int buscarIndiceMedicamento(long id) {
        for (int i = 0; i < this.medicamentos.size(); i++) {
            Medicamento p = this.medicamentos.get(i);
            if (p.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Con el id encontrado se accede a el medicamento y se actualizan algunos
     * datos
     */
    public Medicamento actualizarMedicamento(long id, Medicamento medicamentos) {
        int index = this.buscarIndiceMedicamento(id);
        if (index >= 0) {
            return this.medicamentos.set(index, medicamentos);
        } else {
            return null;
        }
    }

    /**
     * Con el id encontrado se accede a la lista y se elimina el medicamento
     */
    public Medicamento eliminarMedicamento(long id) {
        int index = this.buscarIndiceMedicamento(id);
        if (index >= 0) {
            return this.medicamentos.remove(index);
        } else {
            return null;
        }
    }

    public String mostrarInventario() {
        String inventario = "";
        for (int i = 0; i < this.medicamentos.size(); i++) {
            Medicamento p = this.medicamentos.get(i);
            inventario += p.toString() + "\n";
        }
        return inventario;
    }

}
