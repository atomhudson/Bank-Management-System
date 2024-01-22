package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Login extends JFrame implements ActionListener{
    JLabel label1,label2,label3;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1,button2,button3;

    Login(){
        super("Bank Management System");
//        Image 1
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

//        Label 1 "Welcome to Atm" !
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade", Font.BOLD,30));
        label1.setBounds(285,125,450,40);
        add(label1);

//        Label 2 "Card Details" !
        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

//        Text Field !
        textField = new JTextField(15);
        textField.setBounds(325,190,230,30);
        textField.setFont(new Font("Arial",Font.BOLD,14));
        add(textField);

//        Password Field !
        passwordField = new JPasswordField(15);
        passwordField.setBounds(325,250,230,30);
        passwordField.setFont(new Font("Arial", Font.BOLD,18));
        add(passwordField);

//        Sign In Button!
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(325,300,100,30);
        button1.addActionListener(this);
        add(button1);

//        Clear Button!
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLUE);
        button2.setBounds(455,300,100,30);
        button2.addActionListener(this);
        add(button2);

//        Sign Up Button!
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.ORANGE);
        button3.setBounds(375,370,100,30);
        button3.addActionListener(this);
        add(button3);

//        Label 3 "PIN" !
        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway",Font.BOLD,30));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

//        Image 2
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

//        Background image.
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

//        Frame
        setLayout(null);
        setSize(850,480);
        setLocation(400,200);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
//            Sign in Button!
            if(e.getSource() == button1){
                Con c = new Con();
                String cardno = textField.getText();
                char[] passwordChars = passwordField.getPassword();
                String pin = new String(passwordChars);
                String checking = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(checking);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorect Card Number or PIN");
                }
            }
//            Clear Button !
            else if (e.getSource() == button2) {
                textField.setText("");
                passwordField.setText("");
            }
//            Sign Up Button!
            else if (e.getSource() == button3){
                new Signup();
                setVisible(false);
            }
        }catch (Exception E){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, "An unexpected error occurred", E);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
