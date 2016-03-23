package rps.model;

import java.util.Random;

public class Game
{
	public int wins = 0;
	public int loses = 0;
	public int ties = 0;
	
	public int computerChoice()
	{
		Random rand = new Random();
		
		int compChoice = rand.nextInt(3) + 1;
		
		return compChoice;
	}
	
	public String getWinner(int userChoice)
	{
		String winner = "";
		int compChoice = computerChoice();
		
		if(userChoice == compChoice)
		{
			winner = "It's a tie!";
			ties++;
		}
		else if(userChoice == 1 && compChoice == 3)
		{
			winner = "Rock beats Scissors!";
			wins++;
		}
		else if(userChoice == 2 && compChoice == 1)
		{
			winner = "Paper beats Rock!";
			wins++;
		}
		else if(userChoice == 3 && compChoice == 2)
		{
			winner = "Scissors beats Paper!";
			wins++;
		}
		else if(compChoice == 1 && userChoice == 3)
		{
			winner = "Scissors loses to Rock...";
			loses++;
		}
		else if(compChoice == 2 && userChoice == 1)
		{
			winner = "Rock loses to Paper...";
			loses++;
		}
		else if(compChoice == 3 && userChoice == 2)
		{
			winner = "Paper loses to Scissors...";
			loses++;
		}
		return winner;
	}
	
	public int getWins()
	{
		return wins;
	}
	
	public int getLoses()
	{
		return loses;
	}
}
