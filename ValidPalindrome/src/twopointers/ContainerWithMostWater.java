package twopointers;

class Solution {
	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxi = 0;

		while (left < right) {
			int width = right - left;
			maxi = Math.max(maxi, Math.min(height[left], height[right]) * (width)); // give the brackets properly
			// ans = Math.max(ans, Math.min(height[l], height[r])*(r-l));

			// return maxi;
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		// return 0;

		return maxi;

	}
}
