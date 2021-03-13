public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();

        float bmi = service.calculate(90, 190);
        System.out.println("Ваш индекс массы равен: " + bmi);

        float bmi2 = service.calculate(50, 170);
        System.out.println("Ваш индекс массы равен: " + bmi2);
    }
}
