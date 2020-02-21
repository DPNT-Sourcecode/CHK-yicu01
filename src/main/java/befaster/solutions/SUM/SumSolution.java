package befaster.solutions.SUM;

public class SumSolution {

	public int compute(int x, int y) {
		if(x > 0 && x < 101 || y > 0 && y < 101) {
			return x + y;
		}

		return 0;
	}

}
