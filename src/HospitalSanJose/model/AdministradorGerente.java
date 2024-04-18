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

    /**
     * Atributo tipo gerente
     */
    private ArrayList<Gerente> gerentes;

    /**
     * constructor del mismo
     */
    public AdministradorGerente() {
        this.gerentes = new ArrayList<>();
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos de acceso
    public void setGerentes(ArrayList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    ///////////////////////////////////////////////////////////////////////////
    //Metodos
    /**
     * recibe un gerente como parametro y lo agrega y lo agrega
     *
     * @param gerentes
     */
    public boolean agregarGerente(Gerente gerentes) {
        return this.gerentes.add(gerentes);
    }

}
