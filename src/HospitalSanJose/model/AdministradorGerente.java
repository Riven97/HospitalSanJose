package HospitalSanJose.model;

import java.io.*;



/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class AdministradorGerente {
    
    File archivo;

    public void crearArchivo(String archivo) {
         this.archivo  = new File(archivo, "archivo.txt");
        try {
       
            if(this.archivo.createNewFile()){
                System.out.println("archivo creado");
            }else{
                System.out.println("Error al crear archivo");
            }
       
        } catch (IOException e) {
            System.out.println("ERROR: "+ e.getMessage());
        }
    }
    
    public void escribirArchivoTexto(){
            try{
                System.out.println("voy a escribir en el archivo");
                FileWriter escritor = new FileWriter(this.archivo);
                escritor.write("hola  mundo");
                escritor.close();
            }catch(IOException e){
                System.out.println("Error en el metodo escribirArchivo: "+ e.getMessage());
            }
    }
    
    public void eliminarArchivo(String archivo) {
         this.archivo  = new File(archivo, "archivo.txt");
        try {
       
            if(this.archivo.delete()){
                System.out.println("archivo eliminado");
            }else{
                System.out.println("Error al crear archivo");
            }
       
        } catch (Exception e) {
            System.out.println("ERROR: "+ e.getMessage());
        }
    }

}
