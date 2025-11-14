package model.services;

import model.entities.Contract;
import model.entities.Installment;


import java.util.List;

public class ProcessingService {
    PaymentService paymentService;

    public ProcessingService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    public void processInstallments(Contract contract, int months){
        List<Installment> generatedInstallments = paymentService.generateInstallments
                (contract.getBasePrice(), contract.getDate(),months);
        for(Installment installment : generatedInstallments){
            contract.addInstallment(installment);
        }
    }
}
