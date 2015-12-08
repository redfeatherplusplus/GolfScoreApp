package UI.Panels;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.CardLayout;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import Business.Controller.Controller;
import UI.PanelNames;
import UI.UI;
import javax.swing.JScrollPane;

public class ViewHistory extends JPanel {
	
	private DefaultListModel courseListModel = new DefaultListModel<String>();
	private Controller controller = Controller.getInstance();
	
	/**
	 * Create the panel.
	 */
	private JList courseList = new JList(courseListModel);
	
	public ViewHistory() {
		JTextArea courseInfoArea = new JTextArea();

		setLayout(new CardLayout(0, 0));
		
		JPanel ViewCourses = new JPanel();
		add(ViewCourses, "name_31776851274492");
		
		JPanel ViewCourse = new JPanel();
		add(ViewCourse, "name_31781453234841");
		
		JButton btnPickCourse = new JButton("Pick Course");
		btnPickCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pick course button pressed
				
				//prepare ViewCourse for Viewing
				courseInfoArea.setText(Controller.getInstance().GetRoundInformation(
						(String) courseList.getSelectedValue()));
				
				//change panel displayed
				ViewCourses.setVisible(false);
				ViewCourse.setVisible(true);
			}
		});
		
		JLabel lblPleaseChooseA = new JLabel("Please choose a course to view:");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_ViewCourses = new GroupLayout(ViewCourses);
		gl_ViewCourses.setHorizontalGroup(
			gl_ViewCourses.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ViewCourses.createSequentialGroup()
					.addGroup(gl_ViewCourses.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ViewCourses.createSequentialGroup()
							.addGap(182)
							.addComponent(btnPickCourse))
						.addGroup(gl_ViewCourses.createSequentialGroup()
							.addGap(148)
							.addComponent(lblPleaseChooseA)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_ViewCourses.createSequentialGroup()
					.addContainerGap(15, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
					.addGap(79))
		);
		gl_ViewCourses.setVerticalGroup(
			gl_ViewCourses.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ViewCourses.createSequentialGroup()
					.addGap(18)
					.addComponent(lblPleaseChooseA)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(btnPickCourse)
					.addContainerGap())
		);
		scrollPane.setViewportView(courseList);
		ViewCourses.setLayout(gl_ViewCourses);
		
		JButton btnDoneViewing = new JButton("Done Viewing");
		btnDoneViewing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//done viewing button pressed
				UI.getInstance().show(PanelNames.HOME);
			}
		});
		
		JLabel lblCourseInformation = new JLabel("Course Information:");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		GroupLayout gl_ViewCourse = new GroupLayout(ViewCourse);
		gl_ViewCourse.setHorizontalGroup(
			gl_ViewCourse.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ViewCourse.createSequentialGroup()
					.addGroup(gl_ViewCourse.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ViewCourse.createSequentialGroup()
							.addGap(162)
							.addComponent(lblCourseInformation))
						.addGroup(gl_ViewCourse.createSequentialGroup()
							.addGap(160)
							.addComponent(btnDoneViewing))
						.addGroup(gl_ViewCourse.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_ViewCourse.setVerticalGroup(
			gl_ViewCourse.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ViewCourse.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCourseInformation)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDoneViewing)
					.addContainerGap())
		);
		
		scrollPane_1.setViewportView(courseInfoArea);
		ViewCourse.setLayout(gl_ViewCourse);

	}
	
	public void refresh() {
		courseListModel.clear();
		for (String round : controller.GetRoundPlayed()){
			courseListModel.addElement(round);
		}
	}
}

	