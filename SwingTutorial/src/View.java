import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;






public class View extends JInternalFrame {
	 public  View()
	{
		setTitle("Table Testing Page"); 
		setSize(300,300);
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setLayout(null);
		
		String[] cols= {"Name","Date","Money"};
		DefaultTableModel dt =new DefaultTableModel(cols,0);
		
	
		JTable jt =new JTable(dt);
		JScrollPane js=new JScrollPane(jt);
		
		
		
		for(int i=0;i<=10;i++)
		{
			dt.addRow(new Object[] {"Arpit","2020/3/12",1000+i});
		}
			/*	jt.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String name = (String) dt.getValueAt(jt.getSelectedRow(), 0);
					String date = (String) dt.getValueAt(jt.getSelectedRow(), 1);
					int data = (int) dt.getValueAt(jt.getSelectedRow(), 2);
					System.out.println(name+"\t"+date+"\t"+data);
				}
			
			});*/
				
				//how to delete row from table
				jt.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						//super.mouseClicked(e);
						dt.removeRow(jt.getSelectedRow());
					}
				});
			add(js);
			add(jt);
			jt.setBounds(10, 10, 260, 260);
			jt.setVisible(true);
	
	}
	


	}


  
