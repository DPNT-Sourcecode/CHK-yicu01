package befaster.solutions.CHK;

public class CheckoutSolution {
	public Integer checkout(String skus) {
		int x = 0;

		if(skus == null || skus.trim() == "" ) {
			return 0;
		}

		if(skus.matches("[A-D]+")) {
			if(skus.matches("[A]+")) {
				if(skus.length() == 3) x += 130;
			}
			if(skus.contains("AAA")) {
				x += 130;
			} 
			if(skus.contains("BB")) {
				x += 45;
			}
			if(skus.contains("B")) {
				x += 30;
			}
			if(skus.contains("A")) {
				x += 50;
			}
			if(skus.contains("C")) {
				x += 20;
			}
			if(skus.contains("D")) {
				x += 15;
			}
			
			return x;
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
				System.out.println("charsCount ="+charsCount);
				for(int i=2;i<charsCount-1;i++) {
					System.out.println("value("+i+")"+value);
					value += 50;
				}
				System.out.println("Total A value ="+value);
			}
			else if(charsCount == 3) value = 130;
			else if(charsCount == 2) value = 100;
			else value = 50;
		} else if(c == 'B') {
			if(charsCount > 2) {
				value = 45;
				for(int i=1;i<charsCount-1;i++) {
					value += 30;
				}
			}
			else if(charsCount == 2) value = 45;
			else value = 30;
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

