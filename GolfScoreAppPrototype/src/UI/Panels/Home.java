package UI.Panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import Business.Controller.Controller;
import UI.PanelNames;
import UI.UI;

public class Home extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public Home() {
		
		JButton btnCreateCourse = new JButton("Create Course");
		btnCreateCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create course button pressed
				UI.getInstance().show(PanelNames.CREATE_COURSE);
			}
		});
		
		JButton btnStartRound = new JButton("Start Round");
		btnStartRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//start round button pressed
				UI.getInstance().show(PanelNames.START_ROUND);
			}
		});
		
		JButton btnUploadData = new JButton("Upload Data");
		btnUploadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//upload data button pressed
				UI.getInstance().show(PanelNames.UPLOAD_DATA);
			}
		});
		
		JButton btnViewHistory = new JButton("View History");
		btnViewHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//view history button pressed
				UI.getInstance().show(PanelNames.VIEW_HISTORY);
			}
		});
		
		JLabel lblWelcome = new JLabel("Welcome");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(174)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnCreateCourse)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnUploadData)
										.addGap(6))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnStartRound)
										.addGap(6)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(30)
									.addComponent(lblWelcome))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(180)
							.addComponent(btnViewHistory)))
					.addContainerGap(173, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(65)
					.addComponent(lblWelcome)
					.addGap(11)
					.addComponent(btnCreateCourse)
					.addGap(18)
					.addComponent(btnStartRound)
					.addGap(18)
					.addComponent(btnUploadData)
					.addGap(18)
					.addComponent(btnViewHistory)
					.addContainerGap(64, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
