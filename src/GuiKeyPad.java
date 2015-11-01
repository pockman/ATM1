
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import java.awt.event.*;



public class GuiKeyPad extends Panel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str="";
	private JButton[] buttons;
	private static final String[] names=
		{"1","2","3","4","5","6","7","8","9","0","Delete","Enter"};
	private GridLayout gridLayout;

	static int i; 
	
	public GuiKeyPad()
	{
		gridLayout=new GridLayout(4,3);
		buttons=new JButton[12];
		for(int count=0;count<12;count++)
		{
			buttons[count]=new JButton(names[count]);
			add(buttons[count]);
		}
		setLayout(gridLayout);
		
		for (i=0; i < 9; i ++){
	        buttons[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e)
	            {
	                getKeyPadInput(i);
	                System.out.println(str);
	                setString();
	            }
	        });
		}
		
		buttons[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	deleteKeyPressed();
            	System.out.println(str);
            	setString();
            }
        });
		
		buttons[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	enterKeyPressed();
            	System.out.println(str);
            	setString();
            }
        });
	}
	
	private String getKeyPadInput(int digit){
		str+=names[digit];
		System.out.println(str);
		return str;
	}
	
	private String deleteKeyPressed(){
		str="";
		System.out.println(str);
		return str;
	}
	
	private String enterKeyPressed(){
		System.out.println(str);
		return str;
	}
	
	public String getString(){
		return str;
	}
	
	
}
