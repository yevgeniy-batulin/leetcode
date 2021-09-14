package easy.array;

class MonotonicArray_896 {
    public boolean isMonotonic(int[] array) {
        if(array == null || array.length < 3) return true;
        
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < array.length - 1; i++) {
        	if(array[i] > array[i + 1]) {
        		increasing = false;
        	} else if(array[i] < array[i + 1]) {
        		decreasing = false;
        	}
        }

        return increasing || decreasing;
    }
}