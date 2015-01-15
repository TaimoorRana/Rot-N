package rot.n;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
Taimoor Rana
COMP249
Assignment # 4
11th of march 2014
*/

public class RotN extends JFrame {
    
    // Instance Variables
    InputPanel inputPanel;
    CustomizePanel customPanel;
    OutputPanel outputPanel;
    
    JMenuBar mb;
    static JMenu help;
    JMenuItem moreInfo;
    GridBagConstraints gdc;
    ImageIcon icon = new ImageIcon("");
    JLabel image = new JLabel(icon);
    
    // Constructor
    public RotN(){
        // ***** Setting JFrame INFO ******
        mb = new JMenuBar();
        help = new JMenu("Help");
        moreInfo = new JMenuItem("instructions");
        setDefaultJFrameParameters();
        File file = new File("/Users/Taimoor/NetBeansProjects/Rot-n/src/rot/n/image3.jpg");
        setContentPane(new JLabel(new ImageIcon(file.getAbsolutePath())));
        // ***** Setting JFrame INFO ******

        // ***** Adding and positioning items ******
        inputPanel = new InputPanel();
        customPanel = new CustomizePanel();
        outputPanel =  new OutputPanel();
        
        setLayout(new GridBagLayout());
        gdc = new GridBagConstraints();

        createPanels();
        // ***** Adding and positioning items ******
        setBackground(Color.BLACK);
        this.setIconImage(null);
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        RotN window = new RotN();

    }
    
    /**
     * Set all default information about this JFrame
     */
    private void setDefaultJFrameParameters() {
        
        setTitle("Rot-n Encryption/Decryption");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setMinimumSize(new Dimension(500, 250));
        setMaximumSize(new Dimension(600, 350));
                
        help.setBackground(Color.CYAN);
        
        mb.setBackground(Color.CYAN);
        mb.add(help);
        help.add(moreInfo);        
        setJMenuBar(mb);
    }

    /**
     * Creates and positions all custom panels
     */
    private void createPanels() {

        gdc.gridx = 0;
        gdc.gridy = 0;
        
        add(inputPanel, gdc);
        
      
        gdc.gridx = 0;
        gdc.gridy = 1;
        
        add(customPanel, gdc);
        
        gdc.gridx = 0;
        gdc.gridy = 2;
        
        add(outputPanel, gdc);
        
    }
    
}
