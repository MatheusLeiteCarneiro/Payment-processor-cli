package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int number;
    private String payerName;
    private double basePrice;
    private List<Installment> installmentList = new ArrayList<>();

    public Contract() {
    }

    public Contract(int number, String payerName, double basePrice) {
        this.number = number;
        this.payerName = payerName;
        this.basePrice = basePrice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

}
