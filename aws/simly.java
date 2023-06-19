import java.awt.*;
import javax.swing.*;

public class simly extends JPanel{
public void paint(Graphics g){
setBackground(Color.BLUE);

g.setColor(Color.YELLOW);
g.fillOval(50,50,200,200);

g.setColor(Color.RED);
g.fillOval(100,100,30,30);
g.fillOval(180,100,30,30);

g.setColor(Color.RED);
g.drawLine(140,140,140,140);

g.setColor(Color.RED);
g.drawArc(100,140,120,80,0,-180);

}
public static void main(String[] args){
JFrame d=new JFrame("simly");
d.setSize(300,300);

d.add(new simly());
d.setVisible(true);


}


}