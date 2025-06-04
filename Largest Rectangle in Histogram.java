class  Largest Rectangle in Histogram{
    public int largestRectangleArea(int[] heights) {
         int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && heights[stk.peek()] > heights[i]) {
                int element = stk.pop(); 
                int pse = stk.isEmpty() ? -1 : stk.peek();
                int nse = i;

                int mult = (nse - pse - 1);
                int currArea = heights[element] * mult;

                maxArea = Math.max(maxArea, currArea);
            }
            stk.push(i);
        }
        while (!stk.isEmpty()) {
            int element = stk.pop();
            int pse = stk.isEmpty() ? -1 : stk.peek();
            int nse = n;

            int mult = (nse - pse - 1);
            int currArea = heights[element] * mult;

            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
}