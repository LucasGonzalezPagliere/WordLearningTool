package Package;

import static Package.GUIClass.*;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static Package.TheRealShit.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewWord implements ActionListener {

	static public JFrame NewWordGetter;

	String InWord;

	String InDef;
	private int forCount = 0;
	private JTextField NewWordField;
	private JEditorPane DefinitionField;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void actionPerformed(ActionEvent arg0) {

		if (ClickCheck == false) {
			framed.dispose();
			JOptionPane.showMessageDialog(null,
					"Please go back to all words to add a new word");
			GUIClass launcher = new GUIClass();
		} else {

			framed.dispose();

			NewWordGetter = new JFrame("Dictionary");
			NewWordGetter.getContentPane().setBackground(Color.GRAY);
			SpringLayout springLayout = new SpringLayout();
			NewWordGetter.getContentPane().setLayout(springLayout);

			JPanel panel = new JPanel();
			springLayout.putConstraint(SpringLayout.NORTH, panel, 10,
					SpringLayout.NORTH, NewWordGetter.getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, panel, 10,
					SpringLayout.WEST, NewWordGetter.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, panel, 277,
					SpringLayout.NORTH, NewWordGetter.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, panel, 284,
					SpringLayout.WEST, NewWordGetter.getContentPane());
			panel.setBackground(Color.LIGHT_GRAY);
			NewWordGetter.getContentPane().add(panel);
			SpringLayout sl_panel = new SpringLayout();
			panel.setLayout(sl_panel);

			JLabel lblNewWord = new JLabel("New Word:");
			lblNewWord.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel.add(lblNewWord);

			JLabel lblDefinition = new JLabel("Definition:");
			sl_panel.putConstraint(SpringLayout.NORTH, lblDefinition, 124,
					SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.WEST, lblDefinition, 10,
					SpringLayout.WEST, panel);
			sl_panel.putConstraint(SpringLayout.WEST, lblNewWord, 0,
					SpringLayout.WEST, lblDefinition);
			sl_panel.putConstraint(SpringLayout.SOUTH, lblNewWord, -25,
					SpringLayout.NORTH, lblDefinition);
			lblDefinition.setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel.add(lblDefinition);

			DefinitionField = new JEditorPane();
			sl_panel.putConstraint(SpringLayout.NORTH, DefinitionField, 0,
					SpringLayout.NORTH, lblDefinition);
			sl_panel.putConstraint(SpringLayout.WEST, DefinitionField, 12,
					SpringLayout.EAST, lblDefinition);
			sl_panel.putConstraint(SpringLayout.SOUTH, DefinitionField, -73,
					SpringLayout.SOUTH, panel);
			sl_panel.putConstraint(SpringLayout.EAST, DefinitionField, -10,
					SpringLayout.EAST, panel);
			DefinitionField.setBackground(Color.WHITE);
			panel.add(DefinitionField);

			NewWordField = new JTextField();
			sl_panel.putConstraint(SpringLayout.NORTH, NewWordField, 2,
					SpringLayout.NORTH, lblNewWord);
			sl_panel.putConstraint(SpringLayout.WEST, NewWordField, 96,
					SpringLayout.WEST, panel);
			sl_panel.putConstraint(SpringLayout.EAST, NewWordField, 0,
					SpringLayout.EAST, DefinitionField);
			panel.add(NewWordField);
			NewWordField.setColumns(10);

			JButton btnAddWord = new JButton("Add Word");
			btnAddWord.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					InWord = NewWordField.getText();
					InDef = DefinitionField.getText();

					for (int run = 0; run < Words.size(); run++) {

						forCount++;

						if (InWord.compareToIgnoreCase(Words.get(run)) < 0) {
							Words.add(run, InWord);
							Definitions.add(run, InDef);
							NewWordGetter.dispose();
							run = Words.size();
							GUIClass launcher = new GUIClass();
						}
						if (forCount == Words.size()) {
							Words.add(InWord);
							Definitions.add(InDef);
							NewWordGetter.dispose();
							run = Words.size();
							GUIClass launcher = new GUIClass();
						}

					}

					// GUIClass launcher = new GUIClass();

				}
			});
			sl_panel.putConstraint(SpringLayout.WEST, btnAddWord, 29,
					SpringLayout.WEST, panel);
			sl_panel.putConstraint(SpringLayout.SOUTH, btnAddWord, -10,
					SpringLayout.SOUTH, panel);
			panel.add(btnAddWord);

			JButton btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					NewWordGetter.dispose();
					GUIClass launcher = new GUIClass();
				}
			});
			sl_panel.putConstraint(SpringLayout.NORTH, btnCancel, 0,
					SpringLayout.NORTH, btnAddWord);
			sl_panel.putConstraint(SpringLayout.EAST, btnCancel, -49,
					SpringLayout.EAST, panel);
			panel.add(btnCancel);

			JLabel LabelDescription1 = new JLabel(
					"To add a new word, simply input the New Word and ");
			LabelDescription1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			sl_panel.putConstraint(SpringLayout.NORTH, LabelDescription1, 10,
					SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.WEST, LabelDescription1, 10,
					SpringLayout.WEST, panel);
			sl_panel.putConstraint(SpringLayout.SOUTH, LabelDescription1, -55,
					SpringLayout.NORTH, lblNewWord);
			sl_panel.putConstraint(SpringLayout.EAST, LabelDescription1, 0,
					SpringLayout.EAST, DefinitionField);
			panel.add(LabelDescription1);

			JLabel LabelDescription2 = new JLabel(
					"the definition right under it. When you are done, ");
			LabelDescription2.setFont(new Font("Tahoma", Font.PLAIN, 10));
			sl_panel.putConstraint(SpringLayout.NORTH, LabelDescription2, 4,
					SpringLayout.SOUTH, LabelDescription1);
			sl_panel.putConstraint(SpringLayout.WEST, LabelDescription2, 0,
					SpringLayout.WEST, lblNewWord);
			sl_panel.putConstraint(SpringLayout.EAST, LabelDescription2, 0,
					SpringLayout.EAST, DefinitionField);
			LabelDescription2.setToolTipText("");
			panel.add(LabelDescription2);

			JLabel LabelDescription3 = new JLabel("click 'Add Word'.");
			LabelDescription3.setFont(new Font("Tahoma", Font.PLAIN, 10));
			sl_panel.putConstraint(SpringLayout.NORTH, LabelDescription3, 4,
					SpringLayout.SOUTH, LabelDescription2);
			sl_panel.putConstraint(SpringLayout.WEST, LabelDescription3, 0,
					SpringLayout.WEST, lblNewWord);
			panel.add(LabelDescription3);

			NewWordGetter.setBounds(560, 420, 300, 316);

			NewWordGetter.setAlwaysOnTop(true);

			NewWordGetter.setResizable(false);

			NewWordGetter.setVisible(true);

		}

	}
}
