public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = 28;
        int bmi = service.calculate(index); // должно получиться 28
        System.out.println(bmi);
    }
}