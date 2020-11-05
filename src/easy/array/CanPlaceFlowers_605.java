package easy.array;

class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    	if(n == 0) return true;
    	if(flowerbed == null || flowerbed.length == 0) return false;
    	if(flowerbed.length == 1) return flowerbed[0] == 0 && n == 1;

    	if(flowerbed[0] == 0 && flowerbed[1] == 0) {
    		flowerbed[0] = 1;
    		n--;
    	}

    	for(int i = 1; i  < flowerbed.length - 1 && n  > 0; i++) {
    		if(flowerbed[i] == 0 && flowerbed[i  - 1] == 0 && flowerbed[i + 1] == 0) {
    			flowerbed[i] = 1;
    			n--;
    			i++;
    		}
    	}

    	if(n > 0 && flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
    		flowerbed[flowerbed.length - 1] = 1;
    		n--;
    	}

 		return n == 0;       
    }
}