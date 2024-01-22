package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.ResultSet;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    String pin;

    FastCash(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1549, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1549, 830);
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MONOSPACED",Font.BOLD,28));
        l3.add(label);

        b1 = new JButton("₹ 500/-");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,150,35);
        b1.setFont(new Font("MONOSPACED",Font.BOLD,15));
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("₹ 5,000/-");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,274,150,35);
        b2.setFont(new Font("MONOSPACED",Font.BOLD,15));
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("₹ 1,000/-");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(410,318,150,35);
        b3.setFont(new Font("MONOSPACED",Font.BOLD,15));
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("₹ 7,000");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,318,150,35);
        b4.setFont(new Font("MONOSPACED",Font.BOLD,15));
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("₹ 2,000/-");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,362,150,35);
        b5.setFont(new Font("MONOSPACED",Font.BOLD,15));
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("₹ 10,000/-");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,362,150,35);
        b6.setFont(new Font("MONOSPACED",Font.BOLD,15));
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("BACK");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(700,406,150,35);
        b7.setFont(new Font("MONOSPACED",Font.BOLD,15));
        b7.addActionListener(this);
        l3.add(b7);

        b8 = new JButton("₹ 3,000/-");
        b8.setForeground(Color.WHITE);
        b8.setBackground(new Color(65,125,128));
        b8.setBounds(410,406,150,35);
        b8.setFont(new Font("MONOSPACED",Font.BOLD,15));
        b8.addActionListener(this);
        l3.add(b8);

        setLayout(null);
        setBackground(Color.WHITE);
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int amount = 0;
            ResultSet resultSet;
            if (e.getSource() == b1) {
                amount = 500;
            } else if (e.getSource() == b2) {
                amount = 5000;
            } else if (e.getSource() == b3) {
                amount = 1000;
            } else if (e.getSource() == b4) {
                amount = 7000;
            } else if (e.getSource() == b5) {
                amount = 2000;
            } else if (e.getSource() == b6) {
                amount = 10000;
            } else if (e.getSource() == b8) {
                amount = 3000;
            } else if (e.getSource() == b7) {
                setVisible(false);
                new main_Class(pin);
                return; // No need to proceed further if the "BACK" button is clicked
            }

            Con c = new Con();
            resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
            int balance = 0;


            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            if (balance < amount) {
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                return;
            }
            // Update the database with the withdrawal transaction
            Date date = new Date();
            c.statement.executeUpdate("insert into bank value('" + pin + "','" + date + "','Withdrawal','" + amount + "')");
            JOptionPane.showMessageDialog(null, "₹ " + amount + " Debited Successfully");
            setVisible(false);
            new main_Class(pin);

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
