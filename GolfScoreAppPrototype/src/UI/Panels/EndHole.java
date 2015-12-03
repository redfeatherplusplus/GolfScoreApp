package UI.Panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import Business.Controller.Controller;
import UI.UI;

public class EndHole extends JPanel {

	private UI GolfScoreAppUI = UI.getInstance();                          //UI singleton
	private Controller GolfScoreAppController = Controller.getInstance();  //Controller singleton
	
	/**
	 * Create the panel.
	 */
	public EndHole() {
		
		JButton btnDoneViewing = new JButton("Done Viewing");
		btnDoneViewing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//done viewing button pressed
			}
		});
		
		JTextArea holeInfoArea = new JTextArea();
		
		JLabel lblHoleInfo = new JLabel("Hole Info:");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(165)
							.addComponent(btnDoneViewing))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(191)
							.addComponent(lblHoleInfo))
						.addComponent(holeInfoArea, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(lblHoleInfo)
					.addGap(11)
					.addComponent(holeInfoArea, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDoneViewing)
					.addGap(14))
		);
		setLayout(groupLayout);

	}

}
