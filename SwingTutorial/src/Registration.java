import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setTitle("Login");
		setBackground(new Color(173, 216, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 437);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setForeground(new Color(230, 230, 250));
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 153));
		panel.setBackground(new Color(102, 102, 153));
		panel.setBounds(10, 397, 491, -400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(230, 99, 164, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JPasswordField pf=new JPasswordField();
		//textField_1 = new JTextField();
		pf.setColumns(10);
		pf.setBounds(230, 166, 164, 33);
		contentPane.add(pf);
		/*
		ButtonGroup bg=new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female\r\n");
		rdbtnNewRadioButton.setBounds(275, 250, 69, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMale = new JRadioButton("Male\r\n");
		rdbtnMale.setBounds(159, 250, 69, 23);
		contentPane.add(rdbtnMale);
		
		bg.add(rdbtnMale);
		bg.add(rdbtnNewRadioButton);*/
		JCheckBox cb=new JCheckBox("Terms & Condition");
		cb.setOpaque(false);
		cb.setFocusTraversalKeysEnabled(false);
		cb.setForeground(Color.BLUE);
		cb.setBounds(182,245,142,30);
		JLabel lblNewLabel = new JLabel("User_Name");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(new Color(153, 102, 0));
		lblNewLabel.setBounds(49, 104, 85, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblId = new JLabel("Password");
		lblId.setForeground(Color.BLUE);
		lblId.setBackground(new Color(102, 204, 204));
		lblId.setBounds(49, 171, 85, 23);
		contentPane.add(lblId);
		
		Button b1=new Button("Login");
		b1.setForeground(Color.BLUE);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b1.setBounds(196, 322, 85, 30);
		contentPane.add(b1);
		contentPane.add(cb);
	}
}
