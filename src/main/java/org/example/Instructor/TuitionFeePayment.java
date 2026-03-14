package org.example.Instructor;

public class TuitionFeePayment {
    private final double PRICE PER UNITS = 1000;
    private double balance;
    private double totalTuitionFee;

    public double calcuateTuitionFee(int units, double discountRate){
        totalTuitionFee = units * PRICE PER UNITS;

        if(discountRate ! = 0) {
            totalTuitionFee = totalTuitionFee - (totalTuitionFee * discountRate);
        }
        return totalTuitionFee;
    }
    public void makePayment(double amount) {
        balance = totalTuitionFee - amount;
    }
    public double getBalance(){
        return balance;
    }

    public boolean isFullyPaid(){
        return balance > 0 ? false: true;
    }
}
