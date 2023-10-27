package mandatoryHW.DSA.week13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CanPlaceFlowers {

	@Test
	public void tc1() {
		boolean actual = placeFlowers(new int[] {1,0,0,0,1}, 1);
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void tc2() {
		boolean actual = placeFlowers(new int[] {1,0,0,0,1,0,0}, 2);
		Assert.assertEquals(actual, true);
	}
	
	public boolean placeFlowers(int[] flowerbed, int n) {
	
		 int res = n;
		    if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1)
		    return true;

		    int count = 0;
				for (int i = 0; i < flowerbed.length; i++) {
					if (flowerbed[i] == 0 && i > 0 && (i + 1) < flowerbed.length) {
						if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && n > 0) {
							count = count + 1;
							flowerbed[i] = 1;
		                    n--;
						}
					} else if (flowerbed[i] == 0 && (i + 1) < flowerbed.length && n > 0) {
						if (flowerbed[i + 1] == 0) {
							count = count + 1;
							flowerbed[i] = 1;
		                    n--;
						}
					} else if (flowerbed[i] == 0 && i == (flowerbed.length - 1) && n > 0) {
						if (flowerbed[i - 1] == 0) {
							count = count + 1;
							flowerbed[i] = 1;
		                    n--;
						}
					}
				}
				return count == res;
	}
}
