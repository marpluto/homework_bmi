public class BmiService {
    public double calculate(double kg, double m) {
        int result = (int) (kg / (m * m));
        return result;
    }
}
