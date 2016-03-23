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
	
	public String getWinner(int userChoice)
	{
		return myGame.getWinner(userChoice);
	}
	
	public int getWins()
	{
		return myGame.getWins();
	}
	
	public int getLoses()
	{
		return myGame.getLoses();
	}
	
	public int getTies()
	{
		return myGame.getTies();
	}
}
