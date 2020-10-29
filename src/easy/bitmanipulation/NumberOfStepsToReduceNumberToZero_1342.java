package easy.bitmanipulation;

class NumberOfStepsToReduceNumberToZero_1342 {
    public int numberOfSteps (int num) {
 		int count = 0;
 		while(num != 0) {
 			count++;
 			if((num & 1) == 1) 
 				num--;
 			else
 				num >>= 1;
 		}
 		return count;       
    }
}