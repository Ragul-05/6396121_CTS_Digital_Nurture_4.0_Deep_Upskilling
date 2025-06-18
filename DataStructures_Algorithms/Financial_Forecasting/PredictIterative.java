package DataStructures_Algorithms.Financial_Forecasting;

public class PredictIterative {
    public static double PredictIterative(double amount, double growthRate, int years) {
        double futureValue = amount;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
