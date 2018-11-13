package com.training.entity;

public class Player {
	int playerId;
	String playerName;
	int numberOfMatches;
	int totalRunsScored;
	int noOfWickets;
	boolean captian;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName
				+ ", numberOfMatches=" + numberOfMatches + ", totalRunsScored="
				+ totalRunsScored + ", noOfWickets=" + noOfWickets
				+ ", captian=" + captian + "]";
	}
	public Player() {
		super();
	}
	public Player(int playerId, String playerName, int numberOfMatches,
			int totalRunsScored, int noOfWickets, boolean captian) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.numberOfMatches = numberOfMatches;
		this.totalRunsScored = totalRunsScored;
		this.noOfWickets = noOfWickets;
		this.captian = captian;
	}
	public boolean isCaptian() {
		return captian;
	}
	public void setCaptian(boolean captian) {
		this.captian = captian;
	}
	
public String getBattingRating()
{
	double average=this.totalRunsScored/this.numberOfMatches;
	if(average>90)
	{
		return "Best";
	}
	else if(average >=50)
	{
		return "Good";
	}
	else if(average>=25)
	{
		return "average";
	}
	else
	{ 
		return "poor";
	}
}

}
