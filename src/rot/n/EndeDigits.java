/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rot.n;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/*
Taimoor Rana
COMP249
Assignment # 4
11th of march 2014
*/
public class EndeDigits extends JPanel {
    
    //variables
    private final ButtonGroup bg;
    private static JCheckBox encrypCheck;
    private static JCheckBox ignoreCheck;
    private GridBagConstraints gbc;
    Font font;
    
    /**
     * Constructor
     */
    public EndeDigits ()
    {
        bg = new ButtonGroup();
        encrypCheck = new JCheckBox("Encryp/Decryp",true);
        ignoreCheck = new JCheckBox("Ignore");
        font = new Font("Verdana", Font.BOLD, 12);
        encrypCheck.setFont(font);
        ignoreCheck.setFont(font);
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
 
        encrypCheck.setToolTipText("select to encrypt/ Decrypt digits");
        ignoreCheck.setToolTipText("select to ignore digits");
        encrypCheck.setForeground(Color.CYAN);
        ignoreCheck.setForeground(Color.CYAN);
        bg.add(encrypCheck);
        bg.add(ignoreCheck);
        
        
        setBackground(Color.DARK_GRAY);
        
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(encrypCheck, gbc);

        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(ignoreCheck, gbc);
        
        
        setBorder(BorderFactory.createTitledBorder(null, "Digits", TitledBorder.LEFT, TitledBorder.TOP, new Font("times new roman",Font.PLAIN,16), Color.WHITE));
        
    }
    
    /**
     * 
     * @return an integer that represents if digits will be encrypted/decrypted or not
     */
     public static int isSelected(){
        
        int encryp = 0;
        int ignore = 2;
        
        if(encrypCheck.isSelected() == true){
            return encryp;
        }
            return ignore;                     
    }
}
