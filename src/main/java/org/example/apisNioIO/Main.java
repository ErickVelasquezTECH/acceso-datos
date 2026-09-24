package org.example.apisNioIO;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageFiles manageFiles=new ManageFiles();
        Scanner scanner=new Scanner(System.in);
        int opt;
        do {
            System.out.println("MENU");
            System.out.println("1) Crear archivos IO");
            System.out.println("2) Mostrar rutas absolutas archivos IO");
            System.out.println("3) Para salir");
            opt=scanner.nextInt();
            scanner.nextLine();
            switch (opt){
                case 1 -> manageFiles.createFileIO();
                case 2 -> manageFiles.routeAbsoluteIO();
                case 3 -> System.out.println("Hasta pronto...");
                default -> System.out.println("Opcion invalida");
            }
        }while (opt!=3);


    }
}
