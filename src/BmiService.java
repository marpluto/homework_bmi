public class BmiService {
    public double calculate(double weightKg, double heightM) {
        int bmiResult = (int) (weightKg / (heightM * heightM));
        return bmiResult;
    }
}
