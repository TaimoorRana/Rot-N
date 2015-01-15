/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rot.n;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

/*
Taimoor Rana
COMP249
Assignment # 4
11th of march 2014
*/
public class CustomizePanel extends JPanel {

    // instance variables
    EndeText endeText;
    EndeType endeType;
    EndeDigits endeDigits;
    ControlButton controlButton;
    GridBagConstraints gbc ;
    
    /**
     * Constructor
     */
    public CustomizePanel(){
        
        endeText = new EndeText();
        endeType = new EndeType();
        endeDigits = new EndeDigits();
        controlButton = new ControlButton();
        gbc = new GridBagConstraints();
        
        positionPanels();
        
        
    }
    
    /**
     * Position all the panels within this panel
     */
    private void positionPanels() {
      setLayout(new GridBagLayout());
        gbc.gridheight = 4;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(endeText, gbc);
        
        gbc.gridheight = 4;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(endeType,gbc);
        
        gbc.gridheight = 4;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(endeDigits,gbc);
        
        gbc.gridheight = 4;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 7;
        gbc.gridy = 0;
        add(controlButton,gbc);
        }
}
