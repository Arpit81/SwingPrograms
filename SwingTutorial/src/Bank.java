import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Bank {
	public static void main( String[] args) {
	
		
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Students Details");
		frame.setLayout(null);
		
		
		JLabel l1=new JLabel("Enter Name");
		JLabel l2=new JLabel("Enter roll");
		JLabel l3 =new JLabel("Password");
		JLabel l4=new JLabel("Gender");
	    JLabel l5=new JLabel("Courses");
	    
	    
		 
		l1.setBounds(30, 30, 120, 30);
		l2.setBounds(30, 70, 120, 30);
		l3.setBounds(30, 110, 120, 30);
		l4.setBounds(30, 150, 120, 30);
		l5.setBounds(30, 190, 120, 30);
 		
		 JTextField tname=new JTextField();
		 JTextField	troll=new JTextField();
		JPasswordField	pass=new JPasswordField();
	      ButtonGroup bg =new ButtonGroup();
		JRadioButton b1=new JRadioButton("Male");
		 bg.add(b1);
		JRadioButton b2=new JRadioButton("Female");
		bg.add(b2);
		JComboBox  tcourse=new JComboBox();

	    String[] data= {"A","B","C","D"};
	     tcourse = new JComboBox(data);
	
	
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(tname);
		frame.add(troll);
		frame.add(pass);
		
	
		frame.add(tcourse);
		tname.setBounds(190, 30, 150, 30);
		troll.setBounds(190, 70, 150, 30);
		pass.setBounds(190, 110, 150, 30);
		b1.setBounds(190, 150,  60, 30);
		b2.setBounds(250, 150, 100, 30);
		tcourse.setBounds(210, 190, 120, 30);
		
		frame.add(b1);
		frame.add(b2);
		Button bb1=new Button("Submit");
		bb1.setBounds(130, 250, 100, 30);
		bb1.setBackground(Color.green);
		frame.add(bb1);
		frame.setVisible(true);
		
		
		bb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Submit");
				
			}
		});
		
	
	}

}
