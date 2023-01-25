package at.cornersoft.katas.bowlinggame;

public class SpareCalculator {

    private final String scoreCard;

    public SpareCalculator(String scoreCard){
        this.scoreCard = scoreCard;
    }

    public int calculate(int currentPosition) {
        int currentSum = 10;
        if (currentPosition < scoreCard.length() - 1) {
            if (scoreCard.charAt(currentPosition + 1) == '/' || scoreCard.charAt(currentPosition + 1) == 'X') {
                currentSum += 10;
            } else {
                currentSum += Integer.parseInt("" + scoreCard.charAt(currentPosition + 1));
            }
        }
        return currentSum;
    }

}