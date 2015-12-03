package UI.Panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import Business.Controller.Controller;
import UI.UI;

public class EndRound extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public EndRound() {
		
		JButton btnDoneViewing = new JButton("Done Viewing");
		btnDoneViewing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//done viewing
			}
		});
		
		JTextArea roundInfoArea = new JTextArea();
		
		JLabel lblRoundInfo = new JLabel("Round Info:");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(167)
							.addComponent(btnDoneViewing))
						.addComponent(roundInfoArea, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addComponent(lblRoundInfo)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(lblRoundInfo)
					.addGap(11)
					.addComponent(roundInfoArea, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDoneViewing)
					.addGap(14))
		);
		setLayout(groupLayout);

	}

}
