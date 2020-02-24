package medium.array;

//https://leetcode.com/problems/container-with-most-water/
class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            if (area > maxArea) maxArea = area;

            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater_11().maxArea(new int[]{2, 3, 10, 5, 7, 8, 9}));
    }
}