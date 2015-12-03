package UI.Panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import Business.Controller.Controller;
import UI.PanelNames;
import UI.UI;

public class UploadData extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public UploadData() {
		
		JList roundList = new JList();
		
		JButton btnUploadRound = new JButton("Upload Round");
		
		JLabel lblPleaseChooseA = new JLabel("Please choose a round to upload:");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(176)
							.addComponent(btnUploadRound))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(roundList, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(145)
							.addComponent(lblPleaseChooseA)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(lblPleaseChooseA)
					.addGap(11)
					.addComponent(roundList, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUploadRound)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}

}
