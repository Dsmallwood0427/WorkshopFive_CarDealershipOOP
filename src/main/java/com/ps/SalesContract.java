package com.ps;

public class SalesContract extends Contract {
    private double recordingFee = 100.00;
    private double processingFee; // This will be set based on vehicle price
    private boolean isFinanced;
    private double loanAmount;

    // Constructor


    public SalesContract(String date, String name, String email, double recordingFee, double processingFee, boolean isFinanced, double loanAmount) {
        super(date, name, email);
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.isFinanced = isFinanced;
        this.loanAmount = loanAmount;
    }

    public SalesContract(Vehicle, boolean isFinanced) {
        super();
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    private void setProcessingFee(double price) {
        if (price < 10000) {
            processingFee = 295.00;
        } else {
            processingFee = 495.00;
        }
    }

    public double getTotalFees() {
        return recordingFee + processingFee;
    }

    @Override
    public double getTotalPrice() {
        Vehicle vehicle = null;
        double totalPrice = vehicle.getPrice() + getTotalFees();
        return totalPrice + (totalPrice * salesTaxRate); // Adding sales tax
    }

    @Override
    public double getMonthlyPayment() {
        double totalPrice = getTotalPrice();
        double interestRate = (loanAmount >= 10000) ? 0.0425 : 0.0525; // interest rates
        int loanTerm = (isFinanced) ? 24 : 0; // months for leasing

        if (loanTerm == 0) {
            return 0; // No monthly payment if not financed
        }

        return (loanAmount * (interestRate / 12)) / (1 - Math.pow(1 + (interestRate / 12), -loanTerm));
    }


}
