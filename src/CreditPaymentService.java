public class CreditPaymentService {
    public int calculate (int summ, int month, double procent) {
        int y = (month * 1) / 12;
        double r = (procent * y) / month / 100;
        double money = summ * ((r * Math.pow(1 + r, month)) / (Math.pow(1 + r, month) -1));
        return (int) money;

    }

}