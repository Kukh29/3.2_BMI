public class BmiService {
    public double calculate(double weight, double growth) {

        double BMI = weight / (growth * growth / 100 / 100); // индекс массы тела кг/м2
        return BMI;
    }
}
