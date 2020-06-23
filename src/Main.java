public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculate (50,170);
        System.out.printf("Индекс Массы Тела %.1f ",bmi);

        float bmi1 = service.calculate (100,180);
        System.out.printf("Индекс Массы Тела %.1f ",bmi1);

        }
}
