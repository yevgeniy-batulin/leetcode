package easy.array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
public class KidsWithTheGreatestNumberOfCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (maxCandies < candies[i])
                maxCandies = candies[i];
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
}
