import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewWindow  extends JInternalFrame{
	
	NewWindow()
	{
		
		setTitle("New Window");
		setSize(300,300);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);
		setLayout(null);

		JLabel l1=new JLabel("Enter Name");
		l1.setBounds(10,20,100,30);
		JTextField t1=new JTextField();
		t1.setBounds(120,20,130,30);
		JLabel l2= new JLabel("Enter Amount");
		l2.setBounds(10, 50, 100, 30);
		JTextField t2 =new JTextField();
		t2.setBounds(120, 50, 130, 30);
		t2.setInputVerifier(getInputVerifier());
		
		JButton b1=new JButton("Submit");
		b1.setBounds(60, 100, 110,30);
		
		add(l1);
		add(l2);
		add(t2);
		add(t1);
		add(b1);
		
	}

	

}
