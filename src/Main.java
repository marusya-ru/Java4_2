public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 95;
        double height = 186;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
