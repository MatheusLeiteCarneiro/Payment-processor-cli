package model.services;

public class DebitService implements PaymentService{
    private static final double DEBIT_FEE = 0.0025;
    @Override
    public double paymentProcessing(double value, int installmentAmount) {
        return value + value * DEBIT_FEE;
    }
}
