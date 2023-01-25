package at.cornersoft.katas.bowlinggame;

public class ScoreCalculator {
    private SpareCalculator spareCalculator;
    private StrikeCalculator strikeCalculator;
    private DigitCalculator digitCalculator;

    public int calculate(String scoreCard) {
        spareCalculator = new SpareCalculator(scoreCard);
        strikeCalculator = new StrikeCalculator(scoreCard);
        digitCalculator = new DigitCalculator(scoreCard);
        return calculatePosition(scoreCard, 0, 0);
    }

    public int calculatePosition(String scoreCard, int currentPosition, int currentSum) {
// scoreCard object that handles this
// and will also know if we are in the 10th frame
        long xCount = scoreCard.chars().filter(ch -> ch == 'X').count();
        if (scoreCard.endsWith("X")) {
            xCount -= 1;
        }
        if (xCount > 10) {
            xCount = 10;
        }
        long frameCount = currentPosition + xCount;
        if (scoreCard.length() == currentPosition || frameCount == 20) {
            return currentSum;
        }

// 1) Factory to create correct calculator?
// 2) all calculators are called,
// but only the correct one returns a number, the others are multiplied by zero
        if (scoreCard.charAt(currentPosition) == '/') {
            currentSum += spareCalculator.calculate(currentPosition);
        } else if (scoreCard.charAt(currentPosition) == 'X') {
            currentSum += strikeCalculator.calculate(currentPosition);
        } else {
            currentSum += digitCalculator.calculate(currentPosition);
        }
        return calculatePosition(scoreCard, currentPosition+1, currentSum);
    }
}
