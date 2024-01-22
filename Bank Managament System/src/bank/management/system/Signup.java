package bank.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Signup extends JFrame implements ActionListener{
    JButton next;
    JDateChooser dateChooser;
    JRadioButton r1,r2,r3,m1,m2,m3,m4;
    TextField textName,textFName,textEmail,textAddress,textCity,textPincode,textState;
    //    To Generate Random Form Number;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " "+Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");
//        Bank Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

//        Application Form Number Label!
        JLabel label1  = new JLabel("APPLICATION FORM NO: "+first);
        label1.setBounds(190,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,30));
        add(label1);

//        Page1 LAbel!
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD,18));
        label2.setBounds(380,70,600,30);
        add(label2);

//        Personal Details Label!
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,20));
        label3.setBounds(340,90,600,30);
        add(label3);

//        Name Label!
        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,18));
        labelName.setBounds(100,190,100,30);
        add(labelName);

//        Name TextField!
        textName = new TextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(250,193,400,30);
        add(textName);

//        Father Name Label!
        JLabel labelFName = new JLabel("Father's Name:");
        labelFName.setFont(new Font("Raleway",Font.BOLD,18));
        labelFName.setBounds(100,230,150,30);
        add(labelFName);

//        Father Name TextField!
        textFName = new TextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(250,233,400,30);
        add(textFName);


//        Gender Label!
        JLabel labelG = new JLabel("Gender ");
        labelG.setFont(new Font("Raleway",Font.BOLD,18));
        labelG.setBounds(100,280,200,30);
        add(labelG);

//        Radio Button r1 for "MALE" !
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,12));
        r1.setBackground(new Color(65, 209, 192));
        r1.setBounds(250,283,60,30);
        add(r1);

//        Radio Button r2 for "FEMALE"!
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,12));
        r2.setBackground(new Color(65, 209, 192));
        r2.setBounds(390,283,90,30);
        add(r2);

//        Radio Button r3 for "OTHER'S"!
        r3 = new JRadioButton("Other's ");
        r3.setFont(new Font("Raleway",Font.BOLD,12));
        r3.setBackground(new Color(65, 209, 192));
        r3.setBounds(560,283,90,30);
        add(r3);

//        Button Grouping!
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

//        Date of Birth Label!
        JLabel labelDOB = new JLabel("Date of Birth");
        labelDOB.setFont(new Font("Raleway",Font.BOLD,18));
        labelDOB.setBounds(100,330,200,30);
        add(labelDOB);

//        Date Chooser field!
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(38, 19, 212));
        dateChooser.setBounds(250,333,400,30);
        add(dateChooser);

//        Email Address Label!
        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,18));
        labelEmail.setBounds(100,370,150,30);
        add(labelEmail);

//        Email Address Text Field!
        textEmail = new TextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(250,373,400,30);
        add(textEmail);

//        Marital Status Label!
        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("Raleway",Font.BOLD,18));
        labelMS.setBounds(100,410,150,30);
        add(labelMS);

//        Radio Button m1 for "SINGLE"!
        m1 = new JRadioButton("Single");
        m1.setFont(new Font("Raleway",Font.BOLD,12));
        m1.setBackground(new Color(65, 209, 192));
        m1.setBounds(250,413,90,30);
        add(m1);

//        Radio Button m2 for "MARRIED"!
        m2 = new JRadioButton("Married");
        m2.setFont(new Font("Raleway",Font.BOLD,12));
        m2.setBackground(new Color(65, 209, 192));
        m2.setBounds(350,413,90,30);
        add(m2);

//        Radio Button m3 for "DIVORCED"!
        m3 = new JRadioButton("Divorced");
        m3.setFont(new Font("Raleway",Font.BOLD,12));
        m3.setBackground(new Color(65, 209, 192));
        m3.setBounds(450,413,90,30);
        add(m3);

//        Radio Button m4 for "WIDOWED"!
        m4 = new JRadioButton("Widowed");
        m4.setFont(new Font("Raleway",Font.BOLD,12));
        m4.setBackground(new Color(65, 209, 192));
        m4.setBounds(550,413,90,30);
        add(m4);

//        Button Grouping!
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);
        buttonGroup1.add(m4);

//        Address Label!
        JLabel labeladdress = new JLabel("Address :");
        labeladdress.setFont(new Font("Raleway",Font.BOLD,18));
        labeladdress.setBounds(100,450,150,30);
        add(labeladdress);

//        Address TextField!
        textAddress= new TextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        textAddress.setBounds(250,453,400,30);
        add(textAddress);

//        City Label!
        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,18));
        labelcity.setBounds(100,490,150,30);
        add(labelcity);

//        City Textfield!
        textCity= new TextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(250,493,400,30);
        add(textCity);

//        Pincode Label!
        JLabel labelpincode = new JLabel("Pincode :");
        labelpincode.setFont(new Font("Raleway",Font.BOLD,18));
        labelpincode.setBounds(100,530,150,30);
        add(labelpincode);

//        Pincode Text Field!
        textPincode= new TextField();
        textPincode.setFont(new Font("Raleway",Font.BOLD,14));
        textPincode.setBounds(250,533,400,30);
        add(textPincode);

//        State Label!
        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,18));
        labelState.setBounds(100,570,150,30);
        add(labelState);

//        State Text Field!
        textState= new TextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(250,573,400,30);
        add(textState);

//        Next Button!
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(new Color(224, 18, 107));
        next.setForeground(Color.WHITE);
        next.setBounds(560,620,90,30);
        next.addActionListener(this);
        add(next);

//        Frame !
        getContentPane().setBackground(new Color(65, 209, 192));
        setLayout(null);
        setSize(800,750);
        setLocation(360,50);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String nano = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        if (dob.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a valid date of birth");
            return;
        }
        java.util.Date currentDate = new java.util.Date();
        java.util.Date selectedDate = dateChooser.getDate();
        if (selectedDate == null || selectedDate.after(currentDate)) {
            JOptionPane.showMessageDialog(null, "Invalid date of birth. Please select a past date.");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(selectedDate);
        calendar.add(Calendar.YEAR, 15);
        java.util.Date minAgeDate = calendar.getTime();

        if (minAgeDate.after(currentDate)) {
            JOptionPane.showMessageDialog(null, "You must be at least 15 years old.");
            return;
        }
        String gender;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else {
            gender = "Other's";
        }
        String email = textEmail.getText();
        String marital;
        if(m1.isSelected()){
            marital = "Single";
        } else if (m2.isSelected()) {
            marital = "Married";
        } else if (m3.isSelected()) {
            marital = "Divorced";
        }else{
            marital = "Widowed";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPincode.getText();
        String state = textState.getText();
        try {
            if (textName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the Fields");
            } else {
                Con con1 = new Con();
                String q = "INSERT INTO signup VALUES('"+formno+"','"+nano+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";

                System.out.println("Query: " + q); // Print the query for debugging

                con1.statement.executeUpdate(q);
                System.out.println("Data inserted successfully."); // Print success message

                new Signup2(first);
                setVisible(false);
            }
        } catch (Exception E){
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, "An unexpected error occurred", E);
            JOptionPane.showMessageDialog(null, "Error: " + E.getMessage());
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}
