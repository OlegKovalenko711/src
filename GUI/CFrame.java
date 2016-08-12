package GUI;

import javax.swing.JFrame;

public class CFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CFrame()
	{
		
		setSize(400,200);
		setTitle("Convertor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new CPanel());
		setVisible(true);		
	}
}