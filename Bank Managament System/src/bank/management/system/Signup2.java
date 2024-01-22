package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox<String> comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField txtPan,txtAdh;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;

        JLabel l1= new JLabel("Page 2 : -");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,100,30);
        add(l3);

        String[] religion = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(255, 255, 255));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,140,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,180,100,30);
        add(l4);

        String[] category = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox<>(category);
        comboBox2.setBackground(new Color(255, 255, 255));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,180,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income:");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String[] income = {"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(255, 255, 255));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Education:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,260,100,30);
        add(l6);

        String[] education = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Ohter"};
        comboBox4 = new JComboBox<>(education);
        comboBox4.setBackground(new Color(255, 255, 255));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,260,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,300,130,30);
        add(l7);

        String[] occupation = {"Salaried","Self-Employed","Business","Student","Retired","Ohter"};
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(255, 255, 255));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,300,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("PANCard Number:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,340,170,30);
        add(l8);

        txtPan = new JTextField();
        txtPan.setFont(new Font("Raleway",Font.BOLD,18));
        txtPan.setBounds(350,340,320,30);
        add(txtPan);

        JLabel l9=new JLabel("AdharCard Number:");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,380,320,30);
        add(l9);

        txtAdh = new JTextField();
        txtAdh.setFont(new Font("Raleway",Font.BOLD,18));
        txtAdh.setBounds(350,380,320,30);
        add(txtAdh);

        JLabel l10=new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,420,320,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,15));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,420,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,15));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,420,50,30);
        add(r2);

        JLabel l11=new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,460,320,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,15));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,460,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,15));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(450,460,50,30);
        add(e2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(580,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,16));
        l13.setBounds(670,10,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.setBounds(550,550,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(750,670);
        setLocation(360,50);
        getContentPane().setBackground(new Color(255, 207, 71));
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = txtPan.getText();
        String adhar = txtAdh.getText();
        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }
        String eAccount = " ";
        if ((e1.isSelected())){
            eAccount = "Yes";
        } else if (e2.isSelected()) {
            eAccount = "No";
        }
        try {
            if (txtPan.getText().isEmpty() || txtAdh.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1 = new Con();
                String q = "Insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch (Exception E){
            Logger.getLogger(Signup2.class.getName()).log(Level.SEVERE, "An unexpected error occurred", E);
        }
    }
    public static void main(String[] args) {
        new Signup2("");
    }
}
