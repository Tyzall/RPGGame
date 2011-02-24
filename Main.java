import java.awt.Dimension;

import javax.swing.JFrame;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new StartScreen();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800,600));
		frame.setBounds(0, 0, 800, 600);
		frame.pack();
		frame.setVisible(true);
		

	}

}
