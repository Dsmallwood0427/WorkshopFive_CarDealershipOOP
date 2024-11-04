package com.ps;

public abstract class Contract {
    private String date;
    private String name;
    private String email;
    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();
    protected double salesTaxRate = 0.05;

    public Contract(String date, String name, String email) {
        this.date = date;
        this.name = name;
        this.email = email;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
