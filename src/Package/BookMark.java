package Package;

import java.awt.event.ActionEvent;
import static Package.GUIClass.*;
import java.awt.event.ActionListener;
import static Package.TheRealShit.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.SpringLayout;
import javax.swing.JLabel;

public class BookMark implements ActionListener {

	int cnt = 0;
	public static ArrayList<String> BKMKWords = new ArrayList<String>();
	public static ArrayList<String> BKMKDefinitions = new ArrayList<String>();

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {

		lblPic.repaint();
		lblPic.updateUI();

		// BKMKWords.add("");

		if (BKMKWords.size() == 0) {
			BKMKWords.add(Words.get(click));
			BKMKDefinitions.add(Definitions.get(click));
			lblPic.setVisible(true);

		}

		else {

			for (int y = 0; y < BKMKWords.size(); y++) {

				cnt++;
				System.out.println(cnt);
				if ((Words.get(click) == BKMKWords.get(y))) {
					BKMKWords.remove(Words.get(click));
					BKMKDefinitions.remove(Definitions.get(click));
					y = BKMKWords.size();
					System.out.println("if");
					lblPic.setVisible(false);

				} else if (cnt >= BKMKWords.size()) {
					BKMKWords.add(Words.get(click));
					BKMKDefinitions.add(Definitions.get(click));
					y = BKMKWords.size();
					cnt = 0;
					System.out.println("else if");
					lblPic.setVisible(true);
				}

			

			}

		}

		

		System.out.println(BKMKWords);

	}

	public void addWord() {
		BKMKWords.add(Words.get(click));

	}
}
