import javax.swing.*;
import java.awt.*;

public class MySwing1 extends JFrame{
MySwing1(){


//Text Field and Lable
JLabel l1= new JLabel("First Name");
JLabel l2= new JLabel("Last Name");
JTextField tf1= new JTextField(20);
JTextField tf2= new JTextField(20);
setLayout(new FlowLayout());

add(l1);
add(tf1);

add(l2);
add(tf2);




//JComoboBox
String s[]={"India","Bhutan","Nepal"};

JComboBox cb= new JComboBox(s);  //dropdown list
add(cb);







//J check box


JCheckBox c1= new JCheckBox();
JCheckBox c2= new JCheckBox("10th");
JCheckBox c3= new JCheckBox("12th",true);
add(c1);
add(c2);
add(c3);


//J radio Box


JRadioButton rb1=new JRadioButton();
JRadioButton rb2=new JRadioButton("CSE");
JRadioButton rb3=new JRadioButton("EC",true);

ButtonGroup bg= new ButtonGroup();

bg.add(rb1);
bg.add(rb2);
bg.add(rb3);

add(rb1);
add(rb2);
add(rb3);


//List Model

DefaultListModel<String> d=new DefaultListModel<>();
d.addElement("India");
d.addElement("Nepal");
d.addElement("Bhutan");
JList<String> list=new JList<>(d); //why <> are used here
add(list);


//adding button
JButton b1=new JButton("CTA");

add(b1);


//Text Area

JTextArea ta=new JTextArea(10,20);
add(ta);

JScrollBar jb= new JScrollBar(JScrollBar.HORIZONTAL, 100,50,0,1000);
add(jb); 

JScrollBar jb2= new JScrollBar(JScrollBar.VERTICAL, 100,50,0,1000);
add(jb2); 

 
//TABLE

String data[][]={{"1","RAJ","1000"},{"2","JAY","2000"},{"3","ROHAN","3000"}};
String col[]={"ID","NAME","SALARY"};
JTable jtb=new JTable(data,col);
JScrollPane sp=new JScrollPane(jtb);
add(sp);
 



}


public static void main(String[] args){
MySwing1 d=new MySwing1();
d.setSize(300,400);
d.setVisible(true);
}



}

