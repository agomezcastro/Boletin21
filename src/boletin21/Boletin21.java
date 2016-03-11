package boletin21;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Boletin21 {

    
    public static void main(String[] args){
        EscribirBoletin menu= new EscribirBoletin();
        int opcion;
        do{
        opcion= Integer.parseInt(JOptionPane.showInputDialog("1: Añadir \n2: Ordenar \n3: Imprimir archivo \n4: Salir"));
        switch(opcion){
            case 1 : menu.escribir();
                break;
            
            case 2 : menu.ordenar();
                break;
            
            case 3 : menu.escribirPalabras();
                break;
        }      
        } while(opcion<4);
     }
            
}
