package rps.view;

import javax.swing.JFrame;

import rps.controller.RPSController;

public class RPSFrame extends JFrame
{
	private RPSController baseController;
	private RPSPanel basePanel;
	
	public RPSFrame(RPSController baseController)
	{
		this.baseController = baseController;
		basePanel = new RPSPanel(baseController);
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 300);
		this.setTitle("Rock, Paper, Scissors");
		this.setVisible(true);
	}
}
