public class CreditPaymentService {
    public int calculate (int summ, int day, double procent, int year) {
        double r = (procent * year) / day / 100;
        double money = summ * ((r * Math.pow(1 + r, day)) / (Math.pow(1 + r, day) -1));
        return (int) money;
        
    }

}
