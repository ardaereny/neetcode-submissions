class Solution {
  public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int current : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && current < 0) {

                int top = stack.peek();

                if (top < Math.abs(current)) {
                    stack.pop();
                }
                else if (top == Math.abs(current)) {
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(current);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}