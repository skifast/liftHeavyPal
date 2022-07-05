import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main {
	static int width = 1800; 
	static int height = 900; 
	public static void main(String[] args) {
		//JFrame mainFrame = new JFrame(); 
		
		//mainFrame.setTitle("Lift Heavy Pal");
		//mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		homeScreen home = new homeScreen(); 
		ArrayList<JButton> buttonLst = home.homePanels(home, width, height);
		home.setTitle("Lift Heavy Pal");
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		home.setSize(width,height);
		home.setVisible(true);
		
		
		
		buttonLst.get(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				home.dispose();
				
				backScreen back = new backScreen(width, height);
				JButton getExercise = backScreen.backScreenPanels(back); 
				
				getExercise.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						back.dispose();
						backScreen back = new backScreen(width, height);
						back.getExercises();
					}
				});
			}
		});
		buttonLst.get(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("upper back");
			}
		});
		buttonLst.get(2).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("shoulders");
			}
		});
		buttonLst.get(3).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("glutes");
			}
		});
		
		
		
		
	}
}
