public class ContainerWithMostWater {

    public static int maxContainerArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(heights[left], heights[right]);
            int currentArea = width * h;

            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter wall
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}