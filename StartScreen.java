import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class StartScreen extends JFrame{
	JPanel background;
	JButton startButton, exitButton, loadButton;
	public StartScreen()
	{
		super("Rpg"); 
		background = new JPanel();
		background.setBackground(Color.GREEN);
		getContentPane().add(background, BorderLayout.CENTER);
		
		class ButtonClicked implements ActionListener
		{
			public void actionPerformed(ActionEvent button)
			{
				if(button.getSource() == startButton)
				{
					getContentPane().removeAll();
					validate();
					repaint();
				}
				else if(button.getSource() == loadButton)
				{
					//getContentPane().removeAll();
					JFrame frame = new IntroMap();
					setVisible(false);
					frame.setVisible(true);
					validate();
					repaint();
				}
				else
				{
					dispose();
				}
			}
		}
		
		createStartButtons();
		ButtonClicked buttonListener = new ButtonClicked();
		loadButton.addActionListener(buttonListener);
		exitButton.addActionListener(buttonListener);
		startButton.addActionListener(buttonListener);
		
		pack();
	}
	
	public void createStartButtons()
	{
		JPanel buttons = createButtons();
		
		JPanel startButtons = new JPanel();
		startButtons.add(buttons);
		getContentPane().add(buttons, BorderLayout.SOUTH);
	}
	public JPanel createButtons()
	{
		startButton = new JButton("Start Game");
		loadButton = new JButton("Load Game");
		exitButton = new JButton("Exit");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.setBackground(Color.getHSBColor(250, 100, 120));
		panel.add(startButton);
		panel.add(loadButton);
		panel.add(exitButton);
		return panel;
	}
}
