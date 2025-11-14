package model.services;

import model.entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DebitService implements PaymentService{
    private static final double DEBIT_FEE = 0.0149;

        @Override
        public List<Installment> generateInstallments(double value, LocalDate contractDate, int installmentAmount) {
            value += value * DEBIT_FEE;
            List<Installment> installments = new ArrayList<>();
            installments.add(new Installment(contractDate, value));
            return installments;
        }


}
