package java1.behavioural.observer;

public class practice {

	static int runs, wickets = 0;
	float overs;

	static CurrentScoreDisplay currentScoreDisplay;
	static AverageScoreDisplay averageScoreDisplay;

	public practice(CurrentScoreDisplay currentScoreDisplay, AverageScoreDisplay averageScoreDisplay) {

		this.averageScoreDisplay = averageScoreDisplay;
		this.currentScoreDisplay = currentScoreDisplay;
	}

	public int getRuns() {
		return 99;
	}

	public int getWickets() {
		return 4;
	}

	public float getOvers() {
		return (float) 14.2;
	}

	public void dataChanged() {

		runs = getRuns();
		wickets = getWickets();
		overs = getOvers();

		currentScoreDisplay.update(runs, wickets, overs);
		averageScoreDisplay.update(runs, wickets, overs);
	}

	
static	class AverageScoreDisplay {

		float runRate;
		int predictionScore;

		public void update(int runs2, int wickets2, float overs2) {

			runRate = (float) runs / overs2;
			predictionScore = (int) this.runRate * 50;
			display();
		}

		public void display() {

			System.out.println("\nRunrate: " + runRate + "\nPrediction Score :" + predictionScore);
		}

	}

	static class CurrentScoreDisplay {

		int runs, wickets;
		float overs;

		public void update(int runs, int wickets, float overs) {
			this.overs = overs;
			this.runs = runs;
			this.wickets = wickets;
			display();
		}

		public void display() {

			System.out.print("\nCurrent Score: " + "" + runs + "|" + wickets + "\nOvers :" + overs);
		}
	}
	
	public static void main(String[] args) {

		
		AverageScoreDisplay averageScoreD = new AverageScoreDisplay();
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

		practice pract = new practice(currentScoreDisplay, averageScoreD);

		pract.dataChanged();

	}


}
