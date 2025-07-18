public class Forecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized version using memoization (optional for further enhancement)
    public static double calculateFutureValueOptimized(double currentValue, double growthRate, int years, Double[] memo) {
        if (years == 0) return currentValue;
        if (memo[years] != null) return memo[years];
        memo[years] = calculateFutureValueOptimized(currentValue * (1 + growthRate), growthRate, years - 1, memo);
        return memo[years];
    }
}
