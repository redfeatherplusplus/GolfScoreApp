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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UploadData extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public UploadData() {
		
		JButton btnUploadRound = new JButton("Upload");
		btnUploadRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.getInstance().uploadRoundInformation();
			}
		});
		
		JLabel lblPleaseChooseA = new JLabel("Upload XML Data:");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(181)
							.addComponent(btnUploadRound))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(170)
							.addComponent(lblPleaseChooseA)))
					.addContainerGap(169, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(104)
					.addComponent(lblPleaseChooseA)
					.addGap(18)
					.addComponent(btnUploadRound)
					.addContainerGap(133, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
