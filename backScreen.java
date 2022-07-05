import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class backScreen extends JFrame {
	static int height;
	static int width; 
	static ArrayList<exerciseEntry> entries;
	
	public backScreen(int width, int height) {
		
		backScreen.height = height; 
		backScreen.width = width; 
		
		entries = new ArrayList<>();
		
		setTitle("Lift Heavy Pal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width,height);
		setVisible(true);
	}
	
	public void assembleExercises() {
		exerciseEntry threadTheNeedle = new exerciseEntry("threadTheNeedle", "back", "https://www.youtube.com/watch?v=MfUx9FCOb1E");
		entries.add(threadTheNeedle);
	}
	
	public static JButton backScreenPanels(backScreen backScreen) {
		JPanel mainPanel = new JPanel(); 
		mainPanel.setBackground(Color.blue.brighter());
		mainPanel.setLayout(new GridLayout(1, 2));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		 

		JLabel imgLabel = new JLabel(new ImageIcon("src/back.png")); 
		imgLabel.setSize(100, 100);
		mainPanel.add(imgLabel);
		
		JPanel halfPanel = new JPanel(); 
		halfPanel.setBackground(Color.LIGHT_GRAY);
		halfPanel.setLayout(new GridBagLayout());
		
		JButton getExercise = new JButton(); 
		getExercise.setText("Get Exercise");
		
		halfPanel.add(getExercise);
			
		mainPanel.add(halfPanel);
		
		backScreen.add(mainPanel);
		
		return getExercise; 
	}
	
	public void getExercises() {
		JPanel exercisesPanel = new JPanel(new GridBagLayout());
		exercisesPanel.setBounds(0, 0, width, height);
		this.setContentPane(exercisesPanel);
		
		GridBagConstraints c = new GridBagConstraints();
		
        JPanel titularPanel = new JPanel(); 
		titularPanel.setBackground(Color.yellow);
		c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1d;
        c.ipady = 150;
		this.add(titularPanel, c);
		
		JPanel contentPanel = new JPanel(); 
		contentPanel.setBackground(Color.orange);
		c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1d; 
        c.ipady = height - 150;
        this.add(contentPanel, c);
        //this.pack(); // should always be done after all components are added

        this.setVisible(true);
		
		//
		
		/*
		//GridBagLayout layout = new GridBagLayout();
		exercisesPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
				//layout.getConstraints(exercisesPanel);
		//layout.s
		
				//new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL; 
		gbc.gridx = 0; 
		gbc.gridy = 0; 
		
		
		
		//titularPanel.setSize(width, 150);
		//titularPanel.setPreferredSize(backScreen.getSize());
		exercisesPanel.add(titularPanel, gbc);
		
		//exercisesPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		 
		backScreen.add(exercisesPanel);*/
	}
	
}
