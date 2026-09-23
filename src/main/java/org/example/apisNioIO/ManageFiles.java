package org.example.apisNioIO;


import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ManageFiles {

    public void createFileIO(){
        File file=new File("/tmp/acceso/introduccion.txt");
        file.mkdir();
        
    }
    public void routeAbsoluteIO(){


        files.forEach(file -> System.out.println(file.getAbsoluteFile()));
    }
    public void createFileNIO(){

    }
    public void routeAbsoluteNIO(){

    }

}
