package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Signup3 extends JFrame implements ActionListener {
    public String canumber;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    Signup3(String formno){
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,18));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,15));
        l3.setBounds(70,120,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("MONOSPACED",Font.BOLD,13));
        r1.setBackground(new Color(255, 207, 71));
        r1.setBounds(90,150,150,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("MONOSPACED",Font.BOLD,13));
        r2.setBackground(new Color(255, 207, 71));
        r2.setBounds(250,150,200,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("MONOSPACED",Font.BOLD,13));
        r3.setBackground(new Color(255, 207, 71));
        r3.setBounds(90,190,150,30);
        add(r3);

        r4 = new JRadioButton("Salary Account");
        r4.setFont(new Font("MONOSPACED",Font.BOLD,13));
        r4.setBackground(new Color(255, 207, 71));
        r4.setBounds(250,190,150,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number: ");
        l4.setFont(new Font("Raleway",Font.BOLD,15));
        l4.setBounds(70,230,200,40);
        add(l4);

        JLabel l5 = new JLabel("(Your 16 digit Card Number) ");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(70,250,350,40);
        add(l5);

        String fullNumber = generateUniqueNumber();
        canumber = fullNumber;
        String lastSixDigits = fullNumber.substring(10, 12) + "-" + fullNumber.substring(12, 16);
        JLabel l6 = new JLabel("XXXX-XXXX-XX"+lastSixDigits);
        l6.setFont(new Font("MONOSPACED",Font.BOLD,16));
        l6.setBounds(250,230,350,40);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(250,250,350,40);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,15));
        l8.setBounds(70,290,350,40);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("MONOSPACED",Font.BOLD,15));
        l9.setBounds(250,290,350,40);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(70,310,350,40);
        add(l10);

        JLabel l11 = new JLabel("Service Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,15));
        l11.setBounds(70,350,350,30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(255,207,71));
        c1.setFont(new Font("MONOSPACED" , Font.BOLD,15));
        c1.setBounds(90,380,150,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(255,207,71));
        c2.setFont(new Font("MONOSPACED" , Font.BOLD,15));
        c2.setBounds(320,380,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(255,207,71));
        c3.setFont(new Font("MONOSPACED" , Font.BOLD,15));
        c3.setBounds(90,410,150,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(255,207,71));
        c4.setFont(new Font("MONOSPACED" , Font.BOLD,15));
        c4.setBounds(320,410,150,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(255,207,71));
        c5.setFont(new Font("MONOSPACED" , Font.BOLD,15));
        c5.setBounds(90,440,150,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(255,207,71));
        c6.setFont(new Font("MONOSPACED" , Font.BOLD,15));
        c6.setBounds(320,440,150,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above-entered details are correct to the best of my knowledge.",true);
        c7.setBackground(new Color(255,207,71));
        c7.setFont(new Font("Raleway" , Font.BOLD,12));
        c7.setBounds(70,480,530,30);
        add(c7);

        JLabel l12 = new JLabel("Form No:- ");
        l12.setFont(new Font("Raleway" , Font.BOLD,15));
        l12.setBounds(610,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("MONOSPACED" , Font.BOLD,16));
        l13.setBounds(685,11,100,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.white);
        s.setBounds(200,550,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.white);
        c.setBounds(400,550,100,30);
        c.addActionListener(this);
        add(c);

        getContentPane().setBackground(new Color(255, 207, 71));
        setSize(750,670);
        setLayout(null);
        setLocation(360,50);
        setVisible(true);
    }
    private static String generateUniqueNumber() {
        Set<String> generatedNumbers = new HashSet<>();
        Random random = new Random();

        while (true) {
            StringBuilder randomStringBuilder = new StringBuilder();
            for (int i = 0; i < 16; i++) {
                randomStringBuilder.append(random.nextInt(10));
            }
            String fullNumber = randomStringBuilder.toString();

            if (!generatedNumbers.contains(fullNumber)) {
                generatedNumbers.add(fullNumber);
                return fullNumber;
            }
        }
    }

    private String generateServiceFacilities() {
        StringBuilder fac = new StringBuilder();

        if (c1.isSelected()) {
            fac.append("ATM CARD,");
        }
        if (c2.isSelected()) {
            fac.append("Internet Banking,");
        }
        if (c3.isSelected()) {
            fac.append("Mobile Banking,");
        }
        if (c4.isSelected()) {
            fac.append("EMAIL Alerts,");
        }
        if (c5.isSelected()) {
            fac.append("Cheque Book,");
        }
        if (c6.isSelected()) {
            fac.append("E-Statement,");
        }

        if (!fac.isEmpty()) {
            fac.deleteCharAt(fac.length() - 1); // Remove the trailing comma
        }
        return fac.toString();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Saving Account";
        } else if(r2.isSelected()){
            atype = "Fixed Deposit Account";
        } else if(r3.isSelected()){
            atype = "Current Account";
        } else if(r4.isSelected()){
            atype = "Salary Account";
        }

        Random ran = new Random();
        long first3 = (ran.nextLong() % 9000L) + 10000L;
        String pin = "" + Math.abs(first3);

        String fac = generateServiceFacilities();

        try {
            if (e.getSource() == s) {
                if (atype.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                }
                else {
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values('" + formno + "','" + atype + "','" + canumber + "','" + pin + "','" + fac + "')";
                    String q2 = "insert into login values('" + formno + "','" + canumber + "','" + pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + canumber + "\n Pin: " + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource() == c) {
                System.exit(0);
            }
        } catch (Exception E) {
            Logger.getLogger(Signup3.class.getName()).log(Level.SEVERE, "An unexpected error occurred", E);
        }
    }
    public static void main(String[] args) {
        new Signup3("");
    }
}
