package Project_4;

public class BankingApplication {
    private PaymentGateway paymentGateway;

    public BankingApplication(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(double amount) {
        paymentGateway.processPayment(amount);
    }

    public void refundTransaction(String transactionId) {
        paymentGateway.refundTransaction(transactionId);
    }

    public String checkTransactionStatus(String transactionId) {
        return paymentGateway.checkTransactionStatus(transactionId);
    }

    public static void main(String[] args) {
        PaymentGateway paypalGateway = new PayPalGateway();
        BankingApplication bankingApp = new BankingApplication(paypalGateway);

        bankingApp.processPayment(100.0);
        bankingApp.refundTransaction("12345");
        bankingApp.checkTransactionStatus("12345");

        PaymentGateway stripeGateway = new StripeGateway();
        bankingApp = new BankingApplication(stripeGateway);

        bankingApp.processPayment(200.0);
        bankingApp.refundTransaction("67890");
        bankingApp.checkTransactionStatus("67890");
    }
}
