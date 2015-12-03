package UI.Panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;

import java.awt.CardLayout;

import javax.swing.JTextArea;

import Business.Controller.Controller;
import UI.UI;

public class EndShot extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public EndShot() {
		setLayout(new CardLayout(0, 0));
		
		JPanel EndCurrentShot = new JPanel();
		add(EndCurrentShot, "name_35453048726814");
		
		JLabel lblWhenReady = new JLabel("When Ready:");
		
		JButton btnEndShot = new JButton("End Shot");
		GroupLayout gl_EndCurrentShot = new GroupLayout(EndCurrentShot);
		gl_EndCurrentShot.setHorizontalGroup(
			gl_EndCurrentShot.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_EndCurrentShot.createSequentialGroup()
					.addGap(153)
					.addComponent(lblWhenReady)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEndShot)
					.addContainerGap(152, Short.MAX_VALUE))
		);
		gl_EndCurrentShot.setVerticalGroup(
			gl_EndCurrentShot.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_EndCurrentShot.createSequentialGroup()
					.addContainerGap(139, Short.MAX_VALUE)
					.addGroup(gl_EndCurrentShot.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWhenReady)
						.addComponent(btnEndShot))
					.addGap(138))
		);
		EndCurrentShot.setLayout(gl_EndCurrentShot);
		
		JPanel DisplayShotInfo = new JPanel();
		add(DisplayShotInfo, "name_35454713304253");
		
		JTextArea shotInfoArea = new JTextArea();
		
		JButton btnDoneViewing = new JButton("Done Viewing");
		btnDoneViewing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//done viewing button pressed
			}
		});
		
		JLabel lblShotInfo = new JLabel("Shot Info:");
		
		JCheckBox chckbxEndHole = new JCheckBox("End Hole");
		GroupLayout gl_DisplayShotInfo = new GroupLayout(DisplayShotInfo);
		gl_DisplayShotInfo.setHorizontalGroup(
			gl_DisplayShotInfo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DisplayShotInfo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_DisplayShotInfo.createParallelGroup(Alignment.LEADING)
						.addComponent(shotInfoArea, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addGroup(gl_DisplayShotInfo.createSequentialGroup()
							.addGap(191)
							.addComponent(lblShotInfo))
						.addGroup(gl_DisplayShotInfo.createSequentialGroup()
							.addGap(124)
							.addComponent(chckbxEndHole)
							.addGap(18)
							.addComponent(btnDoneViewing)))
					.addContainerGap())
		);
		gl_DisplayShotInfo.setVerticalGroup(
			gl_DisplayShotInfo.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_DisplayShotInfo.createSequentialGroup()
					.addGap(15)
					.addComponent(lblShotInfo)
					.addGap(11)
					.addComponent(shotInfoArea, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addGap(11)
					.addGroup(gl_DisplayShotInfo.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDoneViewing)
						.addComponent(chckbxEndHole))
					.addGap(14))
		);
		DisplayShotInfo.setLayout(gl_DisplayShotInfo);

	}
}
