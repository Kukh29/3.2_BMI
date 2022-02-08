public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55;
        double BMI = service.calculate(weight);
        System.out.println(BMI);
    }
}