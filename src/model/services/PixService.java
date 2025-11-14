package model.services;

import model.entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PixService implements PaymentService{
    @Override
    public List<Installment> generateInstallments(double value, LocalDate contractDate, int installmentAmount) {
        List<Installment> installments = new ArrayList<>();
        installments.add(new Installment(contractDate, value));
        return installments;
    }
}
