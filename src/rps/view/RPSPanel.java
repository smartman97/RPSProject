package rps.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import rps.controller.RPSController;

public class RPSPanel extends JPanel
{
	private RPSController baseController;
	private SpringLayout baseLayout;
	private JButton rockButton;
	private JButton paperButton;
	private JButton scissorsButton;
	private JButton rockButton2;
	private JButton paperButton2;
	private JButton scissorsButton2;
	private JButton modeButton;
	private JButton modeButton2;
	private JLabel tiesLabel;
	private JLabel winsLabel;
	private JLabel losesLabel;
	private JLabel resultsLabel;
	private JLabel player1Label;
	private JLabel player2Label;
	
	public RPSPanel(RPSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rockButton = new JButton("Rock");
		paperButton = new JButton("Paper");
		scissorsButton = new JButton("Scissors");
		rockButton2 = new JButton("Rock");
		
		paperButton2 = new JButton("Paper");
		
		scissorsButton2 = new JButton("Scissors");
		
		modeButton = new JButton("PLayer vs Player");
		modeButton2 = new JButton("Player vs Computer");
		
		tiesLabel = new JLabel("Ties: " + baseController.getTies());
		winsLabel = new JLabel("Wins: " + baseController.getWins());
		losesLabel = new JLabel("Loses: " + baseController.getLoses());
		resultsLabel = new JLabel("Click to play ROCK, PAPER, SCISSORS!");
		player1Label = new JLabel("Player 1: ");
		
		
		player2Label = new JLabel("Player 2: ");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	//Puts all the components on the panel.
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(rockButton);
		this.add(paperButton);
		this.add(scissorsButton);
		
		this.add(rockButton2);
		this.add(paperButton2);
		this.add(scissorsButton2);
		
		this.add(modeButton);
		this.add(modeButton2);
		
		this.add(tiesLabel);
		this.add(winsLabel);
		this.add(losesLabel);
		this.add(resultsLabel);
		
		this.add(player1Label);
		this.add(player2Label);
		
		player1Label.setVisible(false);
		player2Label.setVisible(false);
		
		rockButton2.setVisible(false);
		paperButton2.setVisible(false);
		scissorsButton2.setVisible(false);
		
		this.setBackground(Color.GREEN);
	}
	
	//Garbage layout code.
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rockButton, 35, SpringLayout.SOUTH, resultsLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, resultsLabel, 33, SpringLayout.SOUTH, tiesLabel);
		baseLayout.putConstraint(SpringLayout.EAST, resultsLabel, 0, SpringLayout.EAST, tiesLabel);
		baseLayout.putConstraint(SpringLayout.WEST, losesLabel, 43, SpringLayout.EAST, winsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, tiesLabel, 54, SpringLayout.EAST, losesLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, losesLabel, 0, SpringLayout.NORTH, winsLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, tiesLabel, 0, SpringLayout.NORTH, winsLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, winsLabel, 37, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, winsLabel, 84, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 0, SpringLayout.WEST, tiesLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, scissorsButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.NORTH, paperButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, paperButton, 51, SpringLayout.EAST, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, rockButton, 41, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, player2Label, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, player1Label, 0, SpringLayout.EAST, player2Label);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2Label, -6, SpringLayout.NORTH, rockButton2);
		baseLayout.putConstraint(SpringLayout.SOUTH, player1Label, -6, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, rockButton2, -31, SpringLayout.NORTH, modeButton);
		baseLayout.putConstraint(SpringLayout.WEST, modeButton, 36, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, modeButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, scissorsButton2, 0, SpringLayout.NORTH, rockButton2);
		baseLayout.putConstraint(SpringLayout.EAST, scissorsButton2, 0, SpringLayout.EAST, scissorsButton);
		baseLayout.putConstraint(SpringLayout.NORTH, paperButton2, 0, SpringLayout.NORTH, rockButton2);
		baseLayout.putConstraint(SpringLayout.EAST, paperButton2, 0, SpringLayout.EAST, paperButton);
		baseLayout.putConstraint(SpringLayout.WEST, rockButton2, 0, SpringLayout.WEST, rockButton);
		baseLayout.putConstraint(SpringLayout.NORTH, modeButton2, 0, SpringLayout.NORTH, modeButton);
		baseLayout.putConstraint(SpringLayout.EAST, modeButton2, 0, SpringLayout.EAST, scissorsButton);
	}
	
	//Adds the action to each of the buttons.
	public void setupListeners()
	{
		rockButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				resultsLabel.setText(baseController.getWinner(1));
				winsLabel.setText("Wins: " + baseController.getWins());
				losesLabel.setText("Loses: " + baseController.getLoses());
				tiesLabel.setText("Ties: " + baseController.getTies());
			}
		});
		
		paperButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				resultsLabel.setText(baseController.getWinner(2));
				winsLabel.setText("Wins: " + baseController.getWins());
				losesLabel.setText("Loses: " + baseController.getLoses());
				tiesLabel.setText("Ties: " + baseController.getTies());
			}
		});
		
		scissorsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				resultsLabel.setText(baseController.getWinner(3));
				winsLabel.setText("Wins: " + baseController.getWins());
				losesLabel.setText("Loses: " + baseController.getLoses());
				tiesLabel.setText("Ties: " + baseController.getTies());
			}
		});
		
		modeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				resultsLabel.setText("User vs User");
				baseController.setWins(0);
				baseController.setLoses(0);
				baseController.setTies(0);
				
				winsLabel.setText("Wins: " + baseController.getWins());
				losesLabel.setText("Loses: " + baseController.getLoses());
				tiesLabel.setText("Ties: " + baseController.getTies());
				
				player1Label.setVisible(true);
				player2Label.setVisible(true);
				
				rockButton2.setVisible(true);
				paperButton2.setVisible(true);
				scissorsButton2.setVisible(true);
			}
		});
		
		modeButton2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				resultsLabel.setText("Player vs Computer");
				baseController.setWins(0);
				baseController.setLoses(0);
				baseController.setTies(0);
				
				winsLabel.setText("Wins: " + baseController.getWins());
				losesLabel.setText("Loses: " + baseController.getLoses());
				tiesLabel.setText("Ties: " + baseController.getTies());
				
				player1Label.setVisible(false);
				player2Label.setVisible(false);
				
				rockButton2.setVisible(false);
				paperButton2.setVisible(false);
				scissorsButton2.setVisible(false);
			}
		});
	}
}
