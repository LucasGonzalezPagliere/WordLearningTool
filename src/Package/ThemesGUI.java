package Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static Package.GUIClass.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.Color;
import java.io.IOException;

public class ThemesGUI implements ActionListener {

	static public int ThemeCheck = 0;
	static public ImageIcon BKMK2;
	static public ImageIcon BKMK3;
	static public ImageIcon BKMK4;
	JFrame frmSelectTheme;

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {

		frmSelectTheme = new JFrame("Select Themes");
		frmSelectTheme.setTitle("Select Theme");

		BKMK2 = new ImageIcon(getClass().getResource("StarBmark.png"));
		BKMK3 = new ImageIcon(getClass().getResource("bookmark-32.png"));
		BKMK4 = new ImageIcon(getClass().getResource("star-7-32.png"));
		frmSelectTheme.setBounds(400, 200, 486, 540);

		frmSelectTheme.setAlwaysOnTop(true);

		frmSelectTheme.setResizable(false);

		frmSelectTheme.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmSelectTheme.getContentPane().setLayout(springLayout);

		JButton btnChristmasTheme = new JButton("Christmas Theme");

		btnChristmasTheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ThemeCheck = 1;
				frmSelectTheme.dispose();
				christmasTheme();

			}
		});

		// });
		btnChristmasTheme.setBackground(new Color(0, 255, 0));
		btnChristmasTheme.setContentAreaFilled(false);
		btnChristmasTheme.setOpaque(true);
		btnChristmasTheme.setFont(new Font("Brush Script MT", Font.BOLD, 31));
		btnChristmasTheme.setForeground(Color.RED);
		springLayout.putConstraint(SpringLayout.WEST, btnChristmasTheme, 0,
				SpringLayout.WEST, frmSelectTheme.getContentPane());
		frmSelectTheme.getContentPane().add(btnChristmasTheme);

		JButton btnOriginalTheme = new JButton("Original Theme");
		btnOriginalTheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {

				ThemeCheck = 0;

				framed.getContentPane().setBackground(Color.GRAY);
				panel.setBackground(Color.GRAY);

				WORD.setForeground(Color.WHITE);
				WORD.setFont(new Font("Times New Roman", Font.PLAIN, 54));

				DefineButton.setForeground(Color.WHITE);
				DefineButton.setBackground(new Color(105, 130, 239));
				DefineButton.setFont(new Font("Consolas", Font.BOLD, 16));

				ListViewButton.setForeground(Color.WHITE);
				ListViewButton.setBackground(new Color(105, 130, 239));
				ListViewButton.setFont(new Font("Consolas", Font.BOLD, 16));

				AddWord.setForeground(Color.WHITE);
				AddWord.setBackground(new Color(105, 130, 239));
				AddWord.setFont(new Font("Consolas", Font.BOLD, 16));

				PicBtn.setForeground(Color.WHITE);
				PicBtn.setBackground(new Color(105, 130, 239));
				PicBtn.setFont(new Font("Consolas", Font.BOLD, 16));

				MiniGame.setForeground(Color.WHITE);
				MiniGame.setBackground(new Color(105, 130, 239));
				MiniGame.setFont(new Font("Consolas", Font.BOLD, 16));

				BookMark.setForeground(Color.WHITE);
				BookMark.setBackground(new Color(105, 130, 239));
				BookMark.setFont(new Font("Consolas", Font.BOLD, 16));

				BKMKWordsOnly.setForeground(Color.WHITE);
				BKMKWordsOnly.setBackground(new Color(105, 130, 239));
				BKMKWordsOnly.setFont(new Font("Consolas", Font.BOLD, 16));

				btnThemes.setForeground(Color.WHITE);
				btnThemes.setBackground(new Color(105, 130, 239));
				btnThemes.setFont(new Font("Consolas", Font.BOLD, 16));

				editorPane.setBackground(Color.white);
				editorPane.setForeground(Color.BLACK);

				frmSelectTheme.dispose();

				lblPic.setIcon(BKMK);

				try {
					Image img = ImageIO.read(getClass().getResource(
							"arrow-back-icon.png"));
					Left.setIcon(new ImageIcon(img));
				} catch (IOException ex) {
				}

				try {
					Image img2 = ImageIO.read(getClass().getResource(
							"arrow-forw-icon.png"));
					Right.setIcon(new ImageIcon(img2));
				} catch (IOException ex) {

				}

			}
		});

		btnOriginalTheme.setForeground(Color.WHITE);
		btnOriginalTheme.setBackground(new Color(105, 130, 239));
		btnOriginalTheme.setContentAreaFilled(false);
		btnOriginalTheme.setOpaque(true);
		btnOriginalTheme.setFont(new Font("Consolas", Font.BOLD, 25));
		springLayout.putConstraint(SpringLayout.NORTH, btnChristmasTheme, 6,
				SpringLayout.SOUTH, btnOriginalTheme);
		springLayout.putConstraint(SpringLayout.EAST, btnChristmasTheme, 0,
				SpringLayout.EAST, btnOriginalTheme);
		springLayout.putConstraint(SpringLayout.NORTH, btnOriginalTheme, 0,
				SpringLayout.NORTH, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnOriginalTheme, 0,
				SpringLayout.WEST, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnOriginalTheme, 80,
				SpringLayout.NORTH, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnOriginalTheme, 480,
				SpringLayout.WEST, frmSelectTheme.getContentPane());
		frmSelectTheme.getContentPane().add(btnOriginalTheme);

		JButton btnBlackAndYellow = new JButton("Black and Yellow");
		btnBlackAndYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ThemeCheck = 2;
				frmSelectTheme.dispose();
				bandYTheme();

			}
		});

		btnBlackAndYellow.setBackground(new Color(255, 255, 0));
		btnBlackAndYellow.setContentAreaFilled(false);
		btnBlackAndYellow.setOpaque(true);
		btnBlackAndYellow.setFont(new Font("AR BONNIE", Font.BOLD, 29));
		springLayout.putConstraint(SpringLayout.NORTH, btnBlackAndYellow, 168,
				SpringLayout.NORTH, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnBlackAndYellow, 0,
				SpringLayout.WEST, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnBlackAndYellow, 0,
				SpringLayout.EAST, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnChristmasTheme, -6,
				SpringLayout.NORTH, btnBlackAndYellow);
		frmSelectTheme.getContentPane().add(btnBlackAndYellow);

		JButton btnHellTheme = new JButton("Hell Theme");
		btnHellTheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ThemeCheck = 3;
				frmSelectTheme.dispose();
				hellTheme();

			}
		});
		btnHellTheme.setContentAreaFilled(false);
		btnHellTheme.setOpaque(true);
		btnHellTheme.setForeground(new Color(255, 0, 0));
		btnHellTheme.setBackground(new Color(0, 0, 0));
		btnHellTheme.setFont(new Font("Chiller", Font.BOLD, 35));
		springLayout.putConstraint(SpringLayout.WEST, btnHellTheme, 0,
				SpringLayout.WEST, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnHellTheme, 0,
				SpringLayout.EAST, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnBlackAndYellow, -6,
				SpringLayout.NORTH, btnHellTheme);
		springLayout.putConstraint(SpringLayout.NORTH, btnHellTheme, 254,
				SpringLayout.NORTH, frmSelectTheme.getContentPane());
		frmSelectTheme.getContentPane().add(btnHellTheme);

		JButton btnHeavenTheme = new JButton("Heaven Theme");
		btnHeavenTheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				heavenTheme();
				ThemeCheck = 4;
				frmSelectTheme.dispose();

			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnHeavenTheme, 340,
				SpringLayout.NORTH, frmSelectTheme.getContentPane());
		btnHeavenTheme.setContentAreaFilled(false);
		btnHeavenTheme.setOpaque(true);
		btnHeavenTheme.setForeground(new Color(255, 204, 0));
		btnHeavenTheme.setBackground(Color.LIGHT_GRAY);
		btnHeavenTheme.setFont(new Font("Ancestory SF", Font.BOLD, 33));
		springLayout.putConstraint(SpringLayout.WEST, btnHeavenTheme, 0,
				SpringLayout.WEST, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnHeavenTheme, 0,
				SpringLayout.EAST, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnHellTheme, -6,
				SpringLayout.NORTH, btnHeavenTheme);
		frmSelectTheme.getContentPane().add(btnHeavenTheme);

		JButton btnWoodenTheme = new JButton("America Theme");

		btnWoodenTheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ThemeCheck = 5;
				americaTheme();
				frmSelectTheme.dispose();

			}
		});
		btnWoodenTheme.setForeground(new Color(0, 40, 104));
		btnWoodenTheme.setBackground(new Color(250, 0, 0));
		springLayout.putConstraint(SpringLayout.SOUTH, btnHeavenTheme, -6,
				SpringLayout.NORTH, btnWoodenTheme);
		springLayout.putConstraint(SpringLayout.EAST, btnWoodenTheme, 0,
				SpringLayout.EAST, btnChristmasTheme);

		btnWoodenTheme.setContentAreaFilled(false);
		btnWoodenTheme.setOpaque(true);

		btnWoodenTheme.setFont(new Font("Impact", Font.PLAIN, 27));
		springLayout.putConstraint(SpringLayout.WEST, btnWoodenTheme, 0,
				SpringLayout.WEST, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnWoodenTheme, 426,
				SpringLayout.NORTH, frmSelectTheme.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnWoodenTheme, -10,
				SpringLayout.SOUTH, frmSelectTheme.getContentPane());

		frmSelectTheme.getContentPane().add(btnWoodenTheme);

		frmSelectTheme.setVisible(true);

	}

	public void christmasTheme() {

		framed.getContentPane().setBackground(Color.LIGHT_GRAY);
		panel.setBackground(Color.LIGHT_GRAY);

		WORD.setForeground(Color.WHITE);
		WORD.setFont(new Font("Brush Script MT", Font.PLAIN, 54));

		DefineButton.setForeground(Color.WHITE);
		DefineButton.setBackground(Color.RED);
		DefineButton.setFont(new Font("Brush Script MT", Font.BOLD, 16));

		ListViewButton.setForeground(Color.WHITE);
		ListViewButton.setBackground(Color.RED);
		ListViewButton.setFont(new Font("Brush Script MT", Font.BOLD, 16));

		AddWord.setForeground(Color.WHITE);
		AddWord.setBackground(new Color(0, 255, 0));
		AddWord.setFont(new Font("Brush Script MT", Font.BOLD, 16));

		PicBtn.setForeground(Color.WHITE);
		PicBtn.setBackground(new Color(0, 255, 0));
		PicBtn.setFont(new Font("Brush Script MT", Font.BOLD, 16));

		MiniGame.setForeground(Color.WHITE);
		MiniGame.setBackground(new Color(0, 255, 0));
		MiniGame.setFont(new Font("Brush Script MT", Font.BOLD, 16));

		BookMark.setForeground(Color.WHITE);
		BookMark.setBackground(Color.RED);
		BookMark.setFont(new Font("Brush Script MT", Font.BOLD, 16));

		BKMKWordsOnly.setForeground(Color.WHITE);
		BKMKWordsOnly.setBackground(new Color(0, 255, 0));
		BKMKWordsOnly.setFont(new Font("Brush Script MT", Font.BOLD, 16));

		btnThemes.setForeground(Color.WHITE);
		btnThemes.setBackground(Color.RED);
		btnThemes.setFont(new Font("Brush Script MT", Font.BOLD, 16));
		editorPane.setBackground(Color.WHITE);
		editorPane.setForeground(Color.BLACK);

		lblPic.setIcon(BKMK2);

		try {
			Image img = ImageIO.read(getClass().getResource("TreeLeft.png"));
			Left.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		try {
			Image img2 = ImageIO.read(getClass().getResource("TreeRight.png"));
			Right.setIcon(new ImageIcon(img2));
		} catch (IOException ex) {
		}

	}

	public void bandYTheme() {

		framed.getContentPane().setBackground(Color.BLACK);
		panel.setBackground(Color.BLACK);

		WORD.setForeground(Color.YELLOW);
		WORD.setFont(new Font("AR BONNIE", Font.PLAIN, 54));

		DefineButton.setForeground(Color.BLACK);
		DefineButton.setBackground(Color.YELLOW);
		DefineButton.setFont(new Font("AR BONNIE", Font.BOLD, 16));

		ListViewButton.setForeground(Color.BLACK);
		ListViewButton.setBackground(Color.YELLOW);
		ListViewButton.setFont(new Font("AR BONNIE", Font.BOLD, 16));

		AddWord.setForeground(Color.BLACK);
		AddWord.setBackground(Color.YELLOW);
		AddWord.setFont(new Font("AR BONNIE", Font.BOLD, 16));

		PicBtn.setForeground(Color.BLACK);
		PicBtn.setBackground(Color.YELLOW);
		PicBtn.setFont(new Font("AR BONNIE", Font.BOLD, 16));

		MiniGame.setForeground(Color.BLACK);
		MiniGame.setBackground(Color.YELLOW);
		MiniGame.setFont(new Font("AR BONNIE", Font.BOLD, 16));

		BookMark.setForeground(Color.BLACK);
		BookMark.setBackground(Color.YELLOW);
		BookMark.setFont(new Font("AR BONNIE", Font.BOLD, 16));

		BKMKWordsOnly.setForeground(Color.BLACK);
		BKMKWordsOnly.setBackground(Color.YELLOW);
		BKMKWordsOnly.setFont(new Font("AR BONNIE", Font.BOLD, 16));

		btnThemes.setForeground(Color.BLACK);
		btnThemes.setBackground(Color.YELLOW);
		btnThemes.setFont(new Font("AR BONNIE", Font.BOLD, 16));

		editorPane.setBackground(Color.YELLOW);
		editorPane.setForeground(Color.BLACK);

		lblPic.setIcon(BKMK3);
		try {
			Image img = ImageIO.read(getClass().getResource("BANDYLEFT.png"));
			Left.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		try {
			Image img2 = ImageIO.read(getClass().getResource("BANDYRIGHT.png"));
			Right.setIcon(new ImageIcon(img2));
		} catch (IOException ex) {

		}

	}

	public void hellTheme() {

		framed.getContentPane().setBackground(Color.RED);
		panel.setBackground(Color.RED);

		WORD.setForeground(Color.BLACK);
		WORD.setFont(new Font("Chiller", Font.PLAIN, 54));

		DefineButton.setForeground(Color.RED);
		DefineButton.setBackground(Color.BLACK);
		DefineButton.setFont(new Font("Chiller", Font.BOLD, 16));

		ListViewButton.setForeground(Color.RED);
		ListViewButton.setBackground(Color.BLACK);
		ListViewButton.setFont(new Font("Chiller", Font.BOLD, 16));

		AddWord.setForeground(Color.RED);
		AddWord.setBackground(Color.BLACK);
		AddWord.setFont(new Font("Chiller", Font.BOLD, 16));

		PicBtn.setForeground(Color.RED);
		PicBtn.setBackground(Color.BLACK);
		PicBtn.setFont(new Font("Chiller", Font.BOLD, 16));

		MiniGame.setForeground(Color.RED);
		MiniGame.setBackground(Color.BLACK);
		MiniGame.setFont(new Font("Chiller", Font.BOLD, 16));

		BookMark.setForeground(Color.RED);
		BookMark.setBackground(Color.BLACK);
		BookMark.setFont(new Font("Chiller", Font.BOLD, 16));

		BKMKWordsOnly.setForeground(Color.RED);
		BKMKWordsOnly.setBackground(Color.BLACK);
		BKMKWordsOnly.setFont(new Font("Chiller", Font.BOLD, 16));

		btnThemes.setForeground(Color.RED);
		btnThemes.setBackground(Color.BLACK);
		btnThemes.setFont(new Font("Chiller", Font.BOLD, 16));

		editorPane.setBackground(Color.BLACK);
		editorPane.setForeground(Color.RED);

		lblPic.setIcon(BKMK);

		try {
			Image img = ImageIO.read(getClass().getResource(
					"Arrows-Left-Circular-icon.png"));
			Left.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		try {
			Image img2 = ImageIO.read(getClass().getResource(
					"Arrows-Right-Circular-icon.png"));
			Right.setIcon(new ImageIcon(img2));
		} catch (IOException ex) {

		}

	}

	public void heavenTheme() {

		framed.getContentPane().setBackground(Color.white);
		panel.setBackground(Color.white);

		WORD.setForeground(new Color(255, 204, 0));
		WORD.setFont(new Font("Ancestory SF", Font.PLAIN, 54));

		DefineButton.setForeground(Color.WHITE);
		DefineButton.setBackground(new Color(255, 204, 0));
		DefineButton.setFont(new Font("Ancestory SF", Font.BOLD, 16));

		ListViewButton.setForeground(Color.WHITE);
		ListViewButton.setBackground(new Color(255, 204, 0));
		ListViewButton.setFont(new Font("Ancestory SF", Font.BOLD, 16));

		AddWord.setForeground(Color.WHITE);
		AddWord.setBackground(new Color(255, 204, 0));
		AddWord.setFont(new Font("Ancestory SF", Font.BOLD, 16));

		PicBtn.setForeground(Color.WHITE);
		PicBtn.setBackground(new Color(255, 204, 0));
		PicBtn.setFont(new Font("Ancestory SF", Font.BOLD, 16));

		MiniGame.setForeground(Color.WHITE);
		MiniGame.setBackground(new Color(255, 204, 0));
		MiniGame.setFont(new Font("Ancestory SF", Font.BOLD, 16));

		BookMark.setForeground(Color.WHITE);
		BookMark.setBackground(new Color(255, 204, 0));
		BookMark.setFont(new Font("Ancestory SF", Font.BOLD, 16));

		BKMKWordsOnly.setForeground(Color.WHITE);
		BKMKWordsOnly.setBackground(new Color(255, 204, 0));
		BKMKWordsOnly.setFont(new Font("Ancestory SF", Font.BOLD, 16));

		btnThemes.setForeground(Color.WHITE);
		btnThemes.setBackground(new Color(255, 204, 0));
		btnThemes.setFont(new Font("Ancestory SF", Font.BOLD, 16));
		editorPane.setBackground(new Color(255, 204, 0));
		editorPane.setForeground(Color.white);

		lblPic.setIcon(BKMK3);

		try {
			Image img = ImageIO.read(getClass().getResource("HevLeft.png"));
			Left.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		try {
			Image img2 = ImageIO.read(getClass().getResource("HevRight.png"));
			Right.setIcon(new ImageIcon(img2));
		} catch (IOException ex) {

		}

	}

	public void americaTheme() {

		framed.getContentPane().setBackground(new Color(250, 0, 0));
		panel.setBackground(new Color(250, 0, 0));

		WORD.setForeground(Color.WHITE);
		WORD.setFont(new Font("Impact", Font.PLAIN, 54));

		DefineButton.setForeground(Color.WHITE);
		DefineButton.setBackground(new Color(0, 40, 104));
		DefineButton.setFont(new Font("Impact", Font.BOLD, 16));

		ListViewButton.setForeground(Color.WHITE);
		ListViewButton.setBackground(new Color(0, 40, 104));
		ListViewButton.setFont(new Font("Impact", Font.BOLD, 16));

		AddWord.setForeground(Color.WHITE);
		AddWord.setBackground(new Color(0, 40, 104));
		AddWord.setFont(new Font("Impact", Font.BOLD, 16));

		PicBtn.setForeground(Color.WHITE);
		PicBtn.setBackground(new Color(0, 40, 104));
		PicBtn.setFont(new Font("Impact", Font.BOLD, 16));

		MiniGame.setForeground(Color.WHITE);
		MiniGame.setBackground(new Color(0, 40, 104));
		MiniGame.setFont(new Font("Impact", Font.BOLD, 16));

		BookMark.setForeground(Color.WHITE);
		BookMark.setBackground(new Color(0, 40, 104));
		BookMark.setFont(new Font("Impact", Font.BOLD, 16));

		BKMKWordsOnly.setForeground(Color.WHITE);
		BKMKWordsOnly.setBackground(new Color(0, 40, 104));
		BKMKWordsOnly.setFont(new Font("Impact", Font.BOLD, 16));

		btnThemes.setForeground(Color.WHITE);
		btnThemes.setBackground(new Color(0, 40, 104));
		btnThemes.setFont(new Font("Impact", Font.BOLD, 16));

		editorPane.setBackground(new Color(250, 0, 0));
		editorPane.setForeground(Color.white);

		lblPic.setIcon(BKMK4);

		try {
			Image img = ImageIO.read(getClass().getResource("USALeft.png"));
			Left.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}

		try {
			Image img2 = ImageIO.read(getClass().getResource("USARight.png"));
			Right.setIcon(new ImageIcon(img2));
		} catch (IOException ex) {

		}

	}

}
