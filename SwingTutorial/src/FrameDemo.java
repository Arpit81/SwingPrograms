import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameDemo {

	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Arpit");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
		frame.setResizable(false);
		frame.setLayout(null);
		
		JButton b1=new JButton("Add");
		b1.setBounds(20, 20, 100, 30);
	
	

		JButton b2=new JButton("Add");
		b2.setBounds(20, 60, 100, 30);
	
		
		JButton b3=new JButton("Add");
		b3.setBounds(20, 100, 100, 30);
	
		
		JButton b4=new JButton("Add");
		b4.setBounds(20, 140, 100, 30);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.setVisible(true);
		
	}
}
