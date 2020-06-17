import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FirstSwingApplication {
	
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("swing Application");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	;
		
		
		frame.setLayout(null);
		
		
		JTextField t1=new JTextField();
		t1.setBounds(50, 10, 150, 35);
		
		JTextField t2=new JTextField();
		t2.setBounds(50, 50, 150, 35);
		
		JButton b1=new JButton("Add");
		b1.setBounds(70, 90, 60, 30);
		
		
	
				b1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						String f1=t1.getText();
						String f2=t2.getText();
						int i=Integer.parseInt(f1);
						int j=Integer.parseInt(f2);
						//System.out.println(i+j);
						JOptionPane.showMessageDialog(null, i+j);
					
					}
					
				});
		
		frame.add(t1);
		frame.add(t2);
		frame.add(b1);
		frame.setVisible(true);
	}

}
