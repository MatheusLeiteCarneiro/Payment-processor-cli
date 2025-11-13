package model.services;

public class PixService implements PaymentService{
    @Override
    public double paymentProcessing(double value, int installments) {
        return value;
    }
}
