public class BmiService {
    public double calculate(double index) {

        double weight = 55; // вес человека в кг
        double growth = 175; // рост человека в см, чтобы перевести в метры, делим на 100

        double BMI = weight / (growth * growth / 100 / 100); // индекс массы тела кг/м2
        return BMI;
    }
}
