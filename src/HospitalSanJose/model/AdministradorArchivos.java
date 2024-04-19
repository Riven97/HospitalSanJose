package HospitalSanJose.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DOSSA0110
 * @author Riven97
 * @version 1.0.0
 * @since 2024/15/01
 */
public class AdministradorArchivos {

    File archivo;

    public void crearArchivo(String ruta, String nombreArchivo) {
        this.archivo = new File(ruta, nombreArchivo);
        try {

            if (this.archivo.createNewFile()) {
                System.out.println("archivo creado");
            } else {
                System.out.println("...");
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void escribirArchivoTexto(String texto) {
        try {
            System.out.println("voy a escribir en el archivo");
            FileWriter escritor = new FileWriter(this.archivo);
            escritor.write(texto);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error en el metodo escribirArchivo: " + e.getMessage());
        }
    }

    public void eliminarArchivo(String ruta, String archivo) {
        this.archivo = new File(ruta, archivo);
        try {

            if (this.archivo.delete()) {
                System.out.println("archivo eliminado");
            } else {
                System.out.println("Error al crear archivo");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public ArrayList<String> leerArchivo(File archivo) {

        List<String> lineasArchivo = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineasArchivo.add(linea); // Almacenar cada línea leída en la lista
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejar errores de lectura del archivo
        }

        // Ahora puedes usar lineasArchivo fuera del bloque try-catch
        // por ejemplo, imprimir todas las líneas almacenadas en la lista:
        for (String linea : lineasArchivo) {
            System.out.println(linea);
        }
        return (ArrayList<String>) lineasArchivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

}
