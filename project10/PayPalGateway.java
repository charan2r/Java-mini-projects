package Project_4;

public class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment via PayPal: $" + amount);
    }

    @Override
    public void refundTransaction(String transactionId) {
        System.out.println("Refunding PayPal transaction: " + transactionId);
    }

    @Override
    public String checkTransactionStatus(String transactionId) {
        System.out.println("Checking PayPal transaction status: " + transactionId);
        return "Completed";
    }
}

