package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void processInstallments(Contract contract, int months){
        LocalDate contractDate = contract.getDate();
        double contractValue = contract.getBasePrice();
        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contractDate.plusMonths(i);
            double installmentPrice = paymentService.paymentProcessing(contractValue, i);
            contract.addInstallment(new Installment(dueDate, installmentPrice));
        }

    }
}
