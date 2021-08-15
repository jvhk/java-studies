package services;

public class BrazilInterestService implements InterestService{
	private double interestState;

	public BrazilInterestService(double interestState) {
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
