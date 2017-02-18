package panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LoginField extends JFrame {
	
	private static final long serialVersionUID = 1423467374550632605L;
	private JLabel labelUsername = new JLabel("Enter Username: ");
	private JLabel labelPassword = new JLabel("Enter Password: ");
	private JTextField textUsername = new JTextField(20);
	private JPasswordField fieldPassword = new JPasswordField(20);
	private JButton buttonLogin = new JButton("Login");
	private JButton buttonSignUp = new JButton("Sign Up");

	public LoginField() {
		super("JPanel Login Dialog");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;
		panel.add(labelUsername, constraints);
		
		constraints.gridx = 1;
		panel.add(textUsername, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(labelPassword, constraints);
		
		constraints.gridx = 1;
		panel.add(fieldPassword, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		panel.add(buttonLogin, constraints);
		
		constraints.anchor = GridBagConstraints.EAST;
		panel.add(buttonSignUp, constraints);
				
		panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Login Panel"));
		
		add(panel);
		pack();
		setLocationRelativeTo(null);
	}
	
	public static void main (String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable () {
			@Override
			public void run() {
				new LoginField().setVisible(true);
			}
		});
	}

}
