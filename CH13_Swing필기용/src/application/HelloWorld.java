package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class HelloWorld {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			new MainFrame("Test Swing App");
		});
	}
}
