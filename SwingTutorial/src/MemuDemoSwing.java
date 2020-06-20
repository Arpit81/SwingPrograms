import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MemuDemoSwing {
	
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Menu");
		
		JDesktopPane dp=new JDesktopPane();
		frame.add(dp);
		
		JMenuBar mb= new JMenuBar();
		frame.add(mb,BorderLayout.NORTH);
		JMenu m1=new JMenu("File");
		mb.add(m1);
		
		JMenuItem mi1=new JMenuItem("New");
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		mi1.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						New n=new New();
				      dp.add(n);
			     	n.setVisible(true);
						
					}
			
				});
		JMenuItem mi2=new JMenuItem("New Window");
		mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK));
		
		mi2.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
					NewWindow nw=new NewWindow();
					dp.add(nw);
					nw.setVisible(true);
						
					}
			
				});
		
        JMenuItem mi3=new JMenuItem("Save");
        mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        mi3.addActionListener(new ActionListener()
        		
        		{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Save");
						
					}
        	
        		});
        
        JMenuItem mi4=new JMenuItem("Save As");
        mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.VK_SHIFT));
        mi4.addActionListener(new ActionListener()
        		{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Save As");
						
					}
        	
        		}
        		
        		);
        JMenuItem mi5=new JMenuItem("Page Setup");
        mi5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_CAPS_LOCK, KeyEvent.CTRL_DOWN_MASK));
        mi5.addActionListener(new ActionListener()
        		
        		{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Page Setup");
						
					}
        	
        		});
        JMenuItem mi6=new JMenuItem("Print");
        mi6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
        mi6.addActionListener(new ActionListener()
        		{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Print");
						
					}
        	
        		});
        JMenuItem mi7=new JMenuItem("Exit");
        mi7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
        mi7.addActionListener(new ActionListener()
        		
        		{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Exit");
						
					}
        	
        		});
		
        m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);
		m1.add(mi6);
		m1.add(mi7);
		
		JMenu m2=new JMenu("Edit");
		mb.add(m2);
		
		
		JMenuItem mj1=new JMenuItem("Undo");
		mj1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK));

		mj1.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Undo");
						
					}
			
				});
		JMenuItem mj2=new JMenuItem("Cut");		
		mj2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));

		mj2.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Cut");
						
					}
			
				});

		JMenuItem mj3=new JMenuItem("Copy");
		mj3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));

		mj3.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Copy");
						
					}
			
				});

		JMenuItem mj4=new JMenuItem("Paste");
		mj4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));

		mj4.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Paste");
						
					}
			
				});

		JMenuItem mj5=new JMenuItem("Delete");
		mj5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK));

		mj5.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Delete");
						
					}
			
				});

		JMenuItem mj6=new JMenuItem("Search with Bing");
		mj6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK));

		mj6.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Search with Bing");
						
					}
			
				});

		JMenuItem mj7=new JMenuItem("Find");
		mj7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));

		mj7.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Find");
						
					}
			
				});

		JMenuItem mj8=new JMenuItem("Find Next");
		mj8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

		mj8.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Find Next");
						
					}
			
				});

		JMenuItem mj9=new JMenuItem("Find Previous");
		mj9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));

		mj9.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Find Previous");
						
					}
			
				});

		JMenuItem mj10=new JMenuItem("Go To");
		mj10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_DOWN_MASK));

		mj10.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Go To");
						
					}
			
				});

		JMenuItem mj11=new JMenuItem("Select All");
		mj11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));

		mj11.addActionListener(new ActionListener()		
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Sellect All");
						
					}
			
				});

	

		JMenuItem mj12=new JMenuItem("Time/Date");
		mj12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_DOWN_MASK));
		mj12.addActionListener(new ActionListener()		
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Time/Date");
				
			}
	
		});

		
		m2.add(mj1);
		m2.add(mj2);
		m2.add(mj3);
		m2.add(mj4);
		m2.add(mj5);
		m2.add(mj6);
		m2.add(mj7);
		m2.add(mj8);
		m2.add(mj9);
		m2.add(mj10);
		m2.add(mj11);
		m2.add(mj12);
	
		
		JMenu m3=new JMenu("Format");
		mb.add(m3);
		
		  JMenuItem mk1=new JMenuItem("Word Wrap");
		  JMenuItem mk2=new JMenuItem("Font..");
		  
		  m3.add(mk1);
		  m3.add(mk2);
		  
		  
		  
		  
		  JMenu m4=new JMenu("View");
			mb.add(m4);
		  
		  

			  JMenuItem ml1=new JMenuItem("Zoom");
			  ml1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
 					View v=new View();
	  			   dp.add(v);
			      	v.setVisible(true);
		 			
				}
			});
			  JMenuItem ml2=new JMenuItem("Status Bar");
			  
			  m4.add(ml1);
			  m4.add(ml2);
		  
			  
			  JMenu m5=new JMenu("Help");
				mb.add(m5);

				  JMenuItem mm1=new JMenuItem("View Help");
				  JMenuItem mm2=new JMenuItem("Send Feadback");
				  JMenuItem mm3=new JMenuItem("About Us");
				  
				  m5.add(mm1);
				  m5.add(mm2);
				  m5.add(mm3);
				
			  
	
		frame.setVisible(true);
	
	 }
	}