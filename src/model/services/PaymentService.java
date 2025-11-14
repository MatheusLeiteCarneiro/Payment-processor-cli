package model.services;

import model.entities.Installment;

import java.time.LocalDate;
import java.util.List;

public interface PaymentService {

    List<Installment> generateInstallments(double value, LocalDate contractDate, int installmentAmount);

}
