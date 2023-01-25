package at.cornersoft.katas.bowlinggame;

public class StrikeCalculator{

    private final String scoreCard;

    public StrikeCalculator(String scoreCard) {
        this.scoreCard = scoreCard;
    }

    public int calculate(int currentPosition) {
        int currentSum = 10;
        if (currentPosition < scoreCard.length() - 1) {
            currentSum += ((scoreCard.charAt(currentPosition + 1) == '/'
                || scoreCard.charAt(currentPosition + 1) == 'X'))
                    ? 10
                    : Integer.parseInt("" + scoreCard.charAt(currentPosition + 1));
        }
        if (currentPosition < scoreCard.length() - 2) {
            currentSum += ((scoreCard.charAt(currentPosition + 2) == '/'
            || scoreCard.charAt(currentPosition + 2) == 'X'))
                ? 10
                : Integer.parseInt("" + scoreCard.charAt(currentPosition + 2));
        }
        return currentSum;
    }

}