package Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpringLayout;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import static Package.TheRealShit.*;
import java.awt.Font;

public class MiniGame implements ActionListener {

	public static ArrayList<String> IncorrectWords = new ArrayList<String>();
	static JLabel lblDynamic;
	public JFrame Miniframe;
	Random rand = new Random();
	int theIndex = 0;
	int points = 0;
	int theIndexD = 0;

	int CheckIfFini = 0;

	ArrayList<Integer> RandomNumber = new ArrayList<Integer>();

	/**
	 * @wbp.parser.entryPoint
	 */
	public void actionPerformed(ActionEvent arg0) {

		System.out.println(Words);

		for (int i = 0; i < Words.size(); i++) {
			RandomNumber.add(i);
		}

		Collections.shuffle(RandomNumber);
		System.out.println(RandomNumber);

		Miniframe = new JFrame("MiniGame");

		Miniframe.setBounds(400, 200, 700, 170);

		Miniframe.setAlwaysOnTop(true);

		Miniframe.setResizable(false);

		Miniframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		Miniframe.getContentPane().setLayout(springLayout);

		SpinnerModel model = new SpinnerListModel(Definitions);

		final JSpinner spinner = new JSpinner(model);
		springLayout.putConstraint(SpringLayout.NORTH, spinner, 57,
				SpringLayout.NORTH, Miniframe.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, spinner, 96,
				SpringLayout.WEST, Miniframe.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, spinner, -48,
				SpringLayout.SOUTH, Miniframe.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, spinner, -10,
				SpringLayout.EAST, Miniframe.getContentPane());

		spinner.setFocusable(false);

		Miniframe.getContentPane().add(spinner);

		JLabel lblWord = new JLabel("Word:");
		springLayout.putConstraint(SpringLayout.WEST, lblWord, 10,
				SpringLayout.WEST, Miniframe.getContentPane());
		lblWord.setFont(new Font("Consolas", Font.BOLD, 16));
		Miniframe.getContentPane().add(lblWord);

		JLabel lblDefinition = new JLabel("Definition:");
		springLayout.putConstraint(SpringLayout.NORTH, lblDefinition, 2,
				SpringLayout.NORTH, spinner);
		springLayout.putConstraint(SpringLayout.WEST, lblDefinition, 10,
				SpringLayout.WEST, Miniframe.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblDefinition, -6,
				SpringLayout.WEST, spinner);
		lblDefinition.setFont(new Font("Consolas", Font.BOLD, 13));
		Miniframe.getContentPane().add(lblDefinition);

		lblDynamic = new JLabel();
		springLayout.putConstraint(SpringLayout.NORTH, lblDynamic, 13,
				SpringLayout.NORTH, Miniframe.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblWord, 1,
				SpringLayout.NORTH, lblDynamic);
		lblDynamic.setFont(new Font("Consolas", Font.BOLD, 26));
		springLayout.putConstraint(SpringLayout.WEST, lblDynamic, 0,
				SpringLayout.WEST, spinner);
		Miniframe.getContentPane().add(lblDynamic);

		lblDynamic.setText(Words.get(RandomNumber.get(0)));

		JButton NextBtn = new JButton("Next");
		springLayout.putConstraint(SpringLayout.WEST, NextBtn, 140,
				SpringLayout.WEST, Miniframe.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, NextBtn, -10,
				SpringLayout.SOUTH, Miniframe.getContentPane());
		NextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				CheckIfFini++;

				for (int e = 0; e < Words.size(); e++) {

					if (lblDynamic.getText() == Words.get(e)) {
						theIndex = e;
						e = Words.size();
					}
				}
				for (int T = 0; T < Definitions.size(); T++) {

					if (spinner.getValue().equals(Definitions.get(T))) {
						theIndexD = T;
						T = Definitions.size();
					}

				}

				if (theIndex == theIndexD) {
					points++;

				} else if (theIndex != theIndexD) {

					IncorrectWords.add(Words.get(theIndex));

				}

				if (CheckIfFini == Words.size()) {
					JOptionPane.showMessageDialog(null, "You got " + points
							+ " right out of " + Words.size());
					JOptionPane.showMessageDialog(null,
							"These are the ones you got wrong:" + "\n"
									+ IncorrectWords);
					CheckIfFini = 0;
					IncorrectWords.clear();
					RandomNumber.clear();
					Miniframe.dispose();
				}
				lblDynamic.setText(Words.get(RandomNumber.get(CheckIfFini)));
				lblDynamic.repaint();
			}

		});

		Miniframe.getContentPane().add(NextBtn);

		JButton CancelBtn = new JButton("Cancel");
		springLayout.putConstraint(SpringLayout.NORTH, CancelBtn, 0,
				SpringLayout.NORTH, NextBtn);
		springLayout.putConstraint(SpringLayout.EAST, CancelBtn, -104,
				SpringLayout.EAST, Miniframe.getContentPane());
		CancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CheckIfFini = 0;
				IncorrectWords.clear();
				RandomNumber.clear();
				Miniframe.dispose();
			}
		});
		Miniframe.getContentPane().add(CancelBtn);

		Miniframe.setVisible(true);

	}

}
