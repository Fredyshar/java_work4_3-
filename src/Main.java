public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Ежемесячный платеж составит:");
        System.out.println((int)service.calculate(1_000_000, 12));
        System.out.println("при сроке кредитования - 1 год и процентной ставке - 9.99%");
        System.out.println();
        System.out.println("Ежемесячный платеж составит:");
        System.out.println((int)service.calculate(1_000_000, 24));
        System.out.println("при сроке кредитования - 2 года и процентной ставке - 9.99%");
        System.out.println();
        System.out.println("Ежемесячный платеж составит:");
        System.out.println((int)service.calculate(1_000_000, 36));
        System.out.println("при сроке кредитования - 3 год3 и процентной ставке - 9.99%");
        System.out.println();
    }
}
