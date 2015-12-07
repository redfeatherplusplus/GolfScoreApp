package UI.Panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;

import java.awt.CardLayout;

import javax.swing.JTextArea;

import Business.Controller.Controller;
import Business.Model.Shot;
import UI.PanelNames;
import UI.UI;

public class EndShot extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public EndShot() {
		Controller controller = Controller.getInstance();
		
		setLayout(new CardLayout(0, 0));
		
		JPanel EndCurrentShot = new JPanel();
		add(EndCurrentShot, "name_35453048726814");
		
		JPanel DisplayShotInfo = new JPanel();
		add(DisplayShotInfo, "name_35454713304253");
		
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
				
		JTextArea shotInfoArea = new JTextArea();
		
		// END SHOT BUTTON LISTENER
		btnEndShot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String shotInfo = controller.endShot();

				if (shotInfo != null){
					shotInfoArea.setText(shotInfo);
					EndCurrentShot.setVisible(false);
					DisplayShotInfo.setVisible(true);
				}
			}
		});
		
		JButton btnDoneViewing = new JButton("Done Viewing");
		JLabel lblShotInfo = new JLabel("Shot Info:");
		JCheckBox chckbxEndHole = new JCheckBox("End Hole");
		
		// DONE VIEWING SHOT BUTTON LISTENER
		btnDoneViewing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//done viewing button pressed
				
				// End Hole
				if (chckbxEndHole.isSelected()){
					//controller.endHole(); // Should 
					UI.getInstance().show(PanelNames.END_HOLE);
				}
				// Continue Hole
				else {
					UI.getInstance().show(PanelNames.START_SHOT);
				}
			}
		});
		
		
		
		
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

		
		this.addComponentListener(new ComponentListener(){

			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void componentShown(ComponentEvent e) {
				EndCurrentShot.setVisible(true);
				DisplayShotInfo.setVisible(false);
			}

			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
}
