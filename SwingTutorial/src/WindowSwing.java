import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JWindow;

public class WindowSwing {

	public static void main(String[] args)
	{
	
		JWindow w=new JWindow();
		w.setSize(400,300);
		w.setLocationRelativeTo(null);
		
		//add buttion in a container
		JButton b1=new JButton("Hello");
		//default  postion in center 
	    	w.add(b1);
		//to specify north postion
		//w.add(b1, BorderLayout.NORTH);
		//to specify south postion
		//w.add(b1, BorderLayout.SOUTH);
		//to specify east postion
		//w.add(b1, BorderLayout.EAST);
		//to specify west postion
		//w.add(b1, BorderLayout.WEST);
		//if you want to customize the postion manually
		//w.setLayout(null);
		////b1.setBounds(100, 30, 300, 200);
		//w.add(b1);
		w.setVisible(true);
	}

}
