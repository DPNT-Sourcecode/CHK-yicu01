package befaster.solutions.CHK;

public class CheckoutSolution {
	public Integer checkout(String skus) {

		if(skus != null && skus.matches("[A-E]+")) {
			return charValue(skus, 'A')+charValue(skus, 'B')+charValue(skus, 'C')+charValue(skus, 'D');
		} else if(skus.equals("")) {
			return 0;
		} else {
			return -1;
		}

	}

	private int charCount(String str, char c) {
		int count = 0;
		for(char ch: str.toCharArray()) {
			if(ch == c) {
				count++;
			}
		}
		return count;
	}

	private int charValue(String str, char c) {
		int value = 0;
		int charsCount = charCount(str, c);
		if(c == 'A') {
			if(charsCount > 3) {
				value += 130;
				for(int i=3;i<charsCount;i++) {
					if(charsCount > 5 && i == 5) {
						value = 260;
					} else {
						value += 50;
					}
				}
			}
			else if(charsCount == 3) value = 130;
			else if(charsCount == 2) value = 100;
			else if(charsCount == 1) value = 50;
		} else if(c == 'B') {
			if(charsCount > 2) {
				value = 45;
				for(int i=2;i<charsCount;i++) {
					if(charsCount > 3 && i == 3) {
						value = 90;
					} else {
						value += 30;
					}
				}
			}
			else if(charsCount == 2) value = 45;
			else if(charsCount == 1) value = 30;
		} else if(c == 'C') {
			for(int i=0; i<charsCount;i++) {
				value += 20;
			}
		} else if(c == 'D') {
			for(int i=0; i<charsCount;i++) {
				value += 15;
			}
		} else {
			if(charsCount > 2) {
				value = 50;
				for(int i=2;i<charsCount;i++) {
					if(charsCount > 3 && i == 3) {
						value = 100;
					} else {
						value += 40;
					}
				}
			}
			else if(charsCount == 2) value = 50;
			else if(charsCount == 1) value = 40;
		}

		return value;
	}

}






