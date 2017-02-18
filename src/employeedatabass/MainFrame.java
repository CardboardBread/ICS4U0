package employeedatabass;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;

public class MainFrame extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar ActionBar = new JToolBar();
		
		JPanel ListFrame = new JPanel();
		ListFrame.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel ViewPane = new JPanel();
		ViewPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JToolBar MainBar = new JToolBar();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ViewPane, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
						.addComponent(MainBar, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ListFrame, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
						.addComponent(ActionBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(MainBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ActionBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ListFrame, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
						.addComponent(ViewPane, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JList list = new JList();
		ListFrame.add(list);
		
		JButton addButton = new JButton("Add");
		ActionBar.add(addButton);
		
		JButton editButton = new JButton("Edit");
		ActionBar.add(editButton);
		
		JButton deleteButton = new JButton("Delete");
		ActionBar.add(deleteButton);
		
		JButton searchButton = new JButton("Search");
		ActionBar.add(searchButton);
		
		JButton loadButton = new JButton("Load");
		MainBar.add(loadButton);
		
		JButton saveButton = new JButton("Save");
		MainBar.add(saveButton);
		
		JButton newButton = new JButton("Create New");
		MainBar.add(newButton);
		
		JButton exitButton = new JButton("Exit");
		MainBar.add(exitButton);
		getContentPane().setLayout(groupLayout);
	}
}
