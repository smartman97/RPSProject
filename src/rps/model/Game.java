package rps.model;

import java.util.Random;

public class Game
{
	public int wins = 0;
	public int loses = 0;
	public int ties = 0;
	
	//Generates a random computer choice of three options.
	public int computerChoice()
	{
		Random rand = new Random();
		
		int compChoice = rand.nextInt(3) + 1;
		
		return compChoice;
	}
	
	//Compares the users choice with the computers.
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
	
	public String getPlayerWinner(int userChoice, int userChoice2)
	{
		String winner = "";
		
		if(userChoice == userChoice2)
		{
			winner = "It's a tie!";
			ties++;
		}
		else if(userChoice == 1 && userChoice2 == 3)
		{
			winner = "Rock beats Scissors!";
			wins++;
		}
		else if(userChoice == 2 && userChoice2 == 1)
		{
			winner = "Paper beats Rock!";
			wins++;
		}
		else if(userChoice == 3 && userChoice2 == 2)
		{
			winner = "Scissors beats Paper!";
			wins++;
		}
		else if(userChoice2 == 1 && userChoice == 3)
		{
			winner = "Scissors loses to Rock...";
			loses++;
		}
		else if(userChoice2 == 2 && userChoice == 1)
		{
			winner = "Rock loses to Paper...";
			loses++;
		}
		else if(userChoice2 == 3 && userChoice == 2)
		{
			winner = "Paper loses to Scissors...";
			loses++;
		}
		
		return winner;
	}
	
	//Gets the wines, loses, and ties.
	
	public int getWins()
	{
		return wins;
	}
	
	public int getLoses()
	{
		return loses;
	}
	
	public int getTies()
	{
		return ties;
	}

	//Sets the wins, loses, and ties.
	
	public void setWins(int wins)
	{
		this.wins = wins;
	}

	public void setLoses(int loses)
	{
		this.loses = loses;
	}

	public void setTies(int ties)
	{
		this.ties = ties;
	}
	
}
