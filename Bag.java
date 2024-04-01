public class Bag {
	public static enum BallColour {White, Black};
	private int numWhite, numBlack;
	public Bag(int nB, int nN) {
		numWhite = nB;
		numBlack = nN;
	}
	public BallColour extractBall() {
		if (numWhite + numBlack == 0) {
			throw new RuntimeException("There are no balls.");
		}
		BallColour extractedBall = null;
		if (new java.util.Random().nextInt(1) == 0) {
			extractedBall = BallColour.White;
			numWhite--;
		} else {
			extractedBall = BallColour.Black;
			numBlack--;
		}
		return extractedBall;
	}
}
