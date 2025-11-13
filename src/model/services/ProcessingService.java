package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ProcessingService {
    PaymentService paymentService;

    public ProcessingService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void processInstallments(Contract contract, int months){
        LocalDate contractDate = contract.getDate();
        double installmentPrice = paymentService.paymentProcessing(contract.getBasePrice(), months) / months;
        if(paymentService instanceof CreditService) {
            for (int i = 1; i <= months; i++) {
                LocalDate dueDate = contractDate.plusMonths(i);
                contract.addInstallment(new Installment(dueDate, installmentPrice));
            }
        }
        else{
            contract.addInstallment(new Installment(LocalDate.now(),installmentPrice));
        }
    }
}
