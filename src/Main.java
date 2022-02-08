public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(80, 175);
        System.out.println(BMI +" кг/м2");
    }
}