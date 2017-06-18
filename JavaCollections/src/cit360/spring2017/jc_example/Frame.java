package cit360.spring2017.jc_example;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	public static void main(String args[]) {
		new Frame();
	}
	Frame() {
		super("Frame Name");
		JLabel HelloWorld = new JLabel("Hello World!!!");
		HelloWorld.setHorizontalAlignment(JLabel.CENTER); //JLabel alignment
		add(HelloWorld);
		this.setSize(300, 150); //length and width
		setVisible(true); //if true, open window
						  //if false, window will not open
	}
}