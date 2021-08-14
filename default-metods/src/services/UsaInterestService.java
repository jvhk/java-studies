package services;

public class UsaInterestService implements InterestService{
	private double interestState;

	public UsaInterestService(double interestState) {
		this.interestState = interestState;
	}

	@Override
	public double getInterestState() {
		return interestState;
	}

	public void setInterestState(double interestState) {
		this.interestState = interestState;
	}	
}
