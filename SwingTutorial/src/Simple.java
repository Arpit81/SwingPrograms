import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class Simple {

	public static void main(String[] args)
	{
		
		JWindow w =new JWindow();
		w.setSize(300, 400);
		w.setLocationRelativeTo(null);
       
		Icon ic=new ImageIcon("C:\\Users\\Arpit\\Pictures\\a.jpg");

		JLabel l1=new JLabel(ic);
		w.add(l1);
		w.setVisible(true);
		
	}
}
