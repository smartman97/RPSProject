package rps.controller;

import rps.model.Game;
import rps.view.RPSFrame;

public class RPSController
{
	private RPSFrame baseFrame;
	private Game myGame;
	private String myWinner;
	
	public RPSController()
	{
		myGame = new Game();
		baseFrame = new RPSFrame(this);
	}
	
	public void start()
	{
		myWinner = myGame.getWinner(0);
	}
	
	
}
