package model.services;

import model.entities.Installment;

public class CreditService implements PaymentService{
    private static final double CREDIT_BASE_FEE = 0.007;
    private static final double CREDIT_MONTHLY_INTEREST = 0.001;

    @Override
    public double paymentProcessing(double value, int installmentAmount) {
        double total = value + value * CREDIT_BASE_FEE;
        if(installmentAmount > 3){
            total = value * Math.pow(1 + CREDIT_MONTHLY_INTEREST, installmentAmount);
            total += value * CREDIT_BASE_FEE;
        }
        return total;
    }
}
