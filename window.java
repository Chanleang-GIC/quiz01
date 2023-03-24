
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class window extends JFrame{
    JLabel lbUsername, lbPassword;
    JTextField tfUsername;
    JPasswordField jpPassword;
    JButton btnLogin, btnClear;
    public void LoadForm(){
        lbUsername = new JLabel("User name: ");
        
        lbPassword = new JLabel("Password: ");

        tfUsername = new JTextField();

        jpPassword = new JPasswordField();

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e){
                String userName = tfUsername.getText();
                String password = new String(jpPassword.getPassword());

                if(userName.equals(usernametmp.username1) && password.equals(usernametmp.password1)){
                    JOptionPane.showMessageDialog(rootPane, "Login Successful");
                    //usertyping typing = new typing();
                    new typing();



                }else{
                    JOptionPane.showMessageDialog(rootPane, "Incorrect password or username");
                }
            }
        });
        
        btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e ){
                tfUsername.setText("");
                jpPassword.setText("");
            }
        });

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.add(lbUsername);
        formPanel.add(tfUsername);
        formPanel.add(lbPassword);
        formPanel.add(jpPassword);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,5,5));
        buttonPanel.add(btnLogin);
        buttonPanel.add(btnClear);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        this.add(mainPanel);


        setTitle("Log in page");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(200,100));
        setVisible(true);

    }
    public static void land() {
        window main = new window();
        main.LoadForm();
        //typing.show();
    }
}
