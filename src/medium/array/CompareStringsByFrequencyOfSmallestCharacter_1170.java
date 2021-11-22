package medium.array;

public class CompareStringsByFrequencyOfSmallestCharacter_1170 {
	public int[] numSmallerByFrequency(String[] queries, String[] words) {
		int[] countArray = convertToCountArray(words);
		int[] responseArray = new int[queries.length];
		for(int index = 0; index < queries.length; index++) {
			int minLetterCount = getMinLetterCount(queries[index]);
			responseArray[index] = countArray[minLetterCount + 1];
		}
		return responseArray;
	}

	private int[] convertToCountArray(String[] strings) {
		int[] count = new int[12];

		for(String string: strings) {
			count[getMinLetterCount(string)]++;
		}

		for(int index = count.length - 2; index >=0; index--) {
			count[index] += count[index + 1];
		}

		return count;
	}

	private int getMinLetterCount(String string) {
		char minLetter = 'z';
		int minLetterCount = 0;
		for(char letter: string.toCharArray()) {
			if(letter < minLetter) {
				minLetter = letter;
				minLetterCount = 1;
			} else if(letter == minLetter) {
				minLetterCount++;
			}
		}
		return minLetterCount;
	}
}
