import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.namespace.QName;

import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class startPage implements ActionListener {

    JButton vendorLogin;
    JButton vendorSignUp;
    JButton userLogin;
    JButton userSignUp;
    JFrame fr;
    startPage() {
        fr=new JFrame("PlanEve");
        fr.setVisible(true);
        fr.setSize(1500, 1500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setting homepage image background
        try {
            BufferedImage myImage = ImageIO.read(new File("homepage.jpg"));
            // setContentPane(new ImagePanel(myImage));

            fr.setVisible(true);
            fr.setLayout(new GridBagLayout());
            vendorLogin = new JButton("Vendor Login");
            vendorSignUp = new JButton("Vendor SignUp");
            userLogin = new JButton("User Login");
            userSignUp = new JButton("User SignUp");

            JPanel buttonPanel =new ImagePanel(myImage);
            buttonPanel.add(vendorSignUp);
            buttonPanel.add(vendorLogin);
            buttonPanel.add(userSignUp);
            buttonPanel.add(userLogin);

            fr.setContentPane(buttonPanel);
            fr.setVisible(true);
            } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public void actionPerformed(ActionEvent e){
        String command=e.getActionCommand();
        
        if(command=="Vendor SignUp"){

        }
        else if(command=="Vendor Login"){

        }
        else if(command=="User SignUp"){

        }
        else if(command =="User Login"){
            
        }
    }
}

class ImagePanel extends JPanel {
    private Image image;

    public ImagePanel(Image image) {
        this.image = image;
        this.setLayout(new GridBagLayout());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}