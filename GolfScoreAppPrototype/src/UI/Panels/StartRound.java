package UI.Panels;

import javax.swing.JPanel;

import java.awt.CardLayout;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JLabel;

import Business.Controller.Controller;
import UI.PanelNames;
import UI.UI;

public class StartRound extends JPanel {
	
	/**
	 * Create the panel.
	 */

	private DefaultListModel<String> listModel = new DefaultListModel<String>();
	private JList courseList = new JList(listModel);
	public StartRound() {

		for (String courseName : Controller.getInstance().listCourses()) {
			listModel.addElement(courseName);
		}
		
		JButton btnChooseCourse = new JButton("Choose Course");
		btnChooseCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//choose course button pressed
				Controller.getInstance().startRound(courseList.getSelectedValue().toString());
				
				//show start hole UI
				UI.getInstance().show(PanelNames.START_HOLE);
			}
		});
		
		JLabel lblPleaseChoseA = new JLabel("Please chose a course to play:");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(173)
							.addComponent(btnChooseCourse))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(courseList, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(152)
							.addComponent(lblPleaseChoseA)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(lblPleaseChoseA)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(courseList, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnChooseCourse)
					.addContainerGap())
		);
		setLayout(groupLayout);
		
		//add component listener for refreshing
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
				//refresh the listmodel
				listModel.clear();
				for (String courseName : Controller.getInstance().listCourses()) {
					listModel.addElement(courseName);
				}
			}

			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}
