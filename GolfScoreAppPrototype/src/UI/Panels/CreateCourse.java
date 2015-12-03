package UI.Panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import Business.Controller.Controller;
import UI.PanelNames;
import UI.UI;

public class CreateCourse extends JPanel {
	private JTextField txtCourseName;

	/**
	 * Create the panel.
	 */
	public CreateCourse() {
		
		JComboBox hole0 = new JComboBox();
		hole0.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole0.setSelectedIndex(1);
		
		JComboBox hole1 = new JComboBox();
		hole1.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole1.setSelectedIndex(1);
		
		JComboBox hole2 = new JComboBox();
		hole2.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole2.setSelectedIndex(1);
		
		JComboBox hole3 = new JComboBox();
		hole3.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole3.setSelectedIndex(1);
		
		JComboBox hole4 = new JComboBox();
		hole4.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole4.setSelectedIndex(1);
		
		JComboBox hole5 = new JComboBox();
		hole5.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole5.setSelectedIndex(1);
		
		JComboBox hole6 = new JComboBox();
		hole6.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole6.setSelectedIndex(1);
		
		JComboBox hole7 = new JComboBox();
		hole7.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole7.setSelectedIndex(1);
		
		JComboBox hole8 = new JComboBox();
		hole8.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole8.setSelectedIndex(1);
		
		JComboBox hole9 = new JComboBox();
		hole9.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole9.setSelectedIndex(1);
		
		JComboBox hole10 = new JComboBox();
		hole10.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole10.setSelectedIndex(1);
		
		JComboBox hole11 = new JComboBox();
		hole11.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole11.setSelectedIndex(1);
		
		JComboBox hole12 = new JComboBox();
		hole12.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole12.setSelectedIndex(1);
		
		JComboBox hole13 = new JComboBox();
		hole13.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole13.setSelectedIndex(1);
		
		JComboBox hole14 = new JComboBox();
		hole14.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole14.setSelectedIndex(1);
		
		JComboBox hole15 = new JComboBox();
		hole15.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole15.setSelectedIndex(1);
		
		JComboBox hole16 = new JComboBox();
		hole16.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole16.setSelectedIndex(1);
		
		JComboBox hole17 = new JComboBox();
		hole17.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		hole17.setSelectedIndex(1);
		
		JButton btnFinalizeCourse = new JButton("Finalize Course");
		btnFinalizeCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//finalize course button pressed
			}
		});
		
		txtCourseName = new JTextField();
		txtCourseName.setColumns(10);
		
		JLabel lblCourseName = new JLabel("Course Name: ");
		
		JLabel lblPleaseSelectHole = new JLabel("Please select hole par values:");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(69)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(hole6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(hole0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(hole12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(hole17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(13)
									.addComponent(lblCourseName)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtCourseName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnFinalizeCourse))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(154)
							.addComponent(lblPleaseSelectHole)))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(lblPleaseSelectHole)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(hole0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(hole6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(hole12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(hole17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCourseName)
						.addComponent(txtCourseName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFinalizeCourse))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
