package com.ps;

public class LeaseContract extends Contract {
        private double monthlyLeasePayment; // Monthly payment amount
        private double leaseTerm; // Duration of the lease in months

        // Constructor
        public LeaseContract(Vehicle vehicle, User buyer, double leaseTerm) {
            super(vehicle, buyer);
            this.leaseTerm = leaseTerm;
            this.monthlyLeasePayment = calculateMonthlyLeasePayment(vehicle.getPrice(), leaseTerm);
        }

        private double calculateMonthlyLeasePayment(double price, double term) {
            double interestRate = 0.0525; // Lease interest rate
            return (price * (interestRate / 12)) / (1 - Math.pow(1 + (interestRate / 12), -term));
        }

        @Override
        public double getTotalPrice() {
            return monthlyLeasePayment * leaseTerm; // Total cost of the lease
        }

        @Override
        public double getMonthlyPayment() {
            return monthlyLeasePayment; // Monthly payment for lease
        }

        // Getters and Setters
        public double getLeaseTerm() {
            return leaseTerm;
        }

        public void setLeaseTerm(double leaseTerm) {
            this.leaseTerm = leaseTerm;
        }
    }
