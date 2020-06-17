import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;

public class ImageSwing {
public static void main(String[] args)
{
	JWindow w = new JWindow();
	w.setSize(400,300);
   w.setLocationRelativeTo(null);
	
	
   ImageIcon ic=new ImageIcon("C:\\Users\\Arpit\\Desktop\\apniphoto1.jpeg");
   //JLabel jimage=new JLabel(ic);
   ImageIcon resizeImage = resize(ic, 400, 300);
	JLabel jimage = new JLabel(resizeImage);
   w.add(jimage);

	                                                                                                                                                                              
	
	JProgressBar pb=new JProgressBar();
	pb.setStringPainted(true);
	w.add(pb, BorderLayout.SOUTH);
	w.setVisible(true);
	for(int i=0;i<=100;i++) {
		pb.setValue(i);
		try {
			Thread.sleep(100);
		} catch (Exception e) {}
	}

	if(pb.getValue()==100) {
    w.dispose();
	}
}


private static ImageIcon resize(ImageIcon im, int w, int h) {
	BufferedImage bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
	Graphics2D gd = (Graphics2D) bi.createGraphics();
	gd.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
	gd.drawImage(im.getImage(), 0, 0, w, h, null);
	gd.dispose();
	return new ImageIcon(bi);
}
}
