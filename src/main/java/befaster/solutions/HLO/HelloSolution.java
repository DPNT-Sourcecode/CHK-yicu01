package befaster.solutions.HLO;

public class HelloSolution {

	public String hello(String friendName) {
		if(friendName == null) {
			return "NULL";
		}

		return "Hello, "+ friendName + "!";
	}
}
