import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDemo {

	public static void main(String[] args)
	{
		JFrame frame =new JFrame("Arpit Mangal");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JPanel phead=new JPanel();
		phead.setSize(400, 100);
		phead.setBackground(Color.RED);
		frame.add(phead);
		JButton b1=new JButton("Login 1");
		JButton b2=new JButton("Login 2");
		JButton b3=new JButton("Login 3");
		JButton b4=new JButton("Login 4");
		phead.add(b1);
		phead.add(b2);
		phead.add(b3);
		phead.add(b4);
		
		
		b4.addActionListener(new ActionListener()
				
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Hello world");
						
					}
			
				});
			
		

		b1.addActionListener(new ActionListener()
				
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Hello Arpit");
						
					}
			
				});
		
		b2.addActionListener( new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("login2");
						
					}
			
				});
		b3.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Login3");
						
					}
			
				});
		
		
		
			
		frame.setVisible(true);
	}
}
