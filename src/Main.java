public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summ = service.calculate(1_000_000, 12, 9.99);
        System.out.println(summ);
        int summ1 = service.calculate(1_000_000, 24, 9.99);
        System.out.println(summ1);
        int summ2 = service.calculate(1_000_000, 36, 9.99);
        System.out.println(summ2);
        int summ3 = service.calculate(1_000_000, 48, 9.99);
        System.out.println(summ3);
        int summ4 = service.calculate(1_000_000, 50, 9.99);
        System.out.println(summ4);
    }
}