package employeedatabass;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BinaryDialog extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 6565872643053325013L;
	private JButton yesButton;
	private JButton noButton;
	private JLabel text;
	private int state;
	private String yesText;
	private String noText;
	private String dialogText;

	public BinaryDialog(String yes, String no, String title, String content) {
		super(title);
		yesText = yes;
		noText = no;
		dialogText = content;
	}
	
	public boolean yesNo () {
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		state = -1;
		buildDialog (yesText, noText, dialogText);
		while (state == -1) {
			
		}
		if (state == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	private void buildDialog (String yes, String no, String content) {
		yesButton = new JButton(yes);
		noButton = new JButton(no);
		text = new JLabel(content);
		
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		panel.add(text, constraints);
		
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panel.add(yesButton, constraints);
		yesButton.addActionListener(this);
		yesButton.setActionCommand("Accept");
		
		constraints.gridx = 1;
		panel.add(noButton, constraints);
		noButton.addActionListener(this);
		noButton.setActionCommand("Reject");
		
		add(panel);
		pack();
		setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command == "Accept") {
			System.out.println("Accept");
			state = 1;
		} else if (command == "Reject") {
			System.out.println("Reject");
			state = 0;
		}
	}
	
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable () {
			@Override
			public void run() {
				try {
					BinaryDialog dialog = new BinaryDialog("Yes", "No", "Test", "This is a test dialog.");
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
