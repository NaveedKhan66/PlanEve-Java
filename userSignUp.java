import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class userSignUp implements ActionListener{
    JFrame fr;
    JLabel message;
    JTextField name;
    JTextField email;
    JTextField password;
    JButton enter;

    userSignUp() {
        fr = new JFrame("User Sign Up");
        fr.setLayout(new GridLayout());
        fr.setSize(1500, 1500);
        message = new JLabel("Please add your credebtials for the Sign Up");
        message.setOpaque(true);
        message.setBackground(Color.PINK);
        JPanel con;
        try {
            BufferedImage myImage = ImageIO.read(new File("homepage.jpg"));
            con = new ImagePanel(myImage);
            GridBagConstraints gc = new GridBagConstraints();
            gc.fill = GridBagConstraints.HORIZONTAL;
            gc.insets = new Insets(10, 10, 10, 10); // for setting grdbaglayout properly

            gc.gridx = 0;
            gc.gridy = 0;
            con.add(message, gc);

            JLabel nameLabel = new JLabel("Name");
            nameLabel.setOpaque(true);
            nameLabel.setBackground(Color.PINK);
            
            JLabel emailLabel = new JLabel("Email");
            emailLabel.setOpaque(true);
            emailLabel.setBackground(Color.PINK);
            
            JLabel passwordLabel = new JLabel("Password");
            passwordLabel.setOpaque(true);
            passwordLabel.setBackground(Color.PINK);

            name = new JTextField(10);
            name.setName("Name");
            email = new JTextField(15);
            email.setName("Email");
            password = new JTextField(10);
            password.setName("Password");


            gc.gridx = 1;
            gc.gridy = 1;

            con.add(nameLabel, gc);
            gc.gridx = 1;
            gc.gridy = 2;
            con.add(name, gc);

            gc.gridx = 2;
            gc.gridy = 1;
            con.add(emailLabel, gc);
            gc.gridx = 2;
            gc.gridy = 2;
            con.add(email, gc);

            gc.gridx = 3;
            gc.gridy = 1;
            con.add(passwordLabel, gc);

            gc.gridx = 3;
            gc.gridy = 2;
            con.add(password, gc);

            enter = new JButton("Enter");
            enter.addActionListener(this);
            gc.gridx = 5;
            gc.gridy = 3;
            con.add(enter, gc);

            fr.setContentPane(con);
            fr.setVisible(true);

            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent e){
        
    }

}
