package UI.Panels;

import javax.swing.JPanel;
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

public class ViewHistory extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public ViewHistory() {
		setLayout(new CardLayout(0, 0));
		
		JPanel ViewCourses = new JPanel();
		add(ViewCourses, "name_31776851274492");
		
		JList courseList = new JList();
		
		JButton btnPickCourse = new JButton("Pick Course");
		btnPickCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pick course button pressed
			}
		});
		
		JLabel lblPleaseChooseA = new JLabel("Please choose a course to view:");
		GroupLayout gl_ViewCourses = new GroupLayout(ViewCourses);
		gl_ViewCourses.setHorizontalGroup(
			gl_ViewCourses.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ViewCourses.createSequentialGroup()
					.addGroup(gl_ViewCourses.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ViewCourses.createSequentialGroup()
							.addGap(182)
							.addComponent(btnPickCourse))
						.addGroup(gl_ViewCourses.createSequentialGroup()
							.addContainerGap()
							.addComponent(courseList, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addGroup(gl_ViewCourses.createSequentialGroup()
							.addGap(148)
							.addComponent(lblPleaseChooseA)))
					.addContainerGap())
		);
		gl_ViewCourses.setVerticalGroup(
			gl_ViewCourses.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ViewCourses.createSequentialGroup()
					.addGap(18)
					.addComponent(lblPleaseChooseA)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(courseList, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(btnPickCourse)
					.addContainerGap())
		);
		ViewCourses.setLayout(gl_ViewCourses);
		
		JPanel ViewCourse = new JPanel();
		add(ViewCourse, "name_31781453234841");
		
		JButton btnDoneViewing = new JButton("Done Viewing");
		btnDoneViewing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//done viewing button pressed
			}
		});
		
		JLabel lblCourseInformation = new JLabel("Course Information:");
		
		JTextArea courseInfoArea = new JTextArea();
		GroupLayout gl_ViewCourse = new GroupLayout(ViewCourse);
		gl_ViewCourse.setHorizontalGroup(
			gl_ViewCourse.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ViewCourse.createSequentialGroup()
					.addGroup(gl_ViewCourse.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ViewCourse.createSequentialGroup()
							.addGap(177)
							.addComponent(btnDoneViewing))
						.addGroup(gl_ViewCourse.createSequentialGroup()
							.addContainerGap()
							.addComponent(courseInfoArea, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addGroup(gl_ViewCourse.createSequentialGroup()
							.addGap(177)
							.addComponent(lblCourseInformation)))
					.addContainerGap())
		);
		gl_ViewCourse.setVerticalGroup(
			gl_ViewCourse.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ViewCourse.createSequentialGroup()
					.addGap(18)
					.addComponent(lblCourseInformation)
					.addGap(11)
					.addComponent(courseInfoArea, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDoneViewing)
					.addContainerGap())
		);
		ViewCourse.setLayout(gl_ViewCourse);

	}
}
