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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

/*
Taimoor Rana
COMP249
Assignment # 4
11th of march 2014
*/
public class EndeText extends JPanel {
    
    // Variables
    private static ButtonGroup bg;
    private static JRadioButton encrypRadio;
    private static JRadioButton decrypRadio;
    private GridBagConstraints gbc;
    Font font ;
    
    /**
     * Constructor
     */
    public EndeText(){
        // Group the radioButtons
        bg = new ButtonGroup();
        encrypRadio = new JRadioButton("Encryption",true);
        decrypRadio = new JRadioButton("Decryption");
        font = new Font("Verdana", Font.BOLD, 12);
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        setBackground(Color.DARK_GRAY);
        setupThePanel();
        setBorder(BorderFactory.createTitledBorder(null, "Encrypt/Decrypt", TitledBorder.LEFT, TitledBorder.TOP, new Font("times new roman",Font.PLAIN,16), Color.WHITE));
        
    }
    
    /**
     * 
     * @return an int that represents if encryption or decryption is selected
     */
    
    public static int isSelected(){
        
        int encrypt = 0;
        int decrypt = 1;
        
        if(encrypRadio.isSelected())
            return encrypt;
        
        return decrypt;       
    }
    
    /**
     * Setups the panel
     */
    private void setupThePanel() {
     
        encrypRadio.setFont(font);
        decrypRadio.setFont(font);
        encrypRadio.setForeground(Color.CYAN);
        decrypRadio.setForeground(Color.CYAN);

        
        // add these buttons in a group
        bg.add(encrypRadio);
        bg.add(decrypRadio);
        
        // add these buttons in a group
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(encrypRadio, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(decrypRadio, gbc);
    }
    
}
