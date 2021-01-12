
package gui.settings;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Dialogs {
    
    
    public static void bosOlaBilmezMesajGoster(JFrame frame){
        JOptionPane.showMessageDialog(frame, "Bosluqlari Doldurun");
    }
    public static void ozelMesajGoster(JFrame frame,String message){
        JOptionPane.showMessageDialog(frame, message);
    }
    
}
