import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



public class GetAreaTriangle extends JFrame {
	
	//Right triangle
	JPanel p11 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p12 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p13 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p14 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p15 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p16 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	//Right triangle
	JButton calculate3 = new JButton("計算");
	JButton cancel3 = new JButton("清除");
	
	//Right triangle
	JTextField c7 = new JTextField(5);
	JTextField c8 = new JTextField(5);
	JTextField c9 = new JTextField(5);
	JTextField c10 = new JTextField(5);
	
	double bottom,high,area3,perimeter3;
	
	public GetAreaTriangle(){
		//right triangle
		p11.add(new JLabel("RIGHT TRIANGLE: "));
		p12.add(new JLabel("                     bottom: "));
		p12.add(c7);
		p13.add(new JLabel("                     high: "));
		p13.add(c8);
		p13.add(new JLabel("                  "));
		p13.add(calculate3);
		p13.add(cancel3);
		p15.add(new JLabel("                         The area is :     "));
		p15.add(c9);
		p16.add(new JLabel("                         The perimeter is :     "));
		p16.add(c10);
		
		
		calculate3.addActionListener(new CALCULATE3());
		cancel3.addActionListener(new CANCEL3());
	}
	private class CALCULATE3 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			bottom = Integer.parseInt(c7.getText());
			high = Integer.parseInt(c8.getText());
			area3 = bottom * high / 2;
			perimeter3 = bottom + high + (Math.pow(bottom*bottom + high*high,0.5));
			
			c9.setText(String.format("%.2f" ,area3));
			c10.setText(String.format("%.2f" ,perimeter3));
		}
	}
	private class CANCEL3 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			c7.setText("");
			c8.setText("");
			c9.setText("");
			c10.setText("");
		}
	}
}
