package befaster.solutions.CHK;

public class CheckoutSolution {

	public Integer checkout(String skus) {
		int charValueA = charValue(skus, 'A');
		int charValueB = charValue(skus, 'B');
		int charValueC = charValue(skus, 'C');
		int charValueD = charValue(skus, 'D');
		int charValueE = charValue(skus, 'E');
		if(skus != null && skus.matches("[A-E]+")) {
			if(charCount(skus, 'A') >= 5) {
				if(charCount(skus, 'A') < 8)
					charValueA -= 50;
				else if(charCount(skus, 'A') < 10)
					charValueA -= 70;
				else if(charCount(skus, 'A') < 13) 
					charValueA -= 100;
				else if(charCount(skus, 'A') < 15) 
					charValueA -= 120;
				else if(charCount(skus, 'A') < 18)
					charValueA -= 150;
			} else if(charCount(skus, 'A') > 2 && charCount(skus, 'A') < 5) 
				charValueA -= 20;
			System.out.println("Final A ="+charValueA);

			if(charCount(skus, 'B') > 1 && charCount(skus, 'B') < 4) 
				charValueB -= 15;
			else if(charCount(skus, 'B') >= 4 && charCount(skus, 'B') < 6) 
				charValueB -= 30;

			if((charCount(skus, 'E') >= 2 && charCount(skus, 'B') == 1) && (charCount(skus, 'E') < 4 && charCount(skus, 'B') == 1)) 
				charValueB -= 30;
			else if((charCount(skus, 'E') >= 2 && charCount(skus, 'B') == 2) && (charCount(skus, 'E') < 4 && charCount(skus, 'B') == 2)) 
				charValueB -= 15;
			else if((charCount(skus, 'E') >= 4 && charCount(skus, 'B') == 2) && (charCount(skus, 'E') < 6 && charCount(skus, 'B') == 2)) 
				charValueB -= 45;

			System.out.println("Final B ="+charValueB);

			return charValueA + charValueB + charValueC + charValueD + charValueE;
		} else if(skus.equals("")) return 0;
		 else return -1;

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
			for(int i=0; i<charsCount;i++) {
				value += 50;
			}
			//			if(charsCount > 3) {
			//				value = 130;
			//				for(int i=3;i<charsCount;i++) {
			//					if(charsCount == 5 && i == 4) {
			//						value = 200;
			//					} else if(charsCount == 6 && i == 5) {
			//						value = 250;
			//					} else if(charsCount == 7 && i == 6) {
			//						value = 300;
			//					} else if(charsCount == 8 && i == 7) {
			//						value = 330;
			//					} else if(charsCount == 9 && i == 8) {
			//						value = 380;
			//					} else if(charsCount == 10 && i == 9) {
			//						value = 400;
			//					} else {
			//						value += 50;
			//					}
			//				}
			//			}
			//			else if(charsCount == 3) value = 130;
			//			else if(charsCount == 2) value = 100;
			//			else if(charsCount == 1) value = 50;
		} else if(c == 'B') {
			for(int i=0; i<charsCount;i++) {
				value += 30;
			}
			//			if(charsCount > 2) {
			//				value = 45;
			//				for(int i=2;i<charsCount;i++) {
			//					if(charsCount > 3 && i == 3) {
			//						value = 90;
			//					} else {
			//						value += 30;
			//					}
			//				}
			//			}
			//			else if(charsCount == 2) value = 45;
			//			else if(charsCount == 1) value = 30;
		} else if(c == 'C') {
			for(int i=0; i<charsCount;i++) {
				value += 20;
			}
		} else if(c == 'D') {
			for(int i=0; i<charsCount;i++) {
				value += 15;
			}
		} else { //c='E'
			for(int i=0; i<charsCount;i++) {
				value += 40;
			}
		}

		return value;
	}

}
