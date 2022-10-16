/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public final class herramienta {
    
    public static void rellenar_array (ArrayList array, String fichero){
        try{
            FileInputStream file= new FileInputStream (fichero);
            ObjectInputStream objetos = new ObjectInputStream (file);
            boolean finalFichero=false;

            while(!finalFichero){
                try{
                    array.add(objetos.readObject());
                }catch(EOFException e){
                    finalFichero=true;
                }catch(Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            objetos.close();
        }catch(IOException f){
            JOptionPane.showMessageDialog(null, f.getMessage());
        }
    }
    
    public static void guardar_objetos (ArrayList array, String fichero){
            try{
            FileOutputStream file = new FileOutputStream(fichero);
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < array.size(); i++) {
                outputFile.writeObject(array.get(i));
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
            }catch(IOException f){
                JOptionPane.showMessageDialog(null, f.getMessage());
            }
        }
    
}
