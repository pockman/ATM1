
import java.awt.BorderLayout;

import javax.swing.JFrame;


public class GuiATM extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GuiATM(){
		GuiKeyPad keypad = new GuiKeyPad();
        add(keypad,BorderLayout.WEST);
        
        GuiScreen screen = new GuiScreen();
        add(screen,BorderLayout.NORTH);
	}
}
