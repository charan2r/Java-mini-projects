package Project_4;

public class StripeGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment via Stripe: $" + amount);
    }

    @Override
    public void refundTransaction(String transactionId) {
        System.out.println("Refunding Stripe transaction: " + transactionId);
    }

    @Override
    public String checkTransactionStatus(String transactionId) {
        System.out.println("Checking Stripe transaction status: " + transactionId);
        return "Pending";
    }
}
