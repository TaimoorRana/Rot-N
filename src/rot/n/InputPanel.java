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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


/*
Taimoor Rana
COMP249
Assignment # 4
11th of march 2014
*/
 
public class InputPanel extends JPanel {
    
    // Variables
    private static JTextField input;
    private final GridBagConstraints gbc = new GridBagConstraints();
    /**
     * Constructor
     */
    public InputPanel(){
     
        setLayout(new GridBagLayout());
        input = new JTextField("Enter phrase to Encrypt or Decrypt here",30);
        this.setBorder(null);
        setBorder(BorderFactory.createTitledBorder(null, "Enter Text Here", TitledBorder.LEFT, TitledBorder.TOP, new Font("times new roman",Font.PLAIN,16), Color.WHITE));
        setBackground(Color.DARK_GRAY);
        add(input, gbc);      
    }
    
    /**
     * Gets the textfield value
     * @return String from JTextField 
     */
    public static String getText(){
        return input.getText();      
    }
    
    /**
     * 
     * @param text replace the textfield value with text
     */
    public static void setText(String text){
        input.setText(text);
    }


    
}
