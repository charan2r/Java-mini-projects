package Project_4;

public abstract class AbstractPaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment: $" + amount);
    }

    @Override
    public void refundTransaction(String transactionId) {
        System.out.println("Processing refund: $" + transactionId);
    }
    
    @Override
    public String checkTransactionStatus(String transactionId) {
       return "Completed";
    }
}
