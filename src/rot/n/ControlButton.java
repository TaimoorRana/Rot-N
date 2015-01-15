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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/*
Taimoor Rana
COMP249
Assignment # 4
11th of march 2014
*/
public class ControlButton extends JPanel {
    //Variables
    JButton clearButton;
    JButton goButton;
    GridBagConstraints gbc;
    
    /**
     * Constructor
     */
    public ControlButton(){
        clearButton = new JButton("CLEAR");
        goButton = new JButton   ("  Go ");
        setLayout(new GridBagLayout());
        
        setBackground(Color.DARK_GRAY);
        gbc = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        clearButton.addActionListener(new ClearButtonListener());
        add(clearButton, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        goButton.addActionListener(new GoButtonListener());
        add(goButton, gbc);
        setBorder(BorderFactory.createTitledBorder(null, "Controls", TitledBorder.LEFT, TitledBorder.TOP, new Font("times new roman",Font.PLAIN,16), Color.WHITE));
        
    }
    
    /**
     * Responds to when the clear button is clicked
     */
    private static class ClearButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            InputPanel.setText("");
            OutputPanel.setText("");
        }
    }
    
    /**
     * Responds to when the Go button is clicked
     */
    private static class GoButtonListener implements ActionListener {

        
        @Override
        public void actionPerformed(ActionEvent e) {
            String result;
            
            result = encrypDecryp(InputPanel.getText(),EndeText.isSelected(),EndeType.isSelected(),EndeDigits.isSelected());
            OutputPanel.setText(result);
        }
        
        
        private String encrypDecryp(String text,int textED ,int typeED, int digitED){
            
            String converted = "";
            
            int digitStart = 48;
            int digitEnd = 57;
            int space = 32;
            int digitIgnore = 2;
            
            int capitalStart = 65;
            int capitalEnd = 90;
            int letter;
            char c;
            
            if(textED == 1){
                typeED = 0 - typeED;
            }
            
            
            for(int x = 0; x < text.length(); x++){            
                
                // convert char to ascii integer
                c = text.charAt(x);                
                letter = (int)c;
                
                //***** Decryption ****
                if(textED == 1){
                    // check if the letter is a digit
                    if(letter >= digitStart && letter <=digitEnd && digitED != digitIgnore){
                        letter = (int)c + typeED;
                        if(letter < digitStart){
                            letter = ((letter - digitStart) % 9) + (digitEnd);
                        }
                        c = (char) letter;
                        converted += c;
                    }
                    
                    
                    else{
                        // check if letter is capital
                        if(letter >= capitalStart && letter <= capitalEnd){
                            letter = (int)c + typeED;
                                if(letter < capitalStart)
                                {
                                    letter = (letter -(capitalStart-1)) + (capitalEnd - 1);
                                }
                                c = (char) letter;
                                converted += c;
                        }
                        // if it is NOT capital then do the following
                        else if (letter >= 97 && letter <= 122){
                            // do not convert if char is a space
                            if(letter == space){
                                converted += " ";
                            }
                            // else convert char
                            else{
                                letter = (int)c + typeED;
                                if(letter < 97)
                                {
                                    letter = (letter -96) + 122;
                                }
                                c = (char) letter;
                                converted += c;
                                
                            }
                        }
                        // else this is not a letter or number so leave it as-is
                        else{
                            c = (char) letter;
                            converted += c;
                        }
                    }
                }
                
                
                
                
                
                
                
                //***** Encryption ****
                else{
                    // check if the letter is a digit
                    if(letter >= digitStart && letter <=digitEnd && digitED != digitIgnore){
                        letter = (int)c + typeED;
                        if(letter > digitEnd){
                            letter = ((letter % digitEnd) % 9)+ (digitStart );
                        }
                        c = (char) letter;
                        converted += c;
                    }
                    else{
                        // check if letter is capital
                        if(letter >= capitalStart && letter <= capitalEnd){
                            letter = (int)c + typeED;
                                if(letter > capitalEnd)
                                {
                                    letter = (letter % capitalEnd) + capitalStart;
                                }
                                c = (char) letter;
                                converted += c;
                        }
                        // if it is NOT capital then do the following
                        else if (letter >= 97 && letter <= 122){
                            // do not convert if char is a space
                            if(letter == space){
                                converted += " ";
                            }
                            // else convert char
                            else{
                                letter = (int)c + typeED;
                                if(letter > 122)
                                {
                                    letter = (letter % 122) + 96;
                                }
                                c = (char) letter;
                                converted += c;
                            }
                        }
                        // else this is not a letter or number so leave it as-is
                        else{
                            c = (char) letter;
                            converted += c;
                        }
                    }
                }
            }  
            
            return converted;
        }        
    }

    
}
