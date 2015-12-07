package UI.Panels;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListModel;
import javax.swing.JComboBox;
import javax.swing.JList;

import Business.Controller.Controller;
import UI.PanelNames;
import UI.UI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartShot extends JPanel {
	
	private JList clubList;
	
	/**
	 * Create the panel.
	 */
	public StartShot() {
		Controller controller = Controller.getInstance();
		
		JLabel lblWhenReady = new JLabel("When Ready:");
		
		JButton btnStartShot = new JButton("Start Shot");
		btnStartShot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//start shot button pressed
				
				controller.newShot();
				int selected = clubList.getSelectedIndex();
				if (selected >= 0){
					String selectedClub = (String)clubList.getModel().getElementAt(selected);
					controller.selectClub(selectedClub);
					controller.startShot();
					
					UI.getInstance().show(PanelNames.END_SHOT);
					clubList.clearSelection();
				}
			}
		});
		
		//Setup Club List picker
		clubList = new JList();
		DefaultListModel clubListModel = new DefaultListModel<String>();
		for (String club : controller.getClubList()){
			clubListModel.addElement(club);
		}
		clubList.setModel(clubListModel);
		
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
