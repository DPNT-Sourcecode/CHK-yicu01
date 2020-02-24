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
			if(charCount(skus, 'A') > 2 && charCount(skus, 'A') < 5) 
				charA -= 20;
			else if(charCount(skus, 'A') >= 5 && charCount(skus, 'A') < 8) 
				charA -= 50;
			else if(charCount(skus, 'A') >= 8 && charCount(skus, 'A') < 10) 
				charA -= 70;
			else if(charCount(skus, 'A') >= 10 && charCount(skus, 'A') < 13) 
				charA -= 100;
			else if(charCount(skus, 'A') >= 13 && charCount(skus, 'A') < 15) 
				charA -= 120;
			else if(charCount(skus, 'A') >= 15 && charCount(skus, 'A') < 18) 
				charA -= 150;
			if(charCount(skus, 'B') > 1 && charCount(skus, 'B') < 4) 
				charB -= 15;
			else if(charCount(skus, 'B') >= 4 && charCount(skus, 'B') < 6) 
				charB -= 30;
			if((charCount(skus, 'E') >= 2 && charCount(skus, 'B') == 2) && (charCount(skus, 'E') < 4 && charCount(skus, 'B') == 2)) 
				charB -= 15;
			else if((charCount(skus, 'E') >= 2 && charCount(skus, 'B') >= 1) && (charCount(skus, 'E') < 4 && charCount(skus, 'B') >= 1)) 
				charB -= 30;
			else if((charCount(skus, 'E') >= 4 && charCount(skus, 'B') == 2) && (charCount(skus, 'E') < 6 && charCount(skus, 'B') == 2)) 
				charB -= 45;
			if(charCount(skus, 'F') > 2 && charCount(skus, 'F') < 6) 
				charF -= 10;
			else if(charCount(skus, 'F') >= 6 && charCount(skus, 'F') < 9) 
				charF -= 20;
			if(charCount(skus, 'H') >= 20 && charCount(skus, 'H') < 25)
				charH -= 40;
			else if(charCount(skus, 'H') >= 15 && charCount(skus, 'H') < 20)
				charH -= 25;
			else if(charCount(skus, 'H') >= 10 && charCount(skus, 'H') < 15)
				charH -= 20;
			else if(charCount(skus, 'H') > 4 && charCount(skus, 'H') < 10) 
				charH -= 5;
			if(charCount(skus, 'K') > 1 && charCount(skus, 'K') < 4) 
				charK -= 10;
			else if(charCount(skus, 'K') >= 4 && charCount(skus, 'K') < 6) 
				charK -= 20;
			if((charCount(skus, 'N') >= 3 && charCount(skus, 'M') >= 1) && (charCount(skus, 'N') < 6 && charCount(skus, 'M') >= 1)) 
				charM -= 15;
			else if((charCount(skus, 'N') >= 6 && charCount(skus, 'M') == 2) && (charCount(skus, 'N') < 9 && charCount(skus, 'M') == 2)) 
				charM -= 30;
			if(charCount(skus, 'P') > 4 && charCount(skus, 'P') < 10) 
				charP -= 50;
			else if(charCount(skus, 'P') >= 10 && charCount(skus, 'P') < 15) 
				charP -= 100;
			int QCount = charCount(skus, 'Q');
			if((charCount(skus, 'R') >= 3 && QCount >= 1) && (charCount(skus, 'R') < 6 && QCount >= 1)) {
				QCount -= 1;
				charQ -= 30;
			} else if((charCount(skus, 'R') >= 6 && QCount == 2) && (charCount(skus, 'R') < 9 && QCount == 2)) {
				QCount -= 2;
				charQ -= 60;
			}
			if(QCount > 2 && QCount < 6) 
				charQ -= 10;
			else if(QCount >= 6 && QCount < 9) 
				charQ -= 20;
			if(charCount(skus, 'U') > 3 && charCount(skus, 'U') < 8) 
				charU -= 40;
			else if(charCount(skus, 'U') >= 8 && charCount(skus, 'U') < 12) 
				charU -= 80;
			if(charCount(skus, 'V') >= 12 && charCount(skus, 'V') < 14)
				charV -= 80;
			else if(charCount(skus, 'V') >= 11 && charCount(skus, 'V') < 12)
				charV -= 70;
			else if(charCount(skus, 'V') >= 9 && charCount(skus, 'V') < 11)
				charV -= 60;
			else if(charCount(skus, 'V') >= 8 && charCount(skus, 'V') < 9)
				charV -= 50;
			else if(charCount(skus, 'V') >= 6 && charCount(skus, 'V') < 8)
				charV -= 40;
			else if(charCount(skus, 'V') >= 5 && charCount(skus, 'V') < 6)
				charV -= 30;
			else if(charCount(skus, 'V') >= 3 && charCount(skus, 'V') < 5)
				charV -= 20;
			else if(charCount(skus, 'V') > 1 && charCount(skus, 'V') < 3) 
				charV -= 10;
			
			int total = charA+charB+charC+charD+charE+charF+charG+charH+charI+charJ+charK+charL+charM+charN+charO+charP+charQ+charR+charS+charT+charU+charV+charW+charX+charY+charZ;
			if(charCount(skus, 'S') == 3 || charCount(skus, 'T') == 3 || charCount(skus, 'Y') == 3)
				total -= 15;
			else if((charCount(skus, 'S') + charCount(skus, 'T') + charCount(skus, 'Y')) == 3) 
				total -= 15;
			
			return total;
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
		} else if(c == 'F') {
			for(int i=0; i<charsCount;i++) {
				value += 10;
			}
		} else if(c == 'G') {
			for(int i=0; i<charsCount;i++) {
				value += 20;
			}
		} else if(c == 'H') {
			for(int i=0; i<charsCount;i++) {
				value += 10;
			}
		} else if(c == 'I') {
			for(int i=0; i<charsCount;i++) {
				value += 35;
			}
		} else if(c == 'J') {
			for(int i=0; i<charsCount;i++) {
				value += 60;
			}
		} else if(c == 'K') {
			for(int i=0; i<charsCount;i++) {
				value += 80;
			}
		} else if(c == 'L') {
			for(int i=0; i<charsCount;i++) {
				value += 90;
			}
		} else if(c == 'M') {
			for(int i=0; i<charsCount;i++) {
				value += 15;
			}
		} else if(c == 'N') {
			for(int i=0; i<charsCount;i++) {
				value += 40;
			}
		} else if(c == 'O') {
			for(int i=0; i<charsCount;i++) {
				value += 10;
			}
		} else if(c == 'P') {
			for(int i=0; i<charsCount;i++) {
				value += 50;
			}
		} else if(c == 'Q') {
			for(int i=0; i<charsCount;i++) {
				value += 30;
			}
		} else if(c == 'R') {
			for(int i=0; i<charsCount;i++) {
				value += 50;
			}
		} else if(c == 'S') {
			for(int i=0; i<charsCount;i++) {
				value += 30;
			}
		} else if(c == 'T') {
			for(int i=0; i<charsCount;i++) {
				value += 20;
			}
		} else if(c == 'U') {
			for(int i=0; i<charsCount;i++) {
				value += 40;
			}
		} else if(c == 'V') {
			for(int i=0; i<charsCount;i++) {
				value += 50;
			}
		} else if(c == 'W') {
			for(int i=0; i<charsCount;i++) {
				value += 20;
			}
		} else if(c == 'X') {
			for(int i=0; i<charsCount;i++) {
				value += 90;
			}
		} else if(c == 'Y') {
			for(int i=0; i<charsCount;i++) {
				value += 10;
			}
		} else { //c='Z'
			for(int i=0;i<charsCount;i++) {
					value += 50;
			}
		}

		return value;
	}

}

