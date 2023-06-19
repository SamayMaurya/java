import java.awt.*;
import javax.swing.*;

public class Dra extends Canvas
{

public void paint(Graphics g)
{
setBackground(Color.BLUE);
setForeground(Color.GREEN);
g.drawOval(10,20,200,200); // x,y,width,height
g.fillOval(50,70,25,25); // x,y,width,height



g.fillOval(140,70,25,25); // x,y,width,height
g.drawLine(40,40,40,40);// x1,y1,x2,y2



}

public static void main(String[] args){
Dra d=new Dra();
JFrame f=new JFrame();
f.add(d);
f.setSize(300,400);
f.setVisible(true);

}

}