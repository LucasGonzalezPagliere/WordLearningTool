package Package;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import static Package.TheRealShit.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import static Package.BookMark.*;
import static Package.ThemesGUI.*;

public class GUIClass {

	static public JFrame framed;
	static public ImageIcon BKMK;
	static public JLabel WORD;
	public static JEditorPane editorPane;
	private int timesDefClicked = 1;
	static int click = 0;
	static public JLabel lblPic;
	static boolean ClickCheck = true;
	static public JButton DefineButton;
	static public JButton Right;
	static public JButton Left;
	static public JPanel panel;
	static public JButton AddWord;
	static public JButton ListViewButton;
	static public JButton PicBtn;
	static public JButton MiniGame;
	static public JButton BookMark;
	static public JButton BKMKWordsOnly;
	static public JButton btnThemes;

	ThemesGUI ThemeObj = new ThemesGUI();

	public GUIClass() {

		framed = new JFrame("Dictionary");
		framed.getContentPane().setBackground(Color.GRAY);

		framed.setBounds(560, 420, 567, 420);

		framed.setAlwaysOnTop(false);

		framed.setResizable(false);

		framed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framed.getContentPane().setLayout(
				new FormLayout(new ColumnSpec[] {
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"), }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"), }));

		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		framed.getContentPane().add(panel, "2, 2, fill, fill");
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		WORD = new JLabel(Words.get(click));
		WORD.setForeground(Color.BLACK);
		WORD.setHorizontalAlignment(SwingConstants.CENTER);
		WORD.setFont(new Font("Times New Roman", Font.PLAIN, 54));
		panel.add(WORD);

		Left = new JButton("");
		sl_panel.putConstraint(SpringLayout.WEST, Left, 32, SpringLayout.WEST,
				panel);
		sl_panel.putConstraint(SpringLayout.EAST, Left, -435,
				SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, WORD, 36, SpringLayout.EAST,
				Left);
		sl_panel.putConstraint(SpringLayout.NORTH, Left, 10,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, Left, 0, SpringLayout.SOUTH,
				WORD);

