public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(57,1.72);
        System.out.println("Индекс массы тела " + bmi);
    }
}