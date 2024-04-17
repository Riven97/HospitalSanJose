package HospitalSanJose.model;

import java.io.*;



/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class AdministradorGerente {

    public void crearArchivo(String archivo) {

        File f1 = new File(archivo);

        PrintWriter pw;
        try {
            pw = new PrintWriter(f1);
             pw.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        }
       
       

        
    }

}
