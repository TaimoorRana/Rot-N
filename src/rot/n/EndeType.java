/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rot.n;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/*
Taimoor Rana
COMP249
Assignment # 4
11th of march 2014
*/
public class EndeType extends JPanel {
    
    //variables
    private static JComboBox  cb;
    String[] options = {"Rot-5","Rot-7","Rot-13","Rot-17"};
    
    /**
     * constructor
     */
    public EndeType (){
        cb = new JComboBox(options);
        add(cb);
        
        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createTitledBorder(null, "ROT-X", TitledBorder.LEFT, TitledBorder.TOP, new Font("times new roman",Font.PLAIN,16), Color.WHITE));
        
    }
    
    /**
     * 
     * @return an integer that represents which encryption/decryption was selected
     */
    public static int isSelected(){
        
        int rot5 = 5;
        int rot7 = 7;
        int rot13 = 13;
        int rot17 = 17;
        
        switch (cb.getSelectedIndex()){
            case 0 : return rot5;
            case 1 : return rot7;
            case 2 : return rot13;
            case 3 : return rot17;
            default: return -1;
        }                      
    }
}
