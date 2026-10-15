package org.example.apisNioIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesExamples {

    public static void main(String[] args) {
        /*
        Path ruta=Path.of("datos/mensajes.txt");
        try {
            String contenido= Files.readString(ruta, StandardCharsets.UTF_8);
            System.out.println("=== Contenido ===");
            System.out.println(contenido);
        }catch (IOException e){
            System.out.println("Error al leer: "+e.getMessage());
        }*/
        Path ruta=Path.of("datos/mensajes.txt");
        try {
            List<String> lineas=Files.readAllLines(ruta, StandardCharsets.UTF_8);
            System.out.println("Total lineas: "+ lineas.size());
            for (int i = 0; i < lineas.size() ; i++) {
                System.out.println("Linea "+ (i+1)+ ": "+lineas.get(i));
            }
        }catch (IOException e){
            System.err.println("Error al leer lista: "+e.getMessage());
        }
    }
}
