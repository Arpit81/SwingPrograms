import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;


public class First {
	public static void main(String[] args)
	{
		JWindow w=new JWindow();
		w.setSize(400,300);
	
		w.setLocationRelativeTo(null);
		//JLabel l1=new JLabel("Hello Arpit,This is your Splash file",JLabel.CENTER);
		Icon ic=new ImageIcon("C:\\Users\\Arpit\\Pictures\\Saved Pictures\\arpit.jpg");
		JLabel l1=new JLabel(ic);
		w.add(l1);
		w.setVisible(true);
	}

}
