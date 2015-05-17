import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class GeoCalculate extends JFrame{
	
	public GeoCalculate(){
		GetAreaCircle circle = new GetAreaCircle();
			add(circle.p1);
			add(circle.p2);
			add(circle.p3);
			add(circle.p4);
			add(circle.p5);
		GetAreaSquare square = new GetAreaSquare();
			add(square.p6);
			add(square.p7);
			add(square.p8);
			add(square.p9);
			add(square.p10);
		GetAreaTriangle triangle = new GetAreaTriangle();
			add(triangle.p11);
			add(triangle.p12);
			add(triangle.p13);
			add(triangle.p14);
			add(triangle.p15);
			add(triangle.p16);
	}
	public static void main(String[] args) {
		JFrame frame = new GeoCalculate();
		frame.setLayout(new GridLayout(16,1));
		frame.setTitle("U10316008_GeoCalculate");
		frame.setSize(500, 600);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
