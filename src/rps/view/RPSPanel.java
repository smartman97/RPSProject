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
	private JButton modeButton;
	private JLabel tiesLabel;
	private JLabel winsLabel;
	private JLabel losesLabel;
	private JLabel resultsLabel;
	
	public RPSPanel(RPSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rockButton = new JButton("Rock");
		paperButton = new JButton("Paper");
		
		scissorsButton = new JButton("Scissors");
		
		modeButton = new JButton("Change Mode");
		
		tiesLabel = new JLabel("Ties: " + baseController.getTies());
		
		winsLabel = new JLabel("Wins: " + baseController.getWins());
		
		losesLabel = new JLabel("Loses: " + baseController.getLoses());
		
		resultsLabel = new JLabel();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(rockButton);
		this.add(paperButton);
		this.add(scissorsButton);
		this.add(modeButton);
		this.add(tiesLabel);
		this.add(winsLabel);
		this.add(losesLabel);
		this.add(resultsLabel);
		this.setBackground(Color.GREEN);
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, winsLabel, -47, SpringLayout.WEST, losesLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, losesLabel, 0, SpringLayout.NORTH, tiesLabel);
		baseLayout.putConstraint(SpringLayout.EAST, losesLabel, -45, SpringLayout.WEST, tiesLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, winsLabel, 0, SpringLayout.NORTH, tiesLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, tiesLabel, 80, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, tiesLabel, 271, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, modeButton, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, modeButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 274, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, scissorsButton, -88, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, paperButton, -23, SpringLayout.WEST, scissorsButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, paperButton, -88, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rockButton, 0, SpringLayout.NORTH, paperButton);
		baseLayout.putConstraint(SpringLayout.EAST, rockButton, -27, SpringLayout.WEST, paperButton);
		baseLayout.putConstraint(SpringLayout.NORTH, resultsLabel, 33, SpringLayout.SOUTH, losesLabel);
		baseLayout.putConstraint(SpringLayout.WEST, resultsLabel, 0, SpringLayout.WEST, paperButton);
	}
	
	public void setupListeners()
	{
		rockButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.getWinner(1);
				winsLabel.setText("Wins: " + baseController.getWins());
				losesLabel.setText("Loses: " + baseController.getLoses());
				tiesLabel.setText("Ties: " + baseController.getTies());
			}
		});
		
		paperButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.getWinner(2);
				winsLabel.setText("Wins: " + baseController.getWins());
				losesLabel.setText("Loses: " + baseController.getLoses());
				tiesLabel.setText("Ties: " + baseController.getTies());
			}
		});
		
		scissorsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.getWinner(3);
				winsLabel.setText("Wins: " + baseController.getWins());
				losesLabel.setText("Loses: " + baseController.getLoses());
				tiesLabel.setText("Ties: " + baseController.getTies());
			}
		});
		
		modeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
}
