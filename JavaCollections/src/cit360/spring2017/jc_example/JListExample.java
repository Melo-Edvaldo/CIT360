package cit360.spring2017.jc_example;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListExample extends JFrame {

	private static final long serialVersionUID = 1L;
	JList<?> list;
	String[] listColorNames = { "Black", "Blue", "Gray", "Green",
			"Pink", "Red", "White", "Yellow" };
	Color[] listColorValues = { Color.BLACK, Color.BLUE, Color.GRAY,
			Color.GREEN, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
	Container contentpane;
	public JListExample() {
		super("Click in Color Name to Change Background");
		contentpane = getContentPane();
		contentpane.setLayout(new FlowLayout());
		list = new JList<Object>(listColorNames);
		list.setSelectedIndex(0);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		contentpane.add(new JScrollPane(list));
		list.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent e) {
				contentpane.setBackground(listColorValues[list
						.getSelectedIndex()]);
			}
		});
		setSize(450, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		JListExample test = new JListExample();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}