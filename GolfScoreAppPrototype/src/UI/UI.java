package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.JPanel;

import Business.Controller.Controller;
import UI.Panels.CreateCourse;
import UI.Panels.EndHole;
import UI.Panels.EndRound;
import UI.Panels.EndShot;
import UI.Panels.Home;
import UI.Panels.StartHole;
import UI.Panels.StartRound;
import UI.Panels.StartShot;
import UI.Panels.UploadData;
import UI.Panels.ViewHistory;

public class UI {

	private static final UI INSTANCE = new UI();  //UI singleton
	private JFrame GolfScoreAppUI;                //JFrame displayed to user
	
	//list of JPanels present in UI
	private JPanel home;
	private JPanel createCourse;
	private JPanel startRound;
	private JPanel startHole;
	private JPanel startShot;
	private JPanel endRound;
	private JPanel endHole;
	private JPanel endShot;
	private JPanel uploadData;
	private JPanel viewHistory;

	/**
	 * Create the application.
	 */
	private UI() {
		initialize();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = UI.getInstance();
					window.GolfScoreAppUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * return UI instance
	 */
    public static UI getInstance() {
        return INSTANCE;
    }
    
	/**
	 * Show a given panel
	 */
	public void show(String panelName) {
		//disable all other panels{
		home.setVisible(false);
		createCourse.setVisible(false);
		startRound.setVisible(false);
		startHole.setVisible(false);
		startShot.setVisible(false);
		endRound.setVisible(false);
		endHole.setVisible(false);
		endShot.setVisible(false);
		uploadData.setVisible(false);
		viewHistory.setVisible(false);
		
		//set desired panel to be visible
		if(panelName.equals("Home")) {
			home.setVisible(true);
		}
		else if (panelName.equals("Create Course")) {
			createCourse.setVisible(true);
		}
		else if (panelName.equals("Start Round")) {
			startRound.setVisible(true);
		}
		else if (panelName.equals("Start Hole")) {
			startHole.setVisible(true);
		}
		else if (panelName.equals("Start Shot")) {
			startShot.setVisible(true);
		}
		else if (panelName.equals("End Round")) {
			endRound.setVisible(true);
		}
		else if (panelName.equals("End Hole")) {
			endHole.setVisible(true);
		}
		else if (panelName.equals("End Shot")) {
			endShot.setVisible(true);
		}
		else if (panelName.equals("Upload Data")) {
			uploadData.setVisible(true);
		}
		else if (panelName.equals("View History")) {
			viewHistory.setVisible(true);
		}
		else {
			//invalid panel passed, show home panel instead
			System.out.println("Error, Invalid Panel Arguement Passed. Please Reset UI.");
			home.setVisible(true);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//initialize JFrame
		GolfScoreAppUI = new JFrame();
		GolfScoreAppUI.setTitle("Golf Score App ProtoType");
		GolfScoreAppUI.setBounds(100, 100, 450, 300);
		GolfScoreAppUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GolfScoreAppUI.getContentPane().setLayout(new CardLayout(0, 0));
		
		//initialize desired panels to the list of panels for this frame
		home = new Home(); 
		createCourse = new CreateCourse(); 
		startRound = new StartRound(); 
		startHole = new StartHole(); 
		startShot = new StartShot(); 
		endRound = new EndRound(); 
		endHole = new EndHole(); 
		endShot = new EndShot(); 
		uploadData = new UploadData(); 
		viewHistory = new ViewHistory(); 
		
		//add each panel in the list to the frame
		GolfScoreAppUI.getContentPane().add(home);
		GolfScoreAppUI.getContentPane().add(createCourse);
		GolfScoreAppUI.getContentPane().add(startRound);
		GolfScoreAppUI.getContentPane().add(startHole);
		GolfScoreAppUI.getContentPane().add(startShot);
		GolfScoreAppUI.getContentPane().add(endRound);
		GolfScoreAppUI.getContentPane().add(endHole);
		GolfScoreAppUI.getContentPane().add(endShot);
		GolfScoreAppUI.getContentPane().add(uploadData);
		GolfScoreAppUI.getContentPane().add(viewHistory);
		
		//show home panel initially
		show("Home");
	}

}
