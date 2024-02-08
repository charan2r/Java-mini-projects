package Project_4;

public interface PaymentGateway {
    void processPayment(double amount);
    void refundTransaction(String transactionId);
    String checkTransactionStatus(String transactionId);
}
