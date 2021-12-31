import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
            vendorSignUp.addActionListener(this);
            
            userLogin = new JButton("User Login");
            
            userSignUp = new JButton("User SignUp");
            userSignUp.addActionListener(this);

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
            vendorSignUp frame=new vendorSignUp();
        }
        else if(command=="Vendor Login"){

        }
        else if(command=="User SignUp"){
            userSignUp frame=new userSignUp();
        }
        else if(command =="User Login"){

        }
    }
}
