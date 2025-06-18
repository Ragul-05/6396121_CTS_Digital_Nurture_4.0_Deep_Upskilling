package DataStructures_Algorithms.Financial_Forecasting;

public class FinancialForecast {
    public static double predictFutureValue(double amount, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return amount;
        }
        // Recursive case
        return predictFutureValue(amount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialAmount = 10000;       // ₹10,000
        double growthRate = 0.07;           // 7% annual growth
        int years = 5;

        double result = predictFutureValue(initialAmount, growthRate, years);
        System.out.printf("Predicted Value after %d years: Rs.%.2f\n", years, result);
    }
}

