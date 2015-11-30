import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ce63 extends JFrame{


	
	public Ce63(){
		JTextField[] text = new JTextField[4];	
		text[0] = new JTextField();
		text[1] = new JTextField();
		text[2] = new JTextField();
		text[3] = new JTextField();
		setLayout(new GridLayout(2,2));
		
		add(text[0]);
		add(text[1]);
		
		JFrame jp = new JFrame();
		jp.setLayout(new BorderLayout());
		
		add(text[2]);
		
		JFrame jp2 = new JFrame();
		jp2.setLayout(new FlowLayout());
	
		add(text[3]);
		
		setVisible(true);
		setSize(new Dimension(500,500));
		}
}