		try {
			Image img = ImageIO.read(getClass().getResource(
					"arrow-back-icon.png"));
			Left.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		Left.setOpaque(false);
		Left.setContentAreaFilled(false);
		Left.setBorderPainted(false);

		Left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!(click <= 0)) {
					timesDefClicked = 1;
					click--;
					WORD.setText(Words.get(click));
					WORD.repaint();
					editorPane.setText("");
					editorPane.repaint();

					for (int tt = 0; tt < BKMKWords.size(); tt++) {
						if (Words.get(click) == BKMKWords.get(tt)) {
							lblPic.setVisible(true);
							lblPic.updateUI();
							tt = BKMKWords.size();
						} else {
							lblPic.setVisible(false);

						}
					}

				}
			}
		});
		Left.setBackground(Color.WHITE);
		panel.add(Left);

		Right = new JButton("");
		sl_panel.putConstraint(SpringLayout.NORTH, Right, 0,
				SpringLayout.NORTH, Left);
		sl_panel.putConstraint(SpringLayout.WEST, Right, 419,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, Right, -45,
				SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, Right, 0,
				SpringLayout.SOUTH, WORD);
		Right.setBackground(Color.WHITE);
		Right.setOpaque(false);
		Right.setContentAreaFilled(false);
		Right.setBorderPainted(false);
		Right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (click < Words.size() - 1) {
					timesDefClicked = 1;
					click++;
					WORD.setText(Words.get(click));
					WORD.repaint();
					editorPane.setText("");

					editorPane.repaint();

					for (int tt = 0; tt < BKMKWords.size(); tt++) {
						if (Words.get(click) == BKMKWords.get(tt)) {
							lblPic.setVisible(true);
							lblPic.updateUI();
							tt = BKMKWords.size();
						} else {
							lblPic.setVisible(false);

						}
					}

				}
			}
		});
		panel.add(Right);

		try {
			Image img2 = ImageIO.read(getClass().getResource(
					"arrow-forw-icon.png"));
			Right.setIcon(new ImageIcon(img2));
		} catch (IOException ex) {
		}

		DefineButton = new JButton("Define");
		sl_panel.putConstraint(SpringLayout.NORTH, DefineButton, 25,
				SpringLayout.SOUTH, Left);
		DefineButton.setForeground(Color.BLACK);
		DefineButton.setBackground(new Color(105, 130, 239));
		DefineButton.setContentAreaFilled(false);
		DefineButton.setOpaque(true);
		DefineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				timesDefClicked++;
				System.out.println(timesDefClicked);
				if (timesDefClicked % 2 == 0) {

					editorPane.setText(Definitions.get(click));
					editorPane.repaint();

				}

				else {
					editorPane.setText("");
					editorPane.repaint();
				}

			}
		});
		DefineButton.setFont(new Font("Consolas", Font.BOLD, 16));
		panel.add(DefineButton);

		ListViewButton = new JButton("List View");
		sl_panel.putConstraint(SpringLayout.WEST, ListViewButton, 0,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, DefineButton, 0,
				SpringLayout.WEST, ListViewButton);
		sl_panel.putConstraint(SpringLayout.EAST, DefineButton, 0,
				SpringLayout.EAST, ListViewButton);
		ListViewButton.setForeground(Color.BLACK);
		ListViewButton.addActionListener(new ListGUI());
		ListViewButton.setFont(new Font("Consolas", Font.BOLD, 16));
		ListViewButton.setBackground(new Color(105, 130, 239));
		ListViewButton.setContentAreaFilled(false);
		ListViewButton.setOpaque(true);
		panel.add(ListViewButton);

		AddWord = new JButton("Add Word");
		sl_panel.putConstraint(SpringLayout.WEST, AddWord, 0,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, DefineButton, -13,
				SpringLayout.NORTH, AddWord);
		AddWord.setForeground(Color.BLACK);
		sl_panel.putConstraint(SpringLayout.NORTH, ListViewButton, 13,
				SpringLayout.SOUTH, AddWord);
		sl_panel.putConstraint(SpringLayout.NORTH, AddWord, 181,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, AddWord, -148,
				SpringLayout.SOUTH, panel);
		AddWord.addActionListener(new NewWord());
		AddWord.setBackground(new Color(105, 130, 239));
		AddWord.setContentAreaFilled(false);
		AddWord.setOpaque(true);
		AddWord.setFont(new Font("Consolas", Font.BOLD, 16));
		panel.add(AddWord);

		editorPane = new JEditorPane();
		sl_panel.putConstraint(SpringLayout.EAST, AddWord, -6,
				SpringLayout.WEST, editorPane);
		sl_panel.putConstraint(SpringLayout.EAST, ListViewButton, -6,
				SpringLayout.WEST, editorPane);
		sl_panel.putConstraint(SpringLayout.SOUTH, WORD, -25,
				SpringLayout.NORTH, editorPane);
		sl_panel.putConstraint(SpringLayout.EAST, editorPane, -139,
				SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, editorPane, 112,
				SpringLayout.NORTH, panel);
		editorPane.setFont(new Font("Tahoma", Font.PLAIN, 21));
		editorPane.setBackground(Color.WHITE);
		editorPane.setEditable(false);
		sl_panel.putConstraint(SpringLayout.WEST, editorPane, 126,
				SpringLayout.WEST, panel);
		panel.add(editorPane);

		PicBtn = new JButton("Picture");
		sl_panel.putConstraint(SpringLayout.WEST, PicBtn, 0, SpringLayout.WEST,
				panel);
		sl_panel.putConstraint(SpringLayout.EAST, PicBtn, -6,
				SpringLayout.WEST, editorPane);
		sl_panel.putConstraint(SpringLayout.SOUTH, editorPane, 0,
				SpringLayout.SOUTH, PicBtn);
		PicBtn.setForeground(Color.BLACK);
		sl_panel.putConstraint(SpringLayout.SOUTH, ListViewButton, -13,
				SpringLayout.NORTH, PicBtn);
		sl_panel.putConstraint(SpringLayout.NORTH, PicBtn, 319,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, PicBtn, -10,
				SpringLayout.SOUTH, panel);
		PicBtn.addActionListener(new WebPicOpener());
		PicBtn.setFont(new Font("Consolas", Font.BOLD, 16));
		PicBtn.setBackground(new Color(105, 130, 239));
		PicBtn.setContentAreaFilled(false);
		PicBtn.setOpaque(true);
		panel.add(PicBtn);

		MiniGame = new JButton("Learn ");
		sl_panel.putConstraint(SpringLayout.NORTH, MiniGame, 25,
				SpringLayout.SOUTH, Right);
		sl_panel.putConstraint(SpringLayout.WEST, MiniGame, 9,
				SpringLayout.EAST, editorPane);
		sl_panel.putConstraint(SpringLayout.EAST, MiniGame, -10,
				SpringLayout.EAST, panel);
		MiniGame.setForeground(Color.BLACK);
		MiniGame.addActionListener(new MiniGame());
		MiniGame.setFont(new Font("Consolas", Font.BOLD, 16));
		MiniGame.setBackground(new Color(105, 130, 239));
		MiniGame.setContentAreaFilled(false);
		MiniGame.setOpaque(true);
		panel.add(MiniGame);

		BookMark = new JButton("BookMark");
		sl_panel.putConstraint(SpringLayout.SOUTH, MiniGame, -13,
				SpringLayout.NORTH, BookMark);
		sl_panel.putConstraint(SpringLayout.WEST, BookMark, 9,
				SpringLayout.EAST, editorPane);
		sl_panel.putConstraint(SpringLayout.EAST, BookMark, -10,
				SpringLayout.EAST, panel);
		BookMark.setForeground(Color.BLACK);
		sl_panel.putConstraint(SpringLayout.NORTH, BookMark, 0,
				SpringLayout.NORTH, AddWord);
		sl_panel.putConstraint(SpringLayout.SOUTH, BookMark, 0,
				SpringLayout.SOUTH, AddWord);
		BookMark.addActionListener(new BookMark());
		BookMark.setBackground(new Color(105, 130, 239));
		BookMark.setContentAreaFilled(false);
		BookMark.setOpaque(true);
		BookMark.setFont(new Font("Consolas", Font.BOLD, 16));
		panel.add(BookMark);

		lblPic = new JLabel("Pic");
		sl_panel.putConstraint(SpringLayout.NORTH, lblPic, 24,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblPic, 381,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblPic, -32,
				SpringLayout.NORTH, editorPane);
		sl_panel.putConstraint(SpringLayout.EAST, lblPic, -6,
				SpringLayout.WEST, Right);
		sl_panel.putConstraint(SpringLayout.EAST, WORD, -6, SpringLayout.WEST,
				lblPic);
		panel.add(lblPic);

		BKMK = new ImageIcon(getClass().getResource("Bookmark-icon.png"));

		lblPic.setIcon(BKMK);

		BKMKWordsOnly = new JButton("<html>BookMarked<br/>Words</html>");
		sl_panel.putConstraint(SpringLayout.WEST, BKMKWordsOnly, 9,
				SpringLayout.EAST, editorPane);
		sl_panel.putConstraint(SpringLayout.EAST, BKMKWordsOnly, -10,
				SpringLayout.EAST, panel);
		BKMKWordsOnly.setForeground(Color.BLACK);
		sl_panel.putConstraint(SpringLayout.NORTH, BKMKWordsOnly, 0,
				SpringLayout.NORTH, ListViewButton);
		sl_panel.putConstraint(SpringLayout.SOUTH, BKMKWordsOnly, 0,
				SpringLayout.SOUTH, ListViewButton);
		;
		BKMKWordsOnly.setBackground(new Color(105, 130, 239));
		BKMKWordsOnly.setContentAreaFilled(false);
		BKMKWordsOnly.setOpaque(true);

		BKMKWordsOnly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (BKMKWords.size() == 0) {
					JOptionPane.showMessageDialog(null,
							"There are no bookmarked words");
					Words = WordsBackup;
					Definitions = DefinitionsBackup;
				} else {
					if (ClickCheck == true) {
						click = 0;
						Words = BKMKWords;
						Definitions = BKMKDefinitions;
						lblPic.setVisible(true);
						WORD.setText(Words.get(0));
						ClickCheck = false;
					} else if (ClickCheck == false) {
						click = 0;
						Words = WordsBackup;
						Definitions = DefinitionsBackup;
						WORD.setText(Words.get(0));
						lblPic.setVisible(Words.get(0) == BKMKWords.get(0));
						ClickCheck = true;
						System.out.println("Words Backed up");
					}

				}
			}
		});
		BKMKWordsOnly.setFont(new Font("Consolas", Font.BOLD, 16));
		panel.add(BKMKWordsOnly);

		btnThemes = new JButton("Themes");
		btnThemes.addActionListener(new ThemesGUI());

		sl_panel.putConstraint(SpringLayout.NORTH, btnThemes, 0,
				SpringLayout.NORTH, PicBtn);
		sl_panel.putConstraint(SpringLayout.WEST, btnThemes, 9,
				SpringLayout.EAST, editorPane);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnThemes, 0,
				SpringLayout.SOUTH, editorPane);
		sl_panel.putConstraint(SpringLayout.EAST, btnThemes, -10,
				SpringLayout.EAST, panel);
		btnThemes.setOpaque(true);
		btnThemes.setForeground(Color.BLACK);
		btnThemes.setFont(new Font("Consolas", Font.BOLD, 16));
		btnThemes.setContentAreaFilled(false);
		btnThemes.setBackground(new Color(105, 130, 239));
		btnThemes.setContentAreaFilled(false);
		btnThemes.setOpaque(true);
		panel.add(btnThemes);

		lblPic.setVisible(false);

		ImageIcon i = new ImageIcon(getClass().getResource("Letters-icon.png"));

		framed.setIconImage(i.getImage());

		if (ThemeCheck == 1) {
			ThemeObj.christmasTheme();
		} else if (ThemeCheck == 2) {
			ThemeObj.bandYTheme();
		} else if (ThemeCheck == 3) {
			ThemeObj.hellTheme();
		} else if (ThemeCheck == 4) {
			ThemeObj.heavenTheme();
		} else if (ThemeCheck == 5) {
			ThemeObj.americaTheme();
		}

		framed.setVisible(true);

	}

	public Color getDefineButtonBackground() {
		return DefineButton.getBackground();
	}

	public void setDefineButtonBackground(Color background) {
		DefineButton.setBackground(background);
	}
}