package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField pf1,pf2,pf3;
    String pin;
    Pin(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1549, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1549, 830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(420,180,150,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2 = new JLabel("CURRENT PIN: ");
        label2.setFont(new Font("System",Font.BOLD,14));
        label2.setBounds(420,220,150,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        pf1 = new JPasswordField();
        pf1.setBackground(new Color(65,125,128));
        pf1.setForeground(Color.WHITE);
        pf1.setBounds(550,225,250,25);
        pf1.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(pf1);

        JLabel label3 = new JLabel("NEW PIN: ");
        label3.setFont(new Font("System",Font.BOLD,14));
        label3.setBounds(420,260,150,35);
        label3.setForeground(Color.WHITE);
        l3.add(label3);

        pf2 = new JPasswordField();
        pf2.setBackground(new Color(65,125,128));
        pf2.setForeground(Color.WHITE);
        pf2.setBounds(550,265,250,25);
        pf2.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(pf2);

        JLabel label4 = new JLabel("RE-ENTER PIN: ");
        label4.setFont(new Font("System",Font.BOLD,14));
        label4.setBounds(420,305,150,35);
        label4.setForeground(Color.WHITE);
        l3.add(label4);

        pf3 = new JPasswordField();
        pf3.setBackground(new Color(65,125,128));
        pf3.setForeground(Color.WHITE);
        pf3.setBounds(550,305,250,25);
        pf3.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(pf3);

        b1 = new JButton("CHANGE PIN");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setSize(1550,1080);
        setLayout(null);
        setVisible(true);
        setLocation(0,0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (pf1.getText().equals(pin)) {
                String pin1 = String.valueOf(pf2.getPassword());
                String pin2 = String.valueOf(pf3.getPassword());
                if (!pin1.equals(pin2)) {
                    JOptionPane.showMessageDialog(null, "ENTERED PIN DOES NOT MATCH!");
                    return;
                } else if (e.getSource() == b1) {
                    if (pf1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "PLEASE ENTER THE CURRENT PIN!");
                        return;
                    } else if (pf2.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "PLEASE ENTER THE NEW PIN!");
                        return;
                    } else if (pf3.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "PLEASE ENTER THE CONFIRM PIN!");
                        return;
                    }
                }
                Con c = new Con();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN CHANGED SUCCESSFULLY");
                setVisible(false);
                new main_Class(pin);

            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_Class(pin);
            } else {
                JOptionPane.showMessageDialog(null,"PLEASE, ENTER THE CORRECT CURRENT PIN! ");
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Pin("");
    }
}
