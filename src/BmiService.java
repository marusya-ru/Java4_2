public class BmiService {
    public double calculate(double weight, double height) {
        double bmi;
        bmi = weight / Math.pow((height / 100), 2);
        return bmi;
    }
}
