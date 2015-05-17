import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class GetAreaSquare extends JFrame {
	//Square
	JPanel p6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p10 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	//Square
	JButton calculate2 = new JButton("計算");
	JButton cancel2 = new JButton("清除");
	
	//Square
	JTextField c4 = new JTextField(5);
	JTextField c5 = new JTextField(5);
	JTextField c6 = new JTextField(5);
	
	
	double line,area2,perimeter2;
	
	
	public GetAreaSquare(){
		
		//square
		p6.add(new JLabel("SQUARE: "));
		p7.add(new JLabel("                     Length: "));
		p7.add(c4);
		p7.add(new JLabel("                  "));
		p7.add(calculate2);
		p7.add(cancel2);
		p9.add(new JLabel("                         The area is :     "));
		p9.add(c5);
		p10.add(new JLabel("                         The perimeter is :     "));
		p10.add(c6);
		
		
		calculate2.addActionListener(new CALCULATE2());
		cancel2.addActionListener(new CANCEL2());
	}
	private class CALCULATE2 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			line = Integer.parseInt(c4.getText());
			area2 = line * line;
			perimeter2 = line * 4;
			
			c5.setText(String.format("%.2f" ,area2));
			c6.setText(String.format("%.2f" ,perimeter2));
		}
	}
	private class CANCEL2 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			c4.setText("");
			c5.setText("");
			c6.setText("");
		}
	}
}
