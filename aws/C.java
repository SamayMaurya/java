import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class C extends JFrame implements ActionListener{

    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
C(){
JLabel l1= new JLabel("First Number");
JLabel l2= new JLabel("Second Number");
JLabel l3= new JLabel("Result");
//JLabel l4= new JLabel();
tf1= new JTextField(5);
tf2= new JTextField(5);
tf3= new JTextField(10);
JButton b1= new JButton("+");
JButton b2= new JButton("-");

setLayout(new FlowLayout());

add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(b2);
add(l3);
add(tf3);

b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
String s=e.getActionCommand();
int x=Integer.parseInt(tf1.getText());
int y= Integer.parseInt(tf2.getText());
int z=0;

if(s.equals("+")){
z=x+y;
tf3.setText(Integer.toString(z));
}
if(s.equals("-")){
z=x-y;
tf3.setText(Integer.toString(z));

}
}

public static void main(String [] args){
C d=new C();
d.setSize(300,400);
d.setVisible(true);

}


}