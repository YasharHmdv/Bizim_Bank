
package gui.settings;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class IconSettings {
    
    private static Icon originalIcon;
    
    public static void changeIcon(JLabel label,String filename){
        originalIcon = label.getIcon();
        label.setIcon(new ImageIcon(Package.getPackages().getClass().getResource("/gui/Icons/"+filename+".png")));
    }
    public static void setOriginalIcon(JLabel label){
        label.setIcon(originalIcon);
    }
}
