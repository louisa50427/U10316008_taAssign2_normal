import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



public class GetAreaCircle extends JFrame {
	//circle
	JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	
	//circle
	JButton run = new JButton("計算");
	JButton refresh = new JButton("清除");
	
	//circle
	JTextField c1 = new JTextField(5);
	JTextField c2 = new JTextField(5);
	JTextField c3 = new JTextField(5);
	
	double radius,area,perimeter;
	
	public GetAreaCircle(){
		
		//circle
		p1.add(new JLabel("CIRCLE: "));
		p2.add(new JLabel("                     Radius: "));
		p2.add(c1);
		p2.add(new JLabel("                  "));
		p2.add(run);
		p2.add(refresh);
		p4.add(new JLabel("                         The area is :     "));
		p4.add(c2);
		p5.add(new JLabel("                         The perimeter is :     "));
		p5.add(c3);

		
		run.addActionListener(new CALCULATE());
		refresh.addActionListener(new CANCEL());
			
	}
	private class CALCULATE implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			radius = Integer.parseInt(c1.getText());
			area = radius * radius * 3.14;
			perimeter = 2 * radius * 3.14;
			
			c2.setText(String.format("%.2f" ,area));
			c3.setText(String.format("%.2f" ,perimeter));
		}
	}
	
	
	private class CANCEL implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			c1.setText("");
			c2.setText("");
			c3.setText("");
		}
	}
	
}
