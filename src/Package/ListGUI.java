package Package;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static Package.TheRealShit.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;

public class ListGUI implements ActionListener {

	public String TheSetter = "";
	public String TheDSetter = "";
	private JFrame ListViewGUI;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void actionPerformed(ActionEvent arg0) {

		System.out.println(Words);

		ListViewGUI = new JFrame("Dictionary List");
		ListViewGUI.getContentPane().setBackground(Color.GRAY);
		SpringLayout springLayout = new SpringLayout();
		ListViewGUI.getContentPane().setLayout(springLayout);
		ListViewGUI.setBounds(0, 0, 610, 636);

		JTextArea textArea = new JTextArea(10, 20);

		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);

		JScrollPane scoller = new JScrollPane(textArea,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		springLayout.putConstraint(SpringLayout.NORTH, scoller, 63,
				SpringLayout.NORTH, ListViewGUI.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scoller, 10,
				SpringLayout.WEST, ListViewGUI.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scoller, -10,
				SpringLayout.SOUTH, ListViewGUI.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scoller, 584,
				SpringLayout.WEST, ListViewGUI.getContentPane());

		scoller.setWheelScrollingEnabled(true);

		ListViewGUI.getContentPane().add(scoller);

		JLabel label = new JLabel("Word List");
		springLayout.putConstraint(SpringLayout.WEST, label, 10,
				SpringLayout.WEST, ListViewGUI.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, label, -6,
				SpringLayout.NORTH, scoller);
		label.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 30));
		ListViewGUI.getContentPane().add(label);

		for (int p = 0; p < Words.size(); p++) {

			TheDSetter += Words.get(p) + " - " + Definitions.get(p) + "\n"
					+ "\n";

		}

		textArea.setText(TheDSetter);

		textArea.setCaretPosition(0);

		TheDSetter = "";

		ListViewGUI.setVisible(true);

	}

}
