package befaster.solutions.CHK;

public class CheckoutSolution {
	public Integer checkout(String skus) {

		if(skus != null && skus.matches("[A-D]+")) {
			return charValue(skus, 'A')+charValue(skus, 'B')+charValue(skus, 'C')+charValue(skus, 'D');
		} else if(skus == "" ) {
			return 0;
		} else {
			return -1;
		}

	}
	
	private static int charCount(String str, char c) {
		int count = 0;
		for(char ch: str.toCharArray()) {
			if(ch == c) {
				count++;
			}
		}
		return count;
	}

	private static int charValue(String str, char c) {
		int value = 0;
		int charsCount = charCount(str, c);
		if(c == 'A') {
			if(charsCount > 3) {
				value = 130;
				for(int i=2;i<charsCount-1;i++) {
					value += 50;
				}
			}
			else if(charsCount == 3) value = 130;
			else if(charsCount == 2) value = 100;
			else if(charsCount == 1) value = 50;
		} else if(c == 'B') {
			if(charsCount > 2) {
				value = 45;
				for(int i=1;i<charsCount-1;i++) {
					value += 30;
				}
			}
			else if(charsCount == 2) value = 45;
			else if(charsCount == 1) value = 30;
		} else if(c == 'C') {
			for(int i=0; i<charsCount;i++) {
				value += 20;
			}
		} else {
			for(int i=0; i<charsCount;i++) {
				value += 15;
			}
		}
		
		return value;
	}

}
