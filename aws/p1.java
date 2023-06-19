import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class p1 extends JFrame{

p1(){
JLabel l1= new JLabel("First Name");
JLabel l2 = new JLabel("Last Name");
JLabel l3 = new JLabel("Age");
JTextField tf1 = new JTextField(20);
JTextField tf2 = new JTextField(20);
JTextField tf3 = new JTextField(3);

JLabel l4 = new JLabel("Gender");
JLabel l5 = new JLabel("D-O-B");
JTextField tf4 = new JTextField(10);

JLabel l6 = new JLabel("Student Information System");
JRadioButton r1=new JRadioButton("MALE");
JRadioButton r2=new JRadioButton("FEMALE");
ButtonGroup b1= new ButtonGroup();
b1.add(r1);
b1.add(r2);


setLayout(new FlowLayout());
add(l6);
add(l1);	
add(tf1);
add(l2);
add(tf2);
add(l3);
add(tf3);
add(l5);
add(tf4);
add(r1);
add(r2);

}

public static void main(String[] args){
Student s = new Student();
s.setSize(300,400);
s.setVisible(true);


}



}


