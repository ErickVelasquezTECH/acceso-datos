package org.example.apisNioIO;


import java.io.*;

public class ManageFiles {

    private static final String[] IO_RUTS = {
            "programacion/prueba.txt"
    };

    private static final String[] NIO_RUTS = {

    };


    public void createFileIO() {
        for (String r : IO_RUTS) {
            try {
                File archive = new File(r);
                if (archive.getParentFile() != null) {
                    archive.getParentFile().mkdirs();
                }
                if (!archive.exists())
                archive.createNewFile();
            } catch (IOException e) {
                System.out.println("Error en la creacion de los archivos");
            }
        }
    }

    public void routeAbsoluteIO() {
        for (String r : IO_RUTS) {
            File archive = new File(r);
            System.out.println("- " + archive.getAbsolutePath());
        }

    }

    public void createFileNIO() {

    }

    public void routeAbsoluteNIO() {

    }

}
