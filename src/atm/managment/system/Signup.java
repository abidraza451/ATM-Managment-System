package atm.managment.system;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup extends JFrame implements ActionListener {

    JTextField textName, textEmail, textCity,textPin,textState;
    JTextField textFname,textAdd;
    JDateChooser dateChooser;
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    Random ran = new Random();
    long first4=(ran.nextLong() % 9000L)+1000L;

    String first = " "+ Math.abs(first4);

    Signup(){
        super("Application Form");

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1 = new JLabel("Application Form No."+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);


        JLabel label2 =new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3 =new JLabel("Personal Details");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);


        JLabel labelName =new JLabel("Name :");
        labelName.setBounds(100,190,100,30);
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300,190,400,30);
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        add(textName);

        JLabel labelfName  =new JLabel("Father's Name :");
        labelfName.setBounds(100,240,200,30);
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelfName);

        textFname = new JTextField();
        textFname.setBounds(300,240,400,30);
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        add(textFname);


        JLabel DOB  =new JLabel("Date Of Birth :");
        DOB.setBounds(100,340,200,30);
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


        JLabel labelG  =new JLabel("Gender :");
        labelG.setBounds(100,290,200,30);
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelG);


        r1 = new JRadioButton("Male");
        r1.setBounds(300,290,60,30);
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,255));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(450,290,90,30);
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,255));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        r1.setSelected(true);

        JLabel labelEmail  =new JLabel("Email :");
        labelEmail.setBounds(100,390,200,30);
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300,390,400,30);
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        add(textEmail);

        JLabel labelMs  =new JLabel("Marital Status :");
        labelMs.setBounds(100,440,200,30);
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,255));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450,440,100,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,255));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(600,440,100,30);
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,255));
        add(m3);

        ButtonGroup MbuttonGroup = new ButtonGroup();
        MbuttonGroup.add(m1);
        MbuttonGroup.add(m2);
        MbuttonGroup.add(m3);
        m1.setSelected(true);


        JLabel labelAdd =new JLabel("Address :");
        labelAdd.setBounds(100,490,200,30);
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setBounds(300,490,400,30);
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        add(textAdd);

        JLabel labelCity =new JLabel("City :");
        labelCity.setBounds(100,540,200,30);
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300,540,400,30);
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        add(textCity);

        JLabel labelPin=new JLabel("Pin Code :");
        labelPin.setBounds(100,590,200,30);
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelPin);

        textPin = new JTextField();
        textPin.setBounds(300,590,400,30);
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        add(textPin);

        JLabel labelSt=new JLabel("State :");
        labelSt.setBounds(100,640,200,30);
        labelSt.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelSt);

        textState = new JTextField();
        textState.setBounds(300,640,400,30);
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        add(textState);

        next =new JButton("Next");
        next.setBounds(620,710,80,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);






        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=textName.getText();
        String fname=textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if(r2.isSelected()){
            gender="Female";
        }

        String email=textEmail.getText();
        String merital=null;
        if(m1.isSelected()){
            merital="Married";
        }
        else if(m2.isSelected()){
            merital="Unmarried";
        }
        else if(m3.isSelected()){
            merital="Other";
        }
        String address=textAdd.getText();
        String city=textCity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();


        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else {
                Config con1 = new Config();
                String q= "Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+merital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";

                con1.statement.executeUpdate(q);
                new Signup2();
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
                new Signup();
    }
}
