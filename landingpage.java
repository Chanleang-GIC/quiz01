import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class landingpage implements ActionListener {

    private JLabel label = new JLabel("\t\tWelcome to the typing test application : \nPick an option to comtinue");
    
    private JFrame frame = new JFrame();
    JButton button1, button, button2, button3, button4;

    public landingpage() {

        // the clickable button
        button1 = new JButton("Register username");
        button1.addActionListener(this);
        button2 = new JButton("Log in");
        button2.addActionListener(this);
        button3 = new JButton("Typing test");
        button3.addActionListener(this);
        button4 = new JButton("List of test results");
        button4.addActionListener(this);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Typing test application");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            String tmp= usernametmp.username1;
            String tmp1= usernametmp.password1;
        }else if(e.getSource()==button2){

            window main = new window();
            main.LoadForm();

        }else if(e.getSource()==button3){
            new typing();;
        }else if(e.getSource()==button4){
			System.out.println("\n\n\n\n\n");
			System.out.println("These are the records of the previous tests: ");
			System.out.println(usernametmp.username1+" has the typing speed of " + typing.WPM);
        }
    }
    // process the button clicks

    // create one Frame
    public static void main(String[] args) {
        new landingpage();
    }
}