public class CreditPaymentService {
    public double calculate(int s, int t) {
        double i = 9.99; // процентная ставка (годовых)
        double i2 = i / 100 / 12; // процентная ставка для формулы
        double payment;
        payment = s * (i2 + (i2 / ((Math.pow((1+i2), t)) - 1)));
        return payment;
    }
}
