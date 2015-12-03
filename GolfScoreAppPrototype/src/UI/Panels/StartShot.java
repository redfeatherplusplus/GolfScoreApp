package UI.Panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JList;

import Business.Controller.Controller;
import UI.UI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartShot extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public StartShot() {
		
		JLabel lblWhenReady = new JLabel("When Ready:");
		
		JButton btnStartShot = new JButton("Start Shot");
		btnStartShot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//start shot button pressed
			}
		});
		
		JList clubList = new JList();
		
		JLabel lblPleaseChooseA = new JLabel("Please choose a club:");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(150)
							.addComponent(lblWhenReady)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnStartShot))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(clubList, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(174)
							.addComponent(lblPleaseChooseA)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(lblPleaseChooseA)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(clubList, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWhenReady)
						.addComponent(btnStartShot))
					.addContainerGap())
		);
		setLayout(groupLayout);

	}

}
