public class Main {
    public static void main(String[] args) {
        double initialInvestment = 10000;
        double annualGrowthRate = 0.07; // 7%
        int forecastYears = 5;

        System.out.println("Financial Forecast using Recursion:");
        double futureValue = Forecast.calculateFutureValue(initialInvestment, annualGrowthRate, forecastYears);
        System.out.printf("Initial Amount: %.2f%n", initialInvestment);
        System.out.printf("Growth Rate: %.2f%%%n", annualGrowthRate * 100);
        System.out.println("Years: " + forecastYears);
        System.out.printf("Future Value: %.2f%n", futureValue);
    }
}

