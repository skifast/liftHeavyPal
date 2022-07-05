import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

public class homeScreen extends JFrame{
	int exercisesWidth = 150;
	int exercisesHeight = 400; 
	int exercisesBufferW = 40;
	int exercisesBufferH = 100; 
	public homeScreen() {
		
	}
	
	public ArrayList<JButton>  homePanels(homeScreen homeScreen, int width, int height) {
		//Container c = mainFrame.getContentPane();
		ArrayList<JButton> exercisesButtonLst = new ArrayList<>();
		
		JPanel mainPanel = new JPanel(); 
		mainPanel.setBackground(Color.magenta.darker());
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		 
		
		JPanel exercises = new JPanel(); 
		exercises.setBackground(Color.pink);
		//exercises.setPreferredSize(new Dimension(exercisesWidth, height));
		exercises.setBounds(width - exercisesBufferW - exercisesWidth, 0, exercisesWidth, height);
		exercisesButtonLst = addExerciseButtons(exercisesButtonLst, exercises);
		exercises.setLayout(new GridLayout(exercisesButtonLst.size(), 1));
		//JScrollPane scrollPane = new JScrollPane(exercises);
		
		//exercises.add(scrollPane);
		
		//mainPanel.add(scrollPane, BorderLayout.CENTER);
		mainPanel.add(exercises);
		
		
		JLabel imgLabel = new JLabel(new ImageIcon("src/barbell.png")); 
		imgLabel.setSize(100, 100);
		mainPanel.add(imgLabel);
		
		homeScreen.add(mainPanel); 
		return exercisesButtonLst;
	}
	
	private ArrayList<JButton> addExerciseButtons(ArrayList<JButton> exercisesButtonLst, JPanel exercises){
		
		exercisesButtonLst = addExercisesButton(exercisesButtonLst, exercises, "Back");
		exercisesButtonLst = addExercisesButton(exercisesButtonLst, exercises, "Upper Back");
		exercisesButtonLst = addExercisesButton(exercisesButtonLst, exercises, "Shoulders");
		exercisesButtonLst = addExercisesButton(exercisesButtonLst, exercises, "Glutes");
		exercisesButtonLst = addExercisesButton(exercisesButtonLst, exercises, "Quads");
		exercisesButtonLst = addExercisesButton(exercisesButtonLst, exercises, "Hamstrings");
		
		return exercisesButtonLst;
	}
	
	private ArrayList<JButton> addExercisesButton(ArrayList<JButton> exercisesButtonLst, JPanel exercises, String muscleGroup) {
		JButton button = new JButton();
		button.setText(muscleGroup);
		exercises.add(button);
		exercisesButtonLst.add(button);
		return exercisesButtonLst;
	}
}
