public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculate (50,170);
        System.out.println(bmi);


        float bmi1 = service.calculate(100,180);
        System.out.println(bmi1);
        }
}
