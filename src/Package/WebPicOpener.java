package Package;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.net.URI;
//import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JOptionPane;

import static Package.TheRealShit.*;
import static Package.GUIClass.*;

public class WebPicOpener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (WORD.getText().equals("Angus"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://www.angus.org/Pub/Lit/graphics/angus_promo.jpg")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else if (WORD.getText().equals("Cherry"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://fc00.deviantart.net/fs16/i/2007/134/8/9/Sexy_cherry_by_minystock.jpg")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else if (WORD.getText().equals("Dingle"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://rsbowman.myweb.usf.edu/GetLost/locations/dingle/DinglePeninsula3.jpg")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else if (WORD.getText().equals("Hairy"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://talktank.files.wordpress.com/2010/09/hairy.jpg")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else if (WORD.getText().equals("Hoe"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"https://www.midwestrake.com/image.php?product=63001&version=thumbnail")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else if (WORD.getText().equals("Juicy"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://upload.wikimedia.org/wikipedia/en/1/13/The_Notorious_B.I.G._-_Juicy.jpeg")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else if (WORD.getText().equals("Plowing"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://www.consumerinsuranceguide.com/wp-content/uploads/2012/02/snowplow-accident1.jpg")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else if (WORD.getText().equals("Smash"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://upload.wikimedia.org/wikipedia/commons/b/bb/Harry_Smith_forearm_smash_on_Fit_Finlay.jpg")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else if (WORD.getText().equals("Tight"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://media1.s-nbcnews.com/i/newscms/2014_26/524641/140623-giant-vulva-jsw-938a_012ad06ee34ef16ade2acf11264eb18f.jpg")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else if (WORD.getText().equals("Vagina"))
			try {
				Desktop.getDesktop()
						.browse(new URL(
								"http://intimatehealthhelp.net/wp-content/uploads/2012/08/vagina-etc-diagram.jpg")
								.toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		else {
			try {
				Desktop.getDesktop().browse(
						new URL("https://www.google.com/search?tbm=isch&q="
								+ WORD.getText()).toURI());
			} catch (Exception e) {
				JOptionPane
						.showMessageDialog(null,
								"Sorry Web Image viewing is not supported on this computer");
			}

		}

	}

}
