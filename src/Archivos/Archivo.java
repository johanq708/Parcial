/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Archivo {
    private File a;
    
    public Archivo(){
        this.a=new File("parcial.txt");
    }
    public String imprimirelectricidad(double e){
        String elect=null;
        if((e<=1.5)&&(e>0.5)){
            elect="tormenta electrica";
        }else
        if((e<=2.5)&&(e>1.5)){
            elect="rayos";
        }else
        if((e<=3.5)&&(e>2.5)){
            elect="truenos";
        }else
        if((e<=4.5)&&(e>3.5)){
            elect="normal";
        }
        return elect;
    }
    public void promedio() throws FileNotFoundException{
        int telec=0;
        int ttemp=0;
        int tagua=0;
        int ttelec;
        Scanner scan=new Scanner(a);
        while(scan.hasNextLine()){
            String c=scan.next();
            System.out.println(c);
            int s=scan.nextInt();
            for(int i=0;i<s;i++){
              String n=scan.next();
                System.out.println("estacion: "+n);
              int l=scan.nextInt();
              for(int j=0;j<l;j++){
                String f=scan.next();
                int temp=scan.nextInt();
                int agua=scan.nextInt();
                int elec=scan.nextInt();
                  System.out.println(f+" "+temp+"c "+agua+"mm "+imprimirelectricidad(elec));
                  ttemp+=temp;
                  tagua+=agua;
                  telec+=elec;
              }
              ttelec=telec/(s*l);
              System.out.println("el promedio de "+c+" es: "+(ttemp/(s*l))+"c "+(tagua/(s*l))+"mm "+imprimirelectricidad(ttelec));
            }
        }
    }
}
