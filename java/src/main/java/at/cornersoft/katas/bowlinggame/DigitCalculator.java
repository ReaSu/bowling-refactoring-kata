package at.cornersoft.katas.bowlinggame;

public class DigitCalculator {

	private final String scoreCard;

    public DigitCalculator(String scoreCard) {
        this.scoreCard = scoreCard;
	}

	public int calculate(int currentPosition) {
        int currentSum = 0;
        try {
                currentSum += calculate("" + scoreCard.charAt(currentPosition));
        } catch (Exception ignore) {
            //we do not check for errors in scorecard
        }
		return currentSum;
	}

    public static int calculate(String digit){
        String testString = "123456789";
        return testString.indexOf(digit)+1;
    }

}
