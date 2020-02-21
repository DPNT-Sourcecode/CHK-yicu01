package befaster.solutions.CHK;

public class CheckoutSolution {
	public Integer checkout(String skus) {
		int x = 0;

		if(skus.matches("[A-D]+")) {
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
//		if(skus != null && skus.trim() != "" ) {
//			skus = skus.toUpperCase();
			
//		}

	}
}
