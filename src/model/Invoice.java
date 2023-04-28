package model;

import java.util.Calendar;

public class Invoice {
    private Calendar operationDate;
    private double amount;
    
    public Invoice(Calendar operationDate, double amount) {
        this.operationDate = operationDate;
        this.amount = amount;
    }

    public Calendar getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Calendar operationDate) {
        this.operationDate = operationDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    

    
}
