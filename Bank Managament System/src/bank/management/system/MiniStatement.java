package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MiniStatement extends JFrame implements ActionListener {
    String pin;
    JButton button;
    String name;
    String formno;
    MiniStatement(String pin) {
        this.pin = pin;
        JLabel label1 = new JLabel();
        label1.setBounds(20, 140, 400, 200);
        this.add(label1);

        JLabel label2 = new JLabel();
        label2.setFont(new Font("System", Font.BOLD, 15));
        label2.setBounds(110, 20, 200, 20);
        this.add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 300, 20);
        this.add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20, 400, 300, 20);
        this.add(label4);

        this.getContentPane().setBackground(new Color(255, 204, 204));
        this.setSize(400, 600);
        this.setLocation(600, 120);
        this.setLayout(null);
        String var10001;

        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '" + pin + "'");
            while (resultSet.next()) {
                var10001 = resultSet.getString("card_number").substring(0, 4);
                formno = resultSet.getString("form_no");
                label3.setText("Card Number:  " + var10001 + " XXXX XXXX " + resultSet.getString("card_number").substring(12));
            }

        }
        catch (Exception var10) {
            var10.printStackTrace();
        }
        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM login JOIN signup ON login.form_no = signup.form_up WHERE login.pin = '"+pin+"' AND signup.form_up = '"+formno+"'");
            while (resultSet.next()){
                name = resultSet.getString("name");
            }
            label2.setText("Welcome "+name+" !");
        }catch (Exception exe){
            exe.printStackTrace();
        }

        try {
            int balance = 0;
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");

            while (resultSet.next()) {
                var10001 = label1.getText();
                label1.setText(var10001 + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br><html>");
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs " + balance);
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        this.button = new JButton("Exit");
        this.button.setBounds(20, 500, 100, 25);
        this.button.addActionListener(this);
        this.button.setBackground(Color.BLACK);
        this.button.setForeground(Color.WHITE);
        this.add(this.button);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
