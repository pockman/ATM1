import java.awt.Color;
import java.awt.Panel;

import javax.swing.JTextArea;


public class GuiScreen extends Panel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea txt;
	
	public GuiScreen(){
		txt=new JTextArea();
		add(txt);
		setBackground(new Color(240,255,255));
		//txt.setOpaque(false);
		txt.setSize(650,200);
		
		/*public void show(String str){
			txt.setText(str);
			//txt.append(str+"\n");
		}
		*/
	}
	void show(String str){
		txt.setText(txt.getText()+str);
		System.out.println(txt.getText());
		txt.append(str+"\n");
	}
}
