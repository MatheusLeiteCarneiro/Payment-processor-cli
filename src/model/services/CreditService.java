package model.services;

import model.entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreditService implements PaymentService{
    private static final double CREDIT_BASE_FEE = 0.0299;
    private static final double CREDIT_MONTHLY_INTEREST = 0.0199;

    @Override
    public List<Installment> generateInstallments(double value, LocalDate contractDate, int installmentAmount) {
        value += value * CREDIT_BASE_FEE;
        List<Installment> installments = new ArrayList<>();
        if(installmentAmount > 3){
            value *=  Math.pow(1 + CREDIT_MONTHLY_INTEREST, installmentAmount);
        }
        double valuePerInstallment = value / installmentAmount;

        for (int i = 1; i <= installmentAmount; i++){
            installments.add(new Installment(contractDate.plusMonths(i), valuePerInstallment));
        }

        return installments;

    }
}
