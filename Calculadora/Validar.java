
package Calculadora;

/**
 *
 * @author sergio
 */
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class Validar {
    public  boolean isPresent(JTextComponent c , String title){
         if(c.getText().length() == 0 ){
            showMessage(c , title + " es un campo requerido.");
            c.requestFocusInWindow();
            return false;
        }
        return true ;
    } 
    public boolean isDouble(JTextComponent c , String title){
        try{
            double d = Double.parseDouble(c.getText());
            return true;
        }catch(NumberFormatException e){
            showMessage(c , title + "solo lee numeros");
            c.requestFocusInWindow();
            return false;
        }
    }
    private void showMessage(JTextComponent c , String message){
        JOptionPane.showMessageDialog(c, message,"Dato no valido", JOptionPane.ERROR_MESSAGE);
    }
}
