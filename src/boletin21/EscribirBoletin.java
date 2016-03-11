package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class EscribirBoletin {
    ArrayList <String> listaPal = new ArrayList();
    
    public void escribir(){
     String palabra = JOptionPane.showInputDialog("Escribir una palabra");
     listaPal.add(palabra);
    }
    
    
    public void escribirPalabras(){
        String fichero = JOptionPane.showInputDialog("Escribir el nombre del fichero");
        File f = new File(fichero);
        PrintWriter escribir = null;
        try{
            escribir = new PrintWriter(f);
            for (int i=0; i<3; i++)
                escribir.println(i + " " + listaPal.get(i));
        } catch (FileNotFoundException ex){
            System.out.println("erro na escritura"+ ex.getMessage());
        }
        finally{
            escribir.close();
        }
        
    }
    
    public void ordenar(){
        Collections.sort(listaPal);
    }
    
}
