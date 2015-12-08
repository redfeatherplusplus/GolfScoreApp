package UI.Panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import Business.Controller.Controller;
import UI.PanelNames;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartHole extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public StartHole() {
		
		JLabel lblWhenReady = new JLabel("When ready:");
		
		JButton btnStartHole = new JButton("Start Hole");
		btnStartHole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//start hole button pressed
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(151)
					.addComponent(lblWhenReady)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnStartHole)
					.addContainerGap(151, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(139)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWhenReady)
						.addComponent(btnStartHole))
					.addContainerGap(138, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
