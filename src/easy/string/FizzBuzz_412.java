package easy.string;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
// What if we had additional mappings, e.g divisible by 7 add Jazz, divisible bby 9 add Chiz etc.
class FizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n + 1);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) result.add("FizzBuzz");
            else if (i % 5 == 0) result.add("Buzz");
            else if (i % 3 == 0) result.add("Fizz");
            else result.add(Integer.toString(i));
        }
        return result;
    }
}