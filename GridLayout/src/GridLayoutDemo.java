import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GridLayoutDemo extends JFrame {

	public static void main(String[] args) {
		
		
//		Here I create panels
        JPanel panel1 = new JPanel(new GridLayout(2,2));
        JPanel panel2 = new JPanel(new GridLayout(2,2));
//      Here I add Buttons
        panel1.add(new JButton("Button 1"));
        panel1.add(new JButton("Button 2"));
        panel1.add(new JButton("Button 3"));
        panel2.add(new JButton("Button 4"));
        panel2.add(new JButton("Button 5"));
        panel2.add(new JButton("Button 6"));
//      Here I create frame and add panels to it
        JFrame frame = new JFrame("GridLayout Demo"); 
        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.SOUTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		

	}

}
