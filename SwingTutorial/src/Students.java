import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Students {

	private JFrame frame;
	private JRadioButton b1,b2;
	private JComboBox tcourse;
	private JPasswordField tpass;
	private JTextField tname,troll;
	
	public  Students()
	{
		initComonents();
	}
	
	private void initComonents()
	{
		//create a frame  container
		frame = new JFrame("Students Details");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		//initilize all the components
		JLabel l1=new JLabel("Enter Name");
		JLabel l2=new JLabel("Enter Roll");
		JLabel l3=new JLabel("Enter Passward");
		JLabel l4=new JLabel("Gender");
		JLabel l5=new JLabel("Select Course");
		
		tname=new JTextField();
		troll=new JTextField();
		tpass=new JPasswordField();
		b1=new JRadioButton("Male");
		b1.setSelected(true);
		b2=new JRadioButton("Female");
		ButtonGroup bg =new ButtonGroup();
		bg.add(b1);
        bg.add(b2);
        
        //add data in the combobox
        String[] data= {"Select course","A","B","C","D","E"};
        tcourse=new JComboBox(data);
        
        JButton bb1=new JButton("Submit");
        
        //set the position of component
        l1.setBounds(30, 30, 120, 30);
        l2.setBounds(30, 70, 120, 30);
        l3.setBounds(30, 110, 120, 30);
        l4.setBounds(30, 150, 120, 30);
        l5.setBounds(30, 190, 120, 30);
       
        tname.setBounds(190,30,150,30);
        troll.setBounds(190,70,150,30);
        tpass.setBounds(190,110,150,30);
        
        b1.setBounds(190,150,70,30);
        b2.setBounds(260,150,70,30);
        tcourse.setBounds(190,190,150,30);
        bb1.setBounds(120,250,100,30);
       
        
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(tname);
        frame.add(troll);
        frame.add(tpass);
        frame.add(b1);
        frame.add(b2);
        frame.add(tcourse);
        frame.add(bb1);
        
        tname.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		if(Character.isDigit(e.getKeyChar()))
        		{
        			java.awt.Toolkit.getDefaultToolkit().beep();
        			e.consume();
        		}
        	}
		});
        
        troll.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		if(!Character.isDigit(e.getKeyChar()))
        		{
        			java.awt.Toolkit.getDefaultToolkit().beep();
        			e.consume();
        		}
        	}
		});
        
        bb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	       logic();
				
			}
		});
        bb1.addKeyListener(new KeyAdapter() {
        	
        	@Override
        	public void keyTyped(KeyEvent e) {
        		logic();
        	}
		});

		bb1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				logic();

			}
		});

		bb1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.GREEN);
			}
		});
        
        frame.setVisible(true);
        
        
        
        
        
	}
	private void logic () {
		if (valid()) {
			String gender = "";
			if (b1.isSelected()) {
				gender = "male";
			} else {
				gender = "female";
			
		System.out.println(name);
		System.out.println(roll);
		System.out.println(pass);
		System.out.println(course);
		System.out.println(gender);
		
			}
		}
	}
	
	private  String name,roll,pass,course;
	private boolean valid()
	{
		
		name=tname.getText();
		roll=troll.getText();
		pass=String.valueOf(tpass.getPassword());
		course=tcourse.getSelectedItem().toString();
		
		if(name.isEmpty())
		{
			showWaring(frame,"please enter name");
	     	return false;
		}else if(roll.isEmpty())
		{
			showWaring(frame, "please enter Roll Number");
			return false;
		}else if(pass.isEmpty())
		{
			showWaring(frame, "please enter passward");
			return false;
		}else if(course.equalsIgnoreCase("selected course"))
		{
			showWaring(frame, "please select course");
		}
		else {
			
			return true;
		
		//return false;
		//return true;
		
		}
		return true;
	}
	
	
	private void showWaring(Component cmp,String msg)
	{
		JOptionPane.showMessageDialog(cmp , msg, "waring message", JOptionPane.WARNING_MESSAGE);
	}
	
	public static void main(String[] args) {
		new Students();
	}
}
