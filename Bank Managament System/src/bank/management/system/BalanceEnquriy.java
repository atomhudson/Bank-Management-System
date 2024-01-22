package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class BalanceEnquriy extends JFrame implements ActionListener {
    JLabel label2;
    String pin;
    JButton b1;

    BalanceEnquriy(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1549, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1549, 830);
        add(l3);

        JLabel label1 = new JLabel("YOUR CURRENT BALANCE IS ");
        label1.setFont(new Font("MONOSPACED",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);

        JLabel label2 = new JLabel();
        label2.setFont(new Font("System",Font.BOLD,18));
        label2.setBounds(465,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);

        b1 = new JButton("BACK");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        int balance = 0;
        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM bank WHERE pin = '" + pin + "'");

            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            resultSet.close();
            c.connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        label2.setText("₹ " + balance + "/-");


        setLayout(null);
        setBackground(Color.WHITE);
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);
    }
    public static void main(String[] args) {
        new BalanceEnquriy("");
    }
}
