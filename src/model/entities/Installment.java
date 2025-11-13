package model.entities;

import java.time.LocalDate;

public class Installment {
    private LocalDate dueDate;
    private double price;

    public Installment() {
    }

    public Installment(LocalDate dueDate, double price) {
        this.dueDate = dueDate;
        this.price = price;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
