import javax.swing.*;
import java.awt.FlowLayout;
public class SwingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("User Form");
		f.setVisible(true);
		f.setSize(800, 400);
		
		f.setLayout(new FlowLayout());
		
		//creating label
		JLabel l1 = new JLabel("UserName:");
		f.add(l1);
		
		JTextField t1 = new JTextField(20);
		f.add(t1);
		
		JLabel l2 = new JLabel("Password:");
		f.add(l2);
		
		JTextField t2 = new JTextField(20);
		f.add(t2);
		
		JButton b = new JButton("Submit");
		f.add(b);
		

	}

}
