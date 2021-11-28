package medium.array;

public class ProductOfArrayExceptSelf_238 {
	public int[] productExceptSelf(int[] numbers) {
		int[] prefixArray = new int[numbers.length];
		int[] suffixArray = new int[numbers.length];
		prefixArray[0] = 1;
		for (int index = 1; index < prefixArray.length; index++) {
			prefixArray[index] = prefixArray[index - 1] * numbers[index - 1];
		}
		suffixArray[suffixArray.length - 1] = 1;
		for (int index = suffixArray.length - 2; index >= 0; index--) {
			suffixArray[index] = suffixArray[index + 1] * numbers[index + 1];
		}

		int[] product = new int[numbers.length];
		for (int index = 0; index < numbers.length; index++) {
			product[index] = prefixArray[index] * suffixArray[index];
		}
		return product;
	}

	public int[] productExceptSelfConstantSpace(int[] numbers) {
		int[] product = new int[numbers.length];
		product[product.length - 1] = 1;
		for(int index = product.length - 2; index >= 0; index--) {
			product[index] = product[index + 1] * numbers[index + 1];
		}

		int prefix = 1;
		for(int index = 0; index < numbers.length; index++) {
			product[index] = product[index] * prefix;
			prefix *= numbers[index];
		}
		return product;
	}
}
