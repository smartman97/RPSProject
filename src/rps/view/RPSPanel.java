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
	private JLabel resultsLabel;
	private JLabel winsLabel;
	private JLabel losesLabel;
	
	public RPSPanel(RPSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rockButton = new JButton("Rock");
		paperButton = new JButton("Paper");
		baseLayout.putConstraint(SpringLayout.SOUTH, paperButton, -88, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rockButton, 0, SpringLayout.NORTH, paperButton);
		baseLayout.putConstraint(SpringLayout.EAST, rockButton, -27, SpringLayout.WEST, paperButton);
		scissorsButton = new JButton("Scissors");
		baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 274, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, scissorsButton, -88, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, paperButton, -23, SpringLayout.WEST, scissorsButton);
		modeButton = new JButton("Change Mode");
		baseLayout.putConstraint(SpringLayout.WEST, modeButton, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, modeButton, -10, SpringLayout.SOUTH, this);
		resultsLabel = new JLabel("You picked: " + "Computer Picked: ");
		baseLayout.putConstraint(SpringLayout.WEST, resultsLabel, 136, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, resultsLabel, -38, SpringLayout.NORTH, rockButton);
		winsLabel = new JLabel("Wins: ");
		baseLayout.putConstraint(SpringLayout.NORTH, winsLabel, 33, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, winsLabel, 0, SpringLayout.WEST, resultsLabel);
		losesLabel = new JLabel("Loses: ");
		baseLayout.putConstraint(SpringLayout.NORTH, losesLabel, 0, SpringLayout.NORTH, winsLabel);
		baseLayout.putConstraint(SpringLayout.EAST, losesLabel, -154, SpringLayout.EAST, this);
		
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
		this.add(resultsLabel);
		this.add(winsLabel);
		this.add(losesLabel);
		this.setBackground(Color.GREEN);

	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		rockButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		paperButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		scissorsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
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
