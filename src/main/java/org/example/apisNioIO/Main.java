package org.example.apisNioIO;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ManageFiles manageFiles=new ManageFiles();
        int opt;
        do {
            System.out.println("""
                    1-> Crear Ficheros IO
                    2-> Ver rutas absolutas IO
                    3-> Crear ficheros NIO
                    4-> Ver rutas absolutas NIO
                    """);

            opt=scanner.nextInt();
            scanner.nextLine();

            switch (opt){
                case 1:
                    manageFiles.createFileIO()

                1manageFiles.createFileIO();
            }
        }while ()


    }
}
