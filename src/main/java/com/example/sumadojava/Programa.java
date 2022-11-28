package com.example.sumadojava;

import java.io.File;
import java.io.InputStream;

public class Programa {
    public static void main(String[] args) throws Exception{

        File ruta = new File("target/classes");

        for(int i = 4;i <= 104 ;i++) {

            ProcessBuilder pb = new ProcessBuilder("java", "com.example.sumadojava.Sumador", "1", Integer.toString(i));
            pb.directory(ruta);
            //File fi = new File("nvfich"+i+".txt");
            //File er = new File("nverro"+i+".txt");
            //pb.redirectError(er);
            //pb.redirectOutput(fi);
            Process p = pb.start();
            InputStream ka = p.getInputStream();
            int c;
            while ((c = ka.read()) !=-1){
                System.out.print((char) c);
            }
            ka.close();
            System.out.println(p.waitFor()+"");
        }
    }

}
