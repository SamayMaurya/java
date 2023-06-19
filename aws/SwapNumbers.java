import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SwapNumbers extends JFrame implements ActionListener {
    JTextField tf1, tf2;
    JButton swapButton;

    SwapNumbers() {
        JLabel l1 = new JLabel("Number 1");
        JLabel l2 = new JLabel("Number 2");
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        swapButton = new JButton("Swap");
        setLayout(new FlowLayout());

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(swapButton);

        swapButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());

        // Swap the numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Update the text fields with the swapped values
        tf1.setText(Integer.toString(num1));
        tf2.setText(Integer.toString(num2));
    }

    public static void main(String args[]) {
        SwapNumbers swapNumbers = new SwapNumbers();
        swapNumbers.setSize(300, 200);
        swapNumbers.setVisible(true);
    }
}
