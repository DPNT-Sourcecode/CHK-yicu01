package befaster.solutions.CHK;

public class CheckoutSolution {

	public Integer checkout(String skus) {
		int charA = charValue(skus, 'A');
		int charB = charValue(skus, 'B');
		int charC = charValue(skus, 'C');
		int charD = charValue(skus, 'D');
		int charE = charValue(skus, 'E');
		int charF = charValue(skus, 'F');
		int charG = charValue(skus, 'G');
		int charH = charValue(skus, 'H');
		int charI = charValue(skus, 'I');
		int charJ = charValue(skus, 'J');
		int charK = charValue(skus, 'K');
		int charL = charValue(skus, 'L');
		int charM = charValue(skus, 'M');
		int charN = charValue(skus, 'N');
		int charO = charValue(skus, 'O');
		int charP = charValue(skus, 'P');
		int charQ = charValue(skus, 'Q');
		int charR = charValue(skus, 'R');
		int charS = charValue(skus, 'S');
		int charT = charValue(skus, 'T');
		int charU = charValue(skus, 'U');
		int charV = charValue(skus, 'V');
		int charW = charValue(skus, 'W');
		int charX = charValue(skus, 'X');
		int charY = charValue(skus, 'Y');
		int charZ = charValue(skus, 'Z');
		if(skus != null && skus.matches("[A-Z]+")) {
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

			if(charCount(skus, 'B') > 1 && charCount(skus, 'B') < 4) 
				charValueB -= 15;
			else if(charCount(skus, 'B') >= 4 && charCount(skus, 'B') < 6) 
				charValueB -= 30;

			if((charCount(skus, 'E') >= 2 && charCount(skus, 'B') == 2) && (charCount(skus, 'E') < 4 && charCount(skus, 'B') == 2)) 
				charValueB -= 15;
			else if((charCount(skus, 'E') >= 2 && charCount(skus, 'B') >= 1) && (charCount(skus, 'E') < 4 && charCount(skus, 'B') >= 1)) 
				charValueB -= 30;
			else if((charCount(skus, 'E') >= 4 && charCount(skus, 'B') == 2) && (charCount(skus, 'E') < 6 && charCount(skus, 'B') == 2)) 
				charValueB -= 45;

			if(charCount(skus, 'F') > 2 && charCount(skus, 'F') < 6) 
				charValueF -= 10;
			else if(charCount(skus, 'F') >= 6 && charCount(skus, 'F') < 9) 
				charValueF -= 20;
			
			return charValueA + charValueB + charValueC + charValueD + charValueE + charValueF;
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
		} else if(c == 'B') {
			for(int i=0; i<charsCount;i++) {
				value += 30;
			}
		} else if(c == 'C') {
			for(int i=0; i<charsCount;i++) {
				value += 20;
			}
		} else if(c == 'D') {
			for(int i=0; i<charsCount;i++) {
				value += 15;
			}
		} else if(c == 'E') {
			for(int i=0; i<charsCount;i++) {
				value += 40;
			}
		} else { //c='F'
			for(int i=0;i<charsCount;i++) {
					value += 10;
			}
		}

		return value;
	}

}